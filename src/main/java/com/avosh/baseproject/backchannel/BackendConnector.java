package com.avosh.baseproject.backchannel;

import com.avosh.baseproject.backchannel.rest.RestMessage;

public interface BackendConnector {
    RestMessage executeRequest(RestMessage requestMessage);
}
