package com.avosh.baseproject.backchannel.impl;


import com.avosh.baseproject.backchannel.BackendConnector;
import com.avosh.baseproject.backchannel.model.Message;
import com.avosh.baseproject.backchannel.soap.balance.BalanceRequest;
import com.avosh.baseproject.backchannel.soap.balance.BalanceResponse;
import com.avosh.baseproject.backchannel.soap.billPayment.BatchBillPaymentRequest;
import com.avosh.baseproject.backchannel.soap.billPayment.BatchBillPaymentResponse;
import com.avosh.baseproject.backchannel.soap.billPaymentFollowup.BatchBillPaymentFollowupRequest;
import com.avosh.baseproject.backchannel.soap.billPaymentFollowup.BatchBillPaymentFollowupResponse;
import com.avosh.baseproject.backchannel.soap.cartInquiry.DestinationCardVerificationRequest;
import com.avosh.baseproject.backchannel.soap.cartInquiry.DestinationCardVerificationResponse;
import com.avosh.baseproject.backchannel.soap.cartTransfer.CardTransferRequest;
import com.avosh.baseproject.backchannel.soap.cartTransfer.CardTransferResponse;
import com.avosh.baseproject.backchannel.soap.fundTransfer.FundTransferRequest;
import com.avosh.baseproject.backchannel.soap.fundTransfer.FundTransferResponse;
import com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.BatchFundTransferFollowUpRequest;
import com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.BatchFundTransferFollowUpResponse;
import com.avosh.baseproject.backchannel.soap.ibanInquiry.IbanInquiryRequest;
import com.avosh.baseproject.backchannel.soap.ibanInquiry.IbanInquiryResponse;
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
    private com.avosh.baseproject.backchannel.soap.ibanInquiry.SibService ibanService;
    @Autowired
    private com.avosh.baseproject.backchannel.soap.fundTransfer.SibService fundTransferService;
    @Autowired
    private com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibService fundTransferFollowUpService;
    @Autowired
    private com.avosh.baseproject.backchannel.soap.billPayment.SIBService billPaymentService;
    @Autowired
    private com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBService billPaymentFollowUpService;
    @Autowired
    private com.avosh.baseproject.backchannel.soap.balance.SIBService balanceService;
    @Autowired
    private com.avosh.baseproject.backchannel.soap.cartInquiry.SibService cartInquiryService;
    @Autowired
    private com.avosh.baseproject.backchannel.soap.cartTransfer.SibService cartTransferService;



    @Override
    public Message executeRequest(Message requestMessage) {
        if (requestMessage == null) {
            logger.error("Error, Bad requestMessage found in BackendConnectorSoap.executeRequest(Message requestMessage)."
                    + " requestMessage-->[" + requestMessage + "]");
            throw new BadRequestException();
        }
        if (requestMessage instanceof IbanInquiryRequest) {
            return ibanInquiry((IbanInquiryRequest) requestMessage);
        }
        if (requestMessage instanceof FundTransferRequest) {
            return fundTransfer((FundTransferRequest) requestMessage);
        }
        if (requestMessage instanceof BatchFundTransferFollowUpRequest) {
            return fundTransferFollowup((BatchFundTransferFollowUpRequest) requestMessage);
        }
        if (requestMessage instanceof BatchBillPaymentRequest) {
            return billPayment((BatchBillPaymentRequest) requestMessage);
        }
        if (requestMessage instanceof BatchBillPaymentFollowupRequest) {
            return billPaymentFollowup((BatchBillPaymentFollowupRequest) requestMessage);

        } else {
            throw new UnsupportedOperationException(requestMessage.getClass().getName());
        }

    }

    private IbanInquiryResponse ibanInquiry(IbanInquiryRequest request) {
        try {
            IbanInquiryResponse response = ibanService.ibanInquiry(request);
            return response;
        } catch (RemoteException e) {
            throw new BackendCommunicationException();
        } catch (BaseException e) {
            throw e;
        } catch (Exception e) {
            throw new UnknownSystemException();
        }
    }

    private FundTransferResponse fundTransfer(FundTransferRequest request) {
        try {
            FundTransferResponse response = fundTransferService.fundTransfer(request);
            return response;
        } catch (RemoteException e) {
            throw new BackendCommunicationException();
        } catch (BaseException e) {
            throw e;
        } catch (Exception e) {
            throw new UnknownSystemException();
        }
    }

    private BatchFundTransferFollowUpResponse fundTransferFollowup(BatchFundTransferFollowUpRequest request) {
        try {
            BatchFundTransferFollowUpResponse response = fundTransferFollowUpService.batchFundTransferFollowUp(request);
            return response;
        } catch (RemoteException e) {
            throw new BackendCommunicationException();
        } catch (BaseException e) {
            throw e;
        } catch (Exception e) {
            throw new UnknownSystemException();
        }
    }

    private BatchBillPaymentResponse billPayment(BatchBillPaymentRequest request) {
        try {
            BatchBillPaymentResponse response = billPaymentService.batchBillPayment(request);
            return response;
        } catch (RemoteException e) {
            throw new BackendCommunicationException();
        } catch (BaseException e) {
            throw e;
        } catch (Exception e) {
            throw new UnknownSystemException();
        }
    }

    private BatchBillPaymentFollowupResponse billPaymentFollowup(BatchBillPaymentFollowupRequest request) {
        try {
            BatchBillPaymentFollowupResponse response = billPaymentFollowUpService.batchBillPaymentFollowup(request);
            return response;
        } catch (RemoteException e) {
            throw new BackendCommunicationException();
        } catch (BaseException e) {
            throw e;
        } catch (Exception e) {
            throw new UnknownSystemException();
        }
    }

    private BalanceResponse balance(BalanceRequest request) {
        try {
            BalanceResponse response = balanceService.balance(request);
            return response;
        } catch (RemoteException e) {
            throw new BackendCommunicationException();
        } catch (BaseException e) {
            throw e;
        } catch (Exception e) {
            throw new UnknownSystemException();
        }
    }

    private DestinationCardVerificationResponse cartInquiry(DestinationCardVerificationRequest request) {
        try {
            DestinationCardVerificationResponse response = cartInquiryService.destinationCardVerification(request);
            return response;
        } catch (RemoteException e) {
            throw new BackendCommunicationException();
        } catch (BaseException e) {
            throw e;
        } catch (Exception e) {
            throw new UnknownSystemException();
        }
    }

    private CardTransferResponse cartTransfer(CardTransferRequest request) {
        try {
            CardTransferResponse response = cartTransferService.cardTransfer(request);
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
