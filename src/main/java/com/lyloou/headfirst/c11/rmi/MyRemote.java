package com.lyloou.headfirst.c11.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author lyloou
 * @date 2019/10/04 15:52
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;

    public Data getData() throws RemoteException;
}
