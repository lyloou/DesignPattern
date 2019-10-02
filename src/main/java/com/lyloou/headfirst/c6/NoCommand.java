package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 14:53
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("do nothing");
    }
}
