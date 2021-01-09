package com.ws;

import javax.xml.ws.Endpoint;

public class LoginServicePublisher{
	public static void main(String args[])
	{
		Endpoint.publish("http://localhost:7777/ws/login", new LoginServiceImpl());
		System.out.println("webservice ready to publish");
	}
}






