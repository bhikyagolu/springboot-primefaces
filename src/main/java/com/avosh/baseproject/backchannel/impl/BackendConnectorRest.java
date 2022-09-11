package com.avosh.baseproject.backchannel.impl;

import com.avosh.baseproject.backchannel.BackendConnector;
import com.avosh.baseproject.backchannel.rest.RestMessageRequest;
import com.avosh.baseproject.backchannel.rest.RestMessageResponse;
import com.avosh.baseproject.excptions.BadRequestException;
import com.avosh.baseproject.backchannel.rest.RestMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.logging.Level;

@Service
public class BackendConnectorRest implements BackendConnector {
    private final static Logger log = Logger.getLogger(BackendConnectorRest.class);
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public RestMessage executeRequest(RestMessage requestMessage) {
        if (requestMessage == null || !(requestMessage instanceof RestMessageRequest)) {
            log.error("Error, Bad requestMessage found in BackenedConnectorRest.executeRequest(Message requestMessage)."
                    + " requestMessage-->[" + requestMessage + "]");
            throw new BadRequestException();
        }
        RestMessageRequest request = (RestMessageRequest) requestMessage;
        try {
            URI requestUri = new URI(request.getUri());
            log.info("Sending rest to Uri ---> "+request.getUri());
            Gson og = new Gson();
            String requestJson = og.toJson(request);
            log.info("requestJson ---> "+requestJson);
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.setContentType(MediaType.APPLICATION_JSON);

//            String requestStr = request.getMessage();
            HttpEntity<String> requestEntity = new HttpEntity<>(requestJson, headers);
            log.info("Sending rest message... request.toString()-->[" + request.toString() + "] , "
                    + "requets.getMessage()-->[" + request.getMessage() + "]");
            ResponseEntity<String> responseEntity = restTemplate.exchange(requestUri, request.getHttpMethod(),
                    requestEntity, String.class);
            log.info("Receiving rest message... result-->[" + responseEntity.getBody() + "]");
            String responseStr = responseEntity.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            RestMessageResponse responseObj;
            responseObj = (RestMessageResponse) objectMapper.readValue(responseStr, request.getResponseClass());
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

    private void logResponseCreationException(RestMessageRequest request, Exception ex) {
        log.error("Exception occured whitle trying to instantiate rest response message. "
                + "request.toString-->[" + request.toString() + "] , "
                + "request.getMessage()-->[" + request.getMessage() + "]", ex);
    }

}