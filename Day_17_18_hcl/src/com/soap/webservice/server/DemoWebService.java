package com.soap.webservice.server;

import javax.xml.ws.Endpoint;

public class DemoWebService {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		//http://localhost:8080/calapp?wsdl
		//http://127.0.0.1:8085/calapp?wsdl
		Endpoint.publish("http://127.0.0.1:8085/calapp", cal);
	}
}
