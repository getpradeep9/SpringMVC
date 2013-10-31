package com;

import javax.xml.ws.Endpoint;

public class Tl {

	public static void main(String[] args) {
		
		
		System.out.println("_Started.");
		   Endpoint.publish("http://localhost:9999/ws/hello", new com.HelloWorldImpl());
		   System.out.println("_Stopped");

	}

}
