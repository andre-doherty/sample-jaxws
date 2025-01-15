package com.bnpp.pf.tes.demo;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import com.bnpp.pf.tes.demo.person.PersonServiceV1;
import com.bnpp.pf.tes.demo.person.PingStatus;

@WebService(serviceName = "PersonServiceV1", portName = "PersonServiceV1Port", endpointInterface = "com.bnpp.pf.tes.demo.person.PersonServiceV1", targetNamespace = "urn:PersonServiceV1", wsdlLocation = "PersonService.wsdl")
public class PersonServiceImpl implements PersonServiceV1 {

	@Resource
	private WebServiceContext webServiceContext;

	@Override
	public PingStatus ping() {
		return PingStatus.ALL_OK;
	}

}
