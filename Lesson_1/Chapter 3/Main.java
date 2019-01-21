/**
 * Java Level 3. Lesson 1. Homework 1.
 * @author Maya Plieva
 * @version Jan 21 2019
 */

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        System.out.println("Weight of apple is: " + a1.getWeight());
        System.out.println("Weight of orange is: " + o1.getWeight() + "\n");

        System.out.println("Added 3 apples & 2 orange");

        appleBox1.addFruit(a1);
        appleBox1.addFruit(a2);
        appleBox1.addFruit(a3);
        orangeBox2.addFruit(o1);
        orangeBox2.addFruit(o2);

        System.out.println("\nAppleBox1 weight is: " + appleBox1.getWeight());
        System.out.println("OrangeBox2 weight is: " + orangeBox2.getWeight());

        System.out.println("Compare weights: " + appleBox1.compare(orangeBox2) + "\n");

        Box<Apple> appleBox2 = new Box<Apple>();

        System.out.println("Apple boxes weights before replacing is: ");
        System.out.println("AppleBox1 weight: " + appleBox1.getWeight());
        System.out.println("AppleBox2 weight: " + appleBox2.getWeight());
        System.out.println("\nReplacing Applebox1 => Applebox2\n");
        appleBox1.replaceAllFruitsToOtherBox(appleBox2);
        System.out.println("Apple boxes weights after replacing: ");
        System.out.println("AppleBox1 weight: " + appleBox1.getWeight());
        System.out.println("AppleBox2 weight: " + appleBox2.getWeight());
    }
}