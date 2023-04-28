package com.gpcoder.ws;
 
import javax.xml.ws.Endpoint;
 
public class SoapPublisher {
 
	//Publish WS tại địa chỉ http://localhost:8080/ws/users
    public static final String WS_URL = "http://localhost:8080/ws/users";
 
    public static void main(String[] args) {
    	System.out.println("Server is published at "+WS_URL);
        Endpoint.publish(WS_URL, new UserServiceImpl());
    }
}
