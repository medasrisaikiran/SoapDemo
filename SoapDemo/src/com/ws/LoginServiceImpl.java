package com.ws;
import javax.jws.*;

@WebService(endpointInterface="com.ws.LoginService")
public class LoginServiceImpl implements LoginService{
	@Override
	public String sayHiToUser(String name)
	{
		return "welcome to webservice "+name;
	}
}
