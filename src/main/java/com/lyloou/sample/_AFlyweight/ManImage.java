package com.lyloou.sample._AFlyweight;


public class ManImage implements Image {
    private String planName; // 内部状态，可以用来共享的
    // private String picName; // 外部状态，使得相同的状态具有不同的特征

    public ManImage(String planName) {
        this.planName = planName;
    }

    @Override
    public void show(String picName) {
        switch (picName) {
            case "silk":
                System.out.println(planName + ":一条丝绸之路涌入眼帘");
                break;
            case "road":
                System.out.println(planName + ":前方即是一条罗马大道");
                break;
        }
    }
}
