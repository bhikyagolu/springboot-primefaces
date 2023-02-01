package com.avosh.baseproject.backchannel.impl;


import com.avosh.baseproject.backchannel.BackendConnector;
import com.avosh.baseproject.backchannel.model.Message;
import com.avosh.baseproject.conf.ApplicationConfig;
import com.avosh.baseproject.excptions.BadRequestException;
import org.apache.log4j.Logger;

public class BackendConnectorSoap implements BackendConnector {
    private static final Logger logger = Logger.getLogger(BackendConnectorSoap.class);
    private ApplicationConfig applicationConfig;


    @Override
    public Message executeRequest(Message requestMessage) {
        Message responseMessage = null;
        if (requestMessage == null) {
            logger.error("Error, Bad requestMessage found in BackendConnectorSoap.executeRequest(Message requestMessage)."
                    + " requestMessage-->[" + requestMessage + "]");
            throw new BadRequestException();
        }
        if (true) {

        } else {
            throw new UnsupportedOperationException(requestMessage.getClass().getName());
        }

        return responseMessage;
    }
}
