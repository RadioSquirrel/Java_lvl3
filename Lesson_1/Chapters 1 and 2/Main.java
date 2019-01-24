/**
 * Java Level 3. Lesson 1. Homework 1.
 * @author Maya Plieva
 * @version Jan 21 2019
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("New array:");
        Mas<?> m = new Mas<>(new Cat(), new Dog());
        m.info();

        System.out.println("\nExchange array items:");
        m.masElementsExchange();
        m.info();

        System.out.println("\nArrayList:");
        ArrayList<?> list = m.arrayToArrayList();
        for (Object o : list) System.out.println(o.getClass().getName());
    }
}