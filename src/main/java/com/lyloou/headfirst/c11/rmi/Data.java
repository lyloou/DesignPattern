package com.lyloou.headfirst.c11.rmi;

import java.io.Serializable;

/**
 * @author lyloou
 * @date 2019/10/04 16:40
 */
public class Data implements Serializable {
    private String name;

    public String formatName() {
        return "[" + this.name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}
