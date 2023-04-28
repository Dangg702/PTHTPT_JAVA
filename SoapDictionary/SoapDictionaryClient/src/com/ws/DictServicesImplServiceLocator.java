/**
 * DictServicesImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws;

public class DictServicesImplServiceLocator extends org.apache.axis.client.Service implements com.ws.DictServicesImplService {

    public DictServicesImplServiceLocator() {
    }


    public DictServicesImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DictServicesImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DictServicesImpl
    private java.lang.String DictServicesImpl_address = "http://localhost:8080/SoapDictionary/services/DictServicesImpl";

    public java.lang.String getDictServicesImplAddress() {
        return DictServicesImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DictServicesImplWSDDServiceName = "DictServicesImpl";

    public java.lang.String getDictServicesImplWSDDServiceName() {
        return DictServicesImplWSDDServiceName;
    }

    public void setDictServicesImplWSDDServiceName(java.lang.String name) {
        DictServicesImplWSDDServiceName = name;
    }

    public com.ws.DictServicesImpl getDictServicesImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DictServicesImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDictServicesImpl(endpoint);
    }

    public com.ws.DictServicesImpl getDictServicesImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ws.DictServicesImplSoapBindingStub _stub = new com.ws.DictServicesImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getDictServicesImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDictServicesImplEndpointAddress(java.lang.String address) {
        DictServicesImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ws.DictServicesImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ws.DictServicesImplSoapBindingStub _stub = new com.ws.DictServicesImplSoapBindingStub(new java.net.URL(DictServicesImpl_address), this);
                _stub.setPortName(getDictServicesImplWSDDServiceName());
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
        if ("DictServicesImpl".equals(inputPortName)) {
            return getDictServicesImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.com", "DictServicesImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.com", "DictServicesImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DictServicesImpl".equals(portName)) {
            setDictServicesImplEndpointAddress(address);
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
