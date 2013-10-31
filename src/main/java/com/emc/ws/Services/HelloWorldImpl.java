package com;

import javax.jws.WebService;

@WebService(endpointInterface = "com.HelloWorld")
//@WebService(endpointInterface = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		System.out.println("\n\t"+name+"\n\t");
		return "Hello World JAX-WS " + name;

	}

}
