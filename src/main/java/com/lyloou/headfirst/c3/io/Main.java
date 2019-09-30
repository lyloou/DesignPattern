package com.lyloou.headfirst.c3.io;

import java.io.*;
import java.nio.file.Paths;

/**
 * @author lyloou
 * @date 2019/09/30 21:54
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // way1();
        way2();
    }

    private static void way2() throws IOException {
        // [Getting the Current Working Directory in Java - Stack Overflow](https://stackoverflow.com/questions/4871051/getting-the-current-working-directory-in-java)
        System.out.println(new File(".").getCanonicalPath());
        System.out.println(Paths.get("").toAbsolutePath());

        String userDir = System.getProperty("user.dir");
        String package1 = "/src/main/java/com/lyloou/headfirst/c3/io/";
        String fileName = "test.txt";
        String filePath = userDir + package1 + fileName;
        LowerCaseInputStream lcis = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(filePath)));
        int c;
        while ((c = lcis.read()) >= 0) {
            System.out.print((char) c);
        }
    }

    private static void way1() throws IOException {
        StringBufferInputStream sbs = new StringBufferInputStream("Hello, World!\n1wf\n23");
        BufferedInputStream bis = new BufferedInputStream(sbs);
        LineNumberInputStream lnis = new LineNumberInputStream(bis);
        int c;
        while ((c = lnis.read()) >= 0) {

            char c1 = (char) c;
            System.out.print(Character.toLowerCase(c1));
            if (c1 == '\n') {
                System.out.print("line, " + lnis.getLineNumber() + ":\t");
            }
        }
    }
}
