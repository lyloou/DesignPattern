package _AFlyweight;

import java.util.HashMap;
import java.util.Map;

public class ImageFactory {
    private static final Map<String, Image> pool = new HashMap<>();

    public static Image getImage(String planName) {
        if (pool.containsKey(planName)) {
            System.out.println(planName + ":缓存的计划");
            return pool.get(planName);
        }

        ManImage manImage = new ManImage(planName);
        pool.put(planName, manImage);
        System.out.println(planName + ":新建的计划");
        return manImage;
    }
}
