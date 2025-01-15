package com.bnpp.pf.tes.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import com.bnpp.pf.tes.demo.person.PersonServiceV1;
import com.bnpp.pf.tes.demo.person.PersonServiceV1_Service;
import com.bnpp.pf.tes.demo.person.PingStatus;


@WebServlet(urlPatterns = "/demo")
/**
 * Servlet implementation class TestClient
 */
public class TestClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestClient() {
        super();
    }
    
    @WebServiceRef(name="PersonServiceV1")
    private PersonServiceV1_Service service;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//create port and specify the endPoint URL
		PersonServiceV1 personServicePort = service.getPersonServiceV1Port();
		BindingProvider bindingProvider = (BindingProvider) personServicePort;
		
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"https://localhost:9443/PersonServiceV1");
		
		//call
		PingStatus pingStatus = personServicePort.ping();
		response.getWriter().append(" pinged: ").append(pingStatus.value());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
