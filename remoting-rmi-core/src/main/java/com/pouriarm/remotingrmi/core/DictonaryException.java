package com.pouriarm.remotingrmi.core;

import java.rmi.RemoteException;
import java.rmi.StubNotFoundException;

/**
 * You need to write Exception Handler for RMI and Spring Boot Exceptions!
 * Check the the error handling in RMI and Spring Boot to complete this class.
 */
public class DictonaryException extends Exception {
    public DictonaryException(String errorMessage){
        super(errorMessage);
    }

}