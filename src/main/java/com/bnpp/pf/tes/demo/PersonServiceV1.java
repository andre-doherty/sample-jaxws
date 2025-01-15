package com.bnpp.pf.tes.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Resource;
import jakarta.inject.Named;
import jakarta.jws.WebService;
import jakarta.xml.ws.WebServiceContext;

@Named
@WebService(serviceName = "PersonServiceV1", portName = "PersonServiceV1Port", targetNamespace = "urn:PersonServiceV1", wsdlLocation = "PersonService.wsdl")
public class PersonServiceV1 {

	private static final String ALL_OK = "ALL_OK";

	@Resource
	private WebServiceContext webServiceContext;

	public String ping() {
		return ALL_OK;
	}

	public List<Person> getAllPersons() {

		List<Person> result = new ArrayList<Person>();

		Person person = new Person();
		person.setName("john");
		person.setSurname("doe");
		result.add(person);

		Person person2 = new Person();
		person2.setName("jane");
		person2.setSurname("doe");
		result.add(person2);

		return result;

	}
}
