package com.ws;

public class DictServicesImplProxy implements com.ws.DictServicesImpl {
  private String _endpoint = null;
  private com.ws.DictServicesImpl dictServicesImpl = null;
  
  public DictServicesImplProxy() {
    _initDictServicesImplProxy();
  }
  
  public DictServicesImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initDictServicesImplProxy();
  }
  
  private void _initDictServicesImplProxy() {
    try {
      dictServicesImpl = (new com.ws.DictServicesImplServiceLocator()).getDictServicesImpl();
      if (dictServicesImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dictServicesImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dictServicesImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dictServicesImpl != null)
      ((javax.xml.rpc.Stub)dictServicesImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ws.DictServicesImpl getDictServicesImpl() {
    if (dictServicesImpl == null)
      _initDictServicesImplProxy();
    return dictServicesImpl;
  }
  
  public java.lang.String dictENtoVn(java.lang.String word) throws java.rmi.RemoteException{
    if (dictServicesImpl == null)
      _initDictServicesImplProxy();
    return dictServicesImpl.dictENtoVn(word);
  }
  
  
}