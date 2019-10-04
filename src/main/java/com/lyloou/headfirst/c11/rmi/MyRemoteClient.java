package com.lyloou.headfirst.c11.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * p448
 * 直接运行即可（IDEA环境下）
 *
 * @author lyloou
 * @date 2019/10/04 16:08
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {
        try {
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = myRemote.sayHello();
            Data data = myRemote.getData();
            System.out.println(s);
            System.out.println(data);
            System.out.println(data.formatName());

        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
