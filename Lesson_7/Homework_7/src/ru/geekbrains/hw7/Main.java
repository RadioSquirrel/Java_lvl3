package ru.geekbrains.hw7;
/**
 * Java Level 3. Homework 7.
 * @author Maya Plieva
 * @version Feb 10 2019
 */

public class Main {

    public static void main(String[] args) {
        TestsExecutor.start(TestClass1.class);
        System.out.println();
        TestsExecutor.start(TestClass1.class.getName());

    }
}