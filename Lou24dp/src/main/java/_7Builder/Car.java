package _7Builder;

public class Car {
    private String wheel;
    private String engine;
    private String shell;

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public void run() {
        System.out.println("一辆装有" + engine + "的引擎、脚踏" + wheel + "牌的四轮车、外表像是" + shell + "的车跑起来啦");
    }
}
