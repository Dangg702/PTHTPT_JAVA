/**
 * ScoreServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.example;

public interface ScoreServiceService extends javax.xml.rpc.Service {
    public java.lang.String getScoreServiceAddress();

    public com.ws.example.ScoreService getScoreService() throws javax.xml.rpc.ServiceException;

    public com.ws.example.ScoreService getScoreService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
