package com.lyloou.sample._7Builder;

public abstract class Builder {
    public abstract Builder buildWheel(String wheel);

    public abstract Builder buildEngine(String engine);

    public abstract Builder buildShell(String shell);

    public abstract Car create();
}
