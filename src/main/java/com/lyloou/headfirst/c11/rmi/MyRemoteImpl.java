package com.lyloou.headfirst.c11.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * p445
 * 运行以下命令的目录都是： java/DesignPattern/target/classes
 * 生成 Stub 类：rmic MyRemoteImpl
 * 启动 rmiregistry：rmiregistry
 * 运行服务端：java com.lyloou.headfirst.c11.rmi.MyRemoteImpl
 *
 * @author lyloou
 * @date 2019/10/04 15:53
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public static void main(String[] args) {
        try {
            MyRemote myRemote = new MyRemoteImpl();
            Naming.rebind("RemoteHello", myRemote);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }

    }

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello, Here";
    }

    @Override
    public Data getData() throws RemoteException {
        Data data = new Data();
        data.setName("Lyloou");
        return data;
    }

}
