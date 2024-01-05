package com.bnpp.pf.tes.demo;

import javax.jws.Oneway;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Interface of the person webservice.<br>
 * <br>
 * The class is annotated with @WebService to be exposed has a webService.<br>
 * Operation parameters are annotated with @WebParam in order to be displayed in the resulting wsdl.<br>
 */
@WebService(name = "PersonService", targetNamespace = "urn:PersonServiceV1")
public interface PersonPublication {

    /**
     * Create a person
     */
    PersonResp addPerson(@WebParam(name = "person") PersonReq personReq);

    /**
     * Create a person, asynchronously
     */
    @Oneway
    void addPersonAsync(@WebParam(name = "person") PersonReq personReq);
    
   

}
