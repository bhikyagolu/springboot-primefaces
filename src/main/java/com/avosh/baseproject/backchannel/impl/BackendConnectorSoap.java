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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
@Service
public class BackendConnectorSoap implements BackendConnector {
    private static final Logger logger = Logger.getLogger(BackendConnectorSoap.class);
    @Autowired
    private ApplicationConfig applicationConfig;
    @Autowired
    @Qualifier("LocatorIbanInquiry")
    private com.avosh.baseproject.backchannel.soap.ibanInquiry.SibServiceServiceLocator sibServiceServiceLocatorIbanService;

    @Autowired
    @Qualifier("LocatorFundTransfer")
    private com.avosh.baseproject.backchannel.soap.fundTransfer.SibServiceServiceLocator sibServiceServiceLocatorFundTransfer;

    @Autowired
    @Qualifier("LocatorFundTransferFollowUp")
    private com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibServiceServiceLocator sibServiceServiceLocatorFundTransferFollowUp;
    @Autowired
    @Qualifier("LocatorBillPayment")
    private com.avosh.baseproject.backchannel.soap.billPayment.SIBServiceServiceLocator sibServiceServiceLocatorBillPayment;
    @Autowired
    @Qualifier("LocatorBillPaymentFollowup")
    private com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBServiceServiceLocator sibServiceServiceLocatorBillPaymentFollowUp;
    @Autowired
    @Qualifier("LocatorBalance")
    private com.avosh.baseproject.backchannel.soap.balance.SIBServiceServiceLocator sibServiceServiceLocatorBalance;
    @Autowired
    @Qualifier("LocatorCartInquiry")
    private com.avosh.baseproject.backchannel.soap.cartInquiry.SibServiceServiceLocator sibServiceServiceLocatorCartInquiry;
    @Autowired
    @Qualifier("LocatorCartTransfer")
    private com.avosh.baseproject.backchannel.soap.cartTransfer.SibServiceServiceLocator sibServiceServiceLocator;


    private com.avosh.baseproject.backchannel.soap.ibanInquiry.SibService ibanService;
    private com.avosh.baseproject.backchannel.soap.fundTransfer.SibService fundTransferService;
    private com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibService fundTransferFollowUpService;
    private com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBService billPaymentFollowUpService;
    private com.avosh.baseproject.backchannel.soap.balance.SIBService balanceService;
    private com.avosh.baseproject.backchannel.soap.cartInquiry.SibService cartInquiryService;
    private com.avosh.baseproject.backchannel.soap.billPayment.SIBService billPaymentService;
    private com.avosh.baseproject.backchannel.soap.cartTransfer.SibService cartTransferService;


    @PostConstruct
    private void setupSoapServices() {
        try {
            cartTransferService = sibServiceServiceLocator.getSibServiceSoap11();
            cartInquiryService = sibServiceServiceLocatorCartInquiry.getSibServiceSoap11();
            balanceService = sibServiceServiceLocatorBalance.getSIBServiceSoap11();
            balanceService = sibServiceServiceLocatorBalance.getSIBServiceSoap11();
            billPaymentFollowUpService = sibServiceServiceLocatorBillPaymentFollowUp.getSIBServiceSoap11();
            billPaymentService = sibServiceServiceLocatorBillPayment.getSIBServiceSoap11();
            fundTransferFollowUpService = sibServiceServiceLocatorFundTransferFollowUp.getSibServiceSoap11();
            fundTransferService = sibServiceServiceLocatorFundTransfer.getSibServiceSoap11();
            ibanService = sibServiceServiceLocatorIbanService.getSibServiceSoap11();
        } catch (ServiceException e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }


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
        }
        if (requestMessage instanceof BalanceRequest) {
            BalanceResponse res = balance((BalanceRequest) requestMessage);
            return res;
        }
        if (requestMessage instanceof DestinationCardVerificationRequest) {
            return cartInquiry((DestinationCardVerificationRequest) requestMessage);
        }
        if (requestMessage instanceof CardTransferRequest) {
            return cartTransfer((CardTransferRequest) requestMessage);
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
