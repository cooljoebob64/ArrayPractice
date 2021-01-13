package com.tts.ArrayPractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final int[] demoArray0 = new int[]{};
    private final int[] demoArray1 = new int[]{1};
    private final int[] demoArray2 = new int[]{1, 2};
    private final int[] demoArray3 = new int[]{1, 2, 3};
    private final int[] demoArray4 = new int[]{1, 2, 3, 4};
    private final int[] demoArray5 = new int[]{1, 2, 3, 4, 5};
    private final int[] powerArray0 = new int[]{0, 0};
    private final int[] powerArray1 = new int[]{1, 2};
    private final int[] powerArray2 = new int[]{3, 4};
    private final int[] powerArray3 = new int[]{5, 6};
    private final int[] powerArray4 = new int[]{7, 8};
    private final int[] powerArray5 = new int[]{9, 10};


    @org.junit.jupiter.api.BeforeEach
    void setUp() {


    }

    @org.junit.jupiter.api.Test
    void main() {
        Main newMain = new Main();
        assertNotNull(newMain);
    }

    @Test
    void arraySum1() {
        int expected = 1;
        assertEquals(expected, Main.arraySum(demoArray1));
    }

    @Test
    void arraySum2() {
        int expected = 3;
        assertEquals(expected, Main.arraySum(demoArray2));
    }

    @Test
    void arraySum3() {
        int expected = 6;
        assertEquals(expected, Main.arraySum(demoArray3));
    }

    @Test
    void arraySum4() {
        int expected = 10;
        assertEquals(expected, Main.arraySum(demoArray4));
    }

    @Test
    void arraySum5() {
        int expected = 15;
        assertEquals(expected, Main.arraySum(demoArray5));
    }

    @Test
    void arrayMax0() {
        int expected = 0;
        assertEquals(expected, Main.arrayMax(demoArray0));
    }
    @Test
    void arrayMax() {
        int expected = 5;
        assertEquals(expected, Main.arrayMax(demoArray5));
    }

    @Test
    void toPower1() {
        int[] expected = {0};
        assertArrayEquals(expected, Main.toPower(powerArray1[0],powerArray1[1]));
    }

    @Test
    void toPower2() {
        int[] expected = {0, 1, 16};
        assertArrayEquals(expected, Main.toPower(powerArray2[0],powerArray2[1]));
    }
    @Test
    void toPower3() {
        int[] expected = {0, 1, 64, 729, 4096};
        assertArrayEquals(expected, Main.toPower(powerArray3[0],powerArray3[1]));
    }

}