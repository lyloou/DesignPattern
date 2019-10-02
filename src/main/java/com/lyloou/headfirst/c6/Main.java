package com.lyloou.headfirst.c6;

/**
 * @author lyloou
 * @date 2019/10/02 14:49
 */
public class Main {
    public static void main(String[] args) {
        // simpleRemoteControllerTest();
        // remoteControllerTest();
        microCommandTest();
    }

    private static void microCommandTest() {
        RemoteController controller = new RemoteController();

        Light light = new Light("living room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Stereo stereo = new Stereo("book room");
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);


        MicroCommand microOnCommand = new MicroCommand(new Command[]{
                lightOnCommand, stereoOnCommand
        });
        MicroCommand microOffCommand = new MicroCommand(new Command[]{
                lightOffCommand, stereoOffCommand
        });
        controller.setupCommand(2, microOnCommand, microOffCommand);
        controller.onButtonWasPressed(2);
        controller.offButtonWasPressed(2);
    }

    private static void remoteControllerTest() {
        RemoteController controller = new RemoteController();

        Light light = new Light("living room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        controller.setupCommand(0, lightOnCommand, lightOffCommand);
        controller.onButtonWasPressed(0);
        controller.offButtonWasPressed(0);

        Stereo stereo = new Stereo("book room");
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        controller.setupCommand(1, stereoOnCommand, stereoOffCommand);
        controller.onButtonWasPressed(1);
        controller.offButtonWasPressed(1);
    }

    private static void simpleRemoteControllerTest() {
        Light light = new Light("living room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        new SimpleRemoteController(lightOnCommand).onButtonWasPressed();
        new SimpleRemoteController(lightOffCommand).onButtonWasPressed();
    }
}
