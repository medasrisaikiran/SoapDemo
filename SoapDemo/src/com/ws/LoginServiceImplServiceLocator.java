/**
 * LoginServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws;

public class LoginServiceImplServiceLocator extends org.apache.axis.client.Service implements com.ws.LoginServiceImplService {

    public LoginServiceImplServiceLocator() {
    }


    public LoginServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginServiceImplPort
    private java.lang.String LoginServiceImplPort_address = "http://localhost:7777/ws/login";

    public java.lang.String getLoginServiceImplPortAddress() {
        return LoginServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoginServiceImplPortWSDDServiceName = "LoginServiceImplPort";

    public java.lang.String getLoginServiceImplPortWSDDServiceName() {
        return LoginServiceImplPortWSDDServiceName;
    }

    public void setLoginServiceImplPortWSDDServiceName(java.lang.String name) {
        LoginServiceImplPortWSDDServiceName = name;
    }

    public com.ws.LoginService getLoginServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginServiceImplPort(endpoint);
    }

    public com.ws.LoginService getLoginServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ws.LoginServiceImplPortBindingStub _stub = new com.ws.LoginServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getLoginServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginServiceImplPortEndpointAddress(java.lang.String address) {
        LoginServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ws.LoginService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ws.LoginServiceImplPortBindingStub _stub = new com.ws.LoginServiceImplPortBindingStub(new java.net.URL(LoginServiceImplPort_address), this);
                _stub.setPortName(getLoginServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LoginServiceImplPort".equals(inputPortName)) {
            return getLoginServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.com/", "LoginServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.com/", "LoginServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoginServiceImplPort".equals(portName)) {
            setLoginServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
