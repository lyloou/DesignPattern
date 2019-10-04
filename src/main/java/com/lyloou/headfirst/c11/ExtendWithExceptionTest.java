package com.lyloou.headfirst.c11;

import java.rmi.server.UnicastRemoteObject;

/**
 * @author lyloou
 * @date 2019/10/04 15:29
 */
public class ExtendWithExceptionTest {
    public static void main(String[] args) {
        try {
            new B();
        } catch (AException e) {
            System.out.println(e.getMessage());
        }
    }

}

class AException extends Exception {
    public AException(String message) {
        super(message);
    }
}

class A {
    /**
     * @see UnicastRemoteObject
     */
    public A() throws AException {
        System.out.println("aaa");
        throw new AException("aa");
    }
}

class B extends A {
    public B() throws AException {
        System.out.println("bbb");
    }
}