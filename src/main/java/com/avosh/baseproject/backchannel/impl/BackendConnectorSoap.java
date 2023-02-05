package com.avosh.baseproject.backchannel.impl;


import com.avosh.baseproject.backchannel.BackendConnector;
import com.avosh.baseproject.backchannel.model.Message;
import com.avosh.baseproject.backchannel.soap.ibanInquiry.IbanInquiryRequest;
import com.avosh.baseproject.backchannel.soap.ibanInquiry.IbanInquiryResponse;
import com.avosh.baseproject.backchannel.soap.ibanInquiry.SibService;
import com.avosh.baseproject.conf.ApplicationConfig;
import com.avosh.baseproject.excptions.BackendCommunicationException;
import com.avosh.baseproject.excptions.BadRequestException;
import com.avosh.baseproject.excptions.BaseException;
import com.avosh.baseproject.excptions.UnknownSystemException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.rmi.RemoteException;

public class BackendConnectorSoap implements BackendConnector {
    private static final Logger logger = Logger.getLogger(BackendConnectorSoap.class);
    @Autowired
    private ApplicationConfig applicationConfig;
    @Autowired
    private SibService service;


    @Override
    public Message executeRequest(Message requestMessage) {
        Message responseMessage = null;
        if (requestMessage == null) {
            logger.error("Error, Bad requestMessage found in BackendConnectorSoap.executeRequest(Message requestMessage)."
                    + " requestMessage-->[" + requestMessage + "]");
            throw new BadRequestException();
        }
        if (requestMessage instanceof IbanInquiryRequest) {
            responseMessage = ibanInquiry((IbanInquiryRequest)requestMessage);

        } else {
            throw new UnsupportedOperationException(requestMessage.getClass().getName());
        }

        return responseMessage;
    }

    private IbanInquiryResponse ibanInquiry(IbanInquiryRequest request){
        try {
            IbanInquiryResponse response = service.ibanInquiry(request);
            return response;
        } catch (RemoteException e) {
            throw new BackendCommunicationException();
        } catch (BaseException e) {
            throw e;
        } catch (Exception e) {
            throw new UnknownSystemException();
        }
    }
}
