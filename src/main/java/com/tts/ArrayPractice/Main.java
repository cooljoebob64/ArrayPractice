package com.tts.ArrayPractice;

public class Main {

    public static int arraySum(int[] myArray) {
        int sum = 0;
        for (int num : myArray
        ) {
            sum += num;
        }
        return sum;
    }

    public static int arrayMax(int[] myArray) {
        int max = 0;
        try {
            max = myArray[1];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error in arrayMax, array too small: " + e);
            return 0;
        }
        for (int num : myArray
        ) {
            if (max < num) max = num;
        }
        return max;
    }

    public static int[] toPower(int size, int power) {
        int[] powerArray = new int[size];
        for (int i = 0; i < powerArray.length; i++) {
            powerArray[i] = (int) Math.pow(i, power);
        }
        return powerArray;
    }
}
