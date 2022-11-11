package com.avosh.baseproject.endpoint;


import com.avosh.baseproject.model.Student;
import com.avosh.baseproject.model.request.StudentDetailsRequest;
import com.avosh.baseproject.model.response.StudentDetailsResponse;
import org.apache.log4j.Logger;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentEndpoint extends AbstractEndpoint{
    private static final Logger log = Logger.getLogger(StudentEndpoint.class);
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
    @ResponsePayload
    public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
        log.info("StudentEndpoint is Started");
        StudentDetailsResponse response = new StudentDetailsResponse();
        Student res =  new Student();
        res.setAddress("address");
        res.setName(request.getName());
        res.setStandard(1);
        response.setStudent(res);
        log.info("StudentEndpoint is Ended");
        return response;
    }
}