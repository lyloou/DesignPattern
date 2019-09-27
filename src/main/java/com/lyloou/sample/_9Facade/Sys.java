package com.lyloou.sample._9Facade;

public class Sys {
    private SubSys1 sys1;
    private SubSys2 sys2;

    public Sys() {
        sys1 = new SubSys1();
        sys2 = new SubSys2();
    }

    public void combineM1() {
        sys1.m1();
        sys2.m1();
    }

    public void combineM2() {
        sys1.m2();
        sys2.m2();
    }

    public void combineM3() {
        sys1.m3();
        sys2.m3();
    }
}
