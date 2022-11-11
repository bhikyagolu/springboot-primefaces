package com.avosh.baseproject.endpoint;


import com.avosh.baseproject.model.Student;
import com.avosh.baseproject.model.request.StudentDetailsRequest;
import com.avosh.baseproject.model.response.StudentDetailsResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentEndpoint extends AbstractEndpoint{
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
    @ResponsePayload
    public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
        StudentDetailsResponse response = new StudentDetailsResponse();
        Student res =  new Student();
        res.setAddress("address");
        res.setName("name");
        res.setStandard(1);
        response.setStudent(res);
        return response;
    }
}