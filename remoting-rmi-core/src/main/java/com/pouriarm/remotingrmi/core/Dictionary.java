package com.pouriarm.remotingrmi.core;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;
/**
 * An interface for the remote object: Dictionary.java.
 * @author Pouria Roostaei
 */
public interface Dictionary {
    //TODO: Create two required methods (Hint: (String) and (String[]))
    Map<String,Integer> word(String line) throws RemoteException;
    Map<String,Integer> word(String []lineArray) throws RemoteException;
}