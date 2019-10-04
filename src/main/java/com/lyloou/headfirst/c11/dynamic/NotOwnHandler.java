package com.lyloou.headfirst.c11.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lyloou
 * @date 2019/10/04 21:28
 */
public class NotOwnHandler implements InvocationHandler {
    private Person person;

    public NotOwnHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            method.invoke(person, args);
        } else if (method.getName().equals("setHotOrNotRating")) {
            method.invoke(person, args);
        } else if (method.getName().startsWith("set")) {
            throw new IllegalAccessException("不可修改别人的个人属性");
        }
        return null;
    }
}
