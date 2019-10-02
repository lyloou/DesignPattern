package com.lyloou;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public static final char C = 'c';
    public static final char B = 'b';
    public static final char A = 'a';

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        hanoi(6, A, B, C);

    }

    private static void hanoi(int n, char x, char y, char z) {
        if (n == 0) {
            return;
        }
        hanoi(n - 1, x, z, y);
        System.out.println(x + "->" + y);
        hanoi(n - 1, z, y, x);
    }
}
