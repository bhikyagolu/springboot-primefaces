package com.avosh.baseproject.backchannel;

import com.avosh.baseproject.backchannel.rest.Message;

public interface BackendConnector {
    Message executeRequest(Message requestMessage);
}
