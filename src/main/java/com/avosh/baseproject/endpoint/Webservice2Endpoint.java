package com.avosh.baseproject.endpoint;


import com.avosh.baseproject.model.StudentDetailsRequest;
import com.avosh.baseproject.model.StudentDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class Webservice2Endpoint {
	private static final String NAMESPACE_URI = "http://www.howtodoinjava.com/xml/school";


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
	@ResponsePayload
	public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
		StudentDetailsResponse response = new StudentDetailsResponse();

		return response;
	}
}