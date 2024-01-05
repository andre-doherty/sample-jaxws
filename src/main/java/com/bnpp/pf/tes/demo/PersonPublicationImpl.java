package com.bnpp.pf.tes.demo;

import java.util.Set;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.jws.WebService;
import javax.validation.Configuration;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.ws.WebServiceContext;


/**
 */
@Named
@WebService(serviceName = "PersonService", portName = "PersonServicePort", endpointInterface = "com.bnpp.pf.tes.demo.PersonPublication", targetNamespace = "urn:PersonServiceV1", wsdlLocation = "PersonService1.wsdl")
public class PersonPublicationImpl implements PersonPublication {

    @Resource
    private WebServiceContext webServiceContext;
    
    public PersonResp addPerson(PersonReq personReq) {
    	
    	try {
			Configuration<?> configure = Validation.byDefaultProvider().configure();
			ValidatorFactory validatorFactory = configure.buildValidatorFactory();
			final Set<ConstraintViolation<PersonReq>> violations = validatorFactory.getValidator().validate(personReq);
	        if (!violations.isEmpty()) {
	            final ConstraintViolation<PersonReq> firstViolation = violations.iterator().next();
	            throw new Exception(firstViolation.getMessage()+ ": " + firstViolation.getPropertyPath().toString());
	        }
	        // would call a service
	        return new PersonResp();
		}

		catch (Throwable t) {
			t.printStackTrace();
			return new PersonResp();
		}
    	
    }


    @Override
    public void addPersonAsync(PersonReq personReq) {
    	
    	try {
			Configuration<?> configure = Validation.byDefaultProvider().configure();
			ValidatorFactory validatorFactory = configure.buildValidatorFactory();
			final Set<ConstraintViolation<PersonReq>> violations = validatorFactory.getValidator().validate(personReq);
	        if (!violations.isEmpty()) {
	            final ConstraintViolation<PersonReq> firstViolation = violations.iterator().next();
	            throw new Exception(firstViolation.getMessage()+ ": " + firstViolation.getPropertyPath().toString());
	        }
	        // would call a service
	       
		}

		catch (Throwable t) {
			t.printStackTrace();
		}
    	
    }




}
