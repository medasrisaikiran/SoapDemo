package com.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class LoginServiceClient {
	public static void main(String args[]) throws MalformedURLException, RemoteException
	{
		URL url=new URL("http://localhost:7777/ws/login?wsdl");
		QName q=new QName("http://saikiran.com/","LoginServiceImplService");
		Service s=Service.create(url,q);
		LoginService l=s.getPort(LoginService.class);
		System.out.println(l.sayHiToUser("saikiran"));
	}
}
