package com.avosh.baseproject.excptions;

public class BackendCommunicationException extends BaseException {
    public BackendCommunicationException(String message) {
        super(message);
    }

    public BackendCommunicationException(Throwable cause) {
        super(cause);
    }

    public BackendCommunicationException() {
    }
}
