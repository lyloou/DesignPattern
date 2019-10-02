package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 14:45
 */
public class SimpleRemoteController {
    private Command command;

    public SimpleRemoteController(Command command) {
        this.command = command;
    }

    public void onButtonWasPressed() {
        command.execute();
    }
}
