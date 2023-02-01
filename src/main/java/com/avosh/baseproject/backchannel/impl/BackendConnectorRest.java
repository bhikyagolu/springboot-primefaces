package com.avosh.baseproject.backchannel.impl;

import com.avosh.baseproject.backchannel.BackendConnector;
import com.avosh.baseproject.backchannel.model.Message;
import com.avosh.baseproject.backchannel.rest.MessageRequest;
import com.avosh.baseproject.backchannel.rest.MessageResponse;
import com.avosh.baseproject.excptions.BadRequestException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.logging.Level;

@Service
public class BackendConnectorRest implements BackendConnector {
    private final static Logger log = Logger.getLogger(BackendConnectorRest.class);
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public Message executeRequest(Message requestMessage) {
        if (requestMessage == null || !(requestMessage instanceof MessageRequest)) {
            log.error("Error, Bad requestMessage found in BackenedConnectorRest.executeRequest(Message requestMessage)."
                    + " requestMessage-->[" + requestMessage + "]");
            throw new BadRequestException();
        }
        MessageRequest request = (MessageRequest) requestMessage;
        try {
            URI requestUri = new URI(request.getUri());
            log.info("Sending rest to Uri ---> " + request.getUri());
            ObjectMapper objectMapper = new ObjectMapper();
            String requestJson = objectMapper.writeValueAsString(request);
            log.info("requestJson ---> " + requestJson);
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            headers.setContentType(MediaType.APPLICATION_JSON);

//            String requestStr = request.getMessage();
            HttpEntity<String> requestEntity = new HttpEntity<>(requestJson, headers);
            log.info("Sending rest message... request.toString()-->[" + request + "] , "
                    + "requets.getMessage()-->[" + request.getMessage() + "]");
            ResponseEntity<String> responseEntity = restTemplate.exchange(requestUri, request.getHttpMethod(),
                    requestEntity, String.class);
            log.info("Receiving rest message... result-->[" + responseEntity.getBody() + "]");
            String responseStr = responseEntity.getBody();

            MessageResponse responseObj;
            responseObj = (MessageResponse) objectMapper.readValue(responseStr, request.getResponseClass());
            return responseObj;
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(BackendConnectorRest.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException();
        } catch (ResourceAccessException ex) {
            logResponseCreationException(request, ex);
            throw new RuntimeException();
        } catch (Exception ex) {
            logResponseCreationException(request, ex);
            throw new RuntimeException();
        }
    }

    private void logResponseCreationException(MessageRequest request, Exception ex) {
        log.error("Exception occurred while trying to instantiate rest response message. "
                + "request.toString-->[" + request.toString() + "] , "
                + "request.getMessage()-->[" + request.getMessage() + "]", ex);
    }

}