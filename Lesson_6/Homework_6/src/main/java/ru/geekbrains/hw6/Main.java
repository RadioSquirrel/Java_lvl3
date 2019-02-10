package ru.geekbrains.hw6;
/**
 * Java Level 3. Homework 6 fixed.
 * @author Maya Plieva
 * @version Feb 10 2019
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayCutAfter4(new int[] {1, 4})));
        System.out.println(arrayCheck1And4(new int[] {1, 4, 2, 1, 1}));
    }

    public static int[] arrayCutAfter4 (int[] arr) {
        if(arr[arr.length - 1] == 4) return new int[] {};
        for (int i = arr.length - 1; i > 0 ; i--) {
            if(arr[i - 1] == 4) {
                return Arrays.copyOfRange(arr, i, arr.length);
            }
        }
        throw new RuntimeException("Array s havent 4");
    }

    public static boolean arrayCheck1And4 (int[] arr) {
        boolean isHave1 = false;
        boolean isHave4 = false;
        boolean isHaveAnotherDigit = false;

        for (int anArr : arr) {
            isHave1 |= anArr == 1;
            isHave4 |= anArr == 4;
            isHaveAnotherDigit |= anArr != 1 & anArr != 4;
        }

        return isHave1 & isHave4 & !isHaveAnotherDigit;
    }
}