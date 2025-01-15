package demo;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import demo.person.PersonServiceV1;
import demo.person.PingStatus;

@WebService(serviceName = "PersonServiceV1", portName = "PersonServiceV1Port", endpointInterface = "demo.person.PersonServiceV1", targetNamespace = "urn:PersonServiceV1", wsdlLocation = "PersonService.wsdl")
public class PersonServiceImpl implements PersonServiceV1 {

	@Resource
	private WebServiceContext webServiceContext;

	@Override
	public PingStatus ping() {
		return PingStatus.ALL_OK;
	}

}
