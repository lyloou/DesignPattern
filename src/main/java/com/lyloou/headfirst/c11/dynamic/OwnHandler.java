package com.lyloou.headfirst.c11.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lyloou
 * @date 2019/10/04 21:28
 */
public class OwnHandler implements InvocationHandler {
    private Person person;

    public OwnHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            method.invoke(person, args);
        } else if (method.getName().equals("setHotOrNotRating")) {
            throw new IllegalAccessException("自个不可修改评级1");
        } else if (method.getName().startsWith("set")) {
            method.invoke(person, args);
        }
        return null;
    }
}
