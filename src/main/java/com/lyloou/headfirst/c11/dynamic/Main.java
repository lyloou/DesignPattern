package com.lyloou.headfirst.c11.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author lyloou
 * @date 2019/10/04 21:32
 */
public class Main {
    public static void main(String[] args) {
        Person person = getPersonFromDb();
        System.out.println("-----------");
        System.out.println(person);

        Person ownProxy = getProxy(person, new OwnHandler(person));
        try {
            ownProxy.setInterests("Basketball");
            ownProxy.setHotOrNotRating(8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------");
        System.out.println(person);

        Person notOwnProxy = getProxy(person, new NotOwnHandler(person));
        try {
            notOwnProxy.setHotOrNotRating(8);
            notOwnProxy.setGender("female");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("-----------");
        System.out.println(person);
    }

    private static Person getPersonFromDb() {
        Person person = new PersonImpl();
        person.setName("bob");
        person.setGender("male");
        person.setInterests("Running, Fish");
        person.setHotOrNotRating(4);
        return person;
    }

    private static Person getProxy(Person person, InvocationHandler handler) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                handler
        );
    }
}
