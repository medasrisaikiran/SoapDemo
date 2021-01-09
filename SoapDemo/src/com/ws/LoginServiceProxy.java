package com.ws;

public class LoginServiceProxy implements com.ws.LoginService {
  private String _endpoint = null;
  private com.ws.LoginService loginService = null;
  
  public LoginServiceProxy() {
    _initLoginServiceProxy();
  }
  
  public LoginServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginServiceProxy();
  }
  
  private void _initLoginServiceProxy() {
    try {
      loginService = (new com.ws.LoginServiceImplServiceLocator()).getLoginServiceImplPort();
      if (loginService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)loginService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)loginService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (loginService != null)
      ((javax.xml.rpc.Stub)loginService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ws.LoginService getLoginService() {
    if (loginService == null)
      _initLoginServiceProxy();
    return loginService;
  }
  
  public java.lang.String sayHiToUser(java.lang.String arg0) throws java.rmi.RemoteException{
    if (loginService == null)
      _initLoginServiceProxy();
    return loginService.sayHiToUser(arg0);
  }
  
  
}