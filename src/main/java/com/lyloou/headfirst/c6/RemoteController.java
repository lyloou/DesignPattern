package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 14:51
 */
public class RemoteController {
    public static final int COUNT = 7;
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteController() {
        onCommands = new Command[COUNT];
        offCommands = new Command[COUNT];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setupCommand(int slot, Command onCommand, Command offCommand) {
        if (slot >= COUNT || slot < 0) {
            throw new IllegalArgumentException("无效的插槽");
        }
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        this.offCommands[slot].execute();
    }
}
