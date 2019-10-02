package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 15:11
 */
public class MicroCommand implements Command {
    private Command[] commands;

    public MicroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }


}
