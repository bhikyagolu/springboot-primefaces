package com.avosh.baseproject.conf;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/service/*");
	}

	@Bean(name = "studentDetailsWsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("StudentDetailsPort");
		wsdl11Definition.setLocationUri("/service/student-details");
		wsdl11Definition.setTargetNamespace("http://www.avosh.com/xml/school");
		wsdl11Definition.setSchema(schema);
		return wsdl11Definition;
	}

	@Bean(name = "gholi")
	public DefaultWsdl11Definition webservice2Wsdl11Definition(XsdSchema webservice2Schema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("webservice2Port");
		wsdl11Definition.setLocationUri("/service/gholi-details");
		wsdl11Definition.setTargetNamespace("http://www.avosh.com/xml/school");
		wsdl11Definition.setSchema(webservice2Schema);
		return wsdl11Definition;
	}


	@Bean(name="schema")
	public XsdSchema studentSchema() {
		return new SimpleXsdSchema(new ClassPathResource("school.xsd"));
	}

	@Bean(name="webservice2Schema")
	public XsdSchema webservice2Schema() {
		return new SimpleXsdSchema(new ClassPathResource("gholi.xsd"));
	}

}