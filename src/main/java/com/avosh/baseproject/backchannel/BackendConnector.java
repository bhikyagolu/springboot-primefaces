package com.avosh.baseproject.backchannel;

import com.avosh.baseproject.backchannel.model.Message;

public interface BackendConnector {
    Message executeRequest(Message requestMessage);
}
