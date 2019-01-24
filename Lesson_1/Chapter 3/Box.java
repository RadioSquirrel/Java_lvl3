import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box(){ fruits = new ArrayList<>(); }

    public Box(ArrayList<T> fruits) { this.fruits = fruits; }

    public Box(T fruit) {
        fruits = new ArrayList<>();
        fruits.add(fruit);
    }

    public ArrayList<T> getFruits() { return fruits; }

    public void setFruits(ArrayList<T> fruits) { this.fruits = fruits; }

    public float getWeight() { return fruits.size() == 0 ? 0 : fruits.size() * fruits.get(0).getWeight(); }

    public boolean compare(Box<?> otherBox) {
        return getWeight() == otherBox.getWeight();
    }

    public void replaceAllFruitsToOtherBox(Box<T> otherBox) {
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addFruit(T fruitToAdd) { fruits.add(fruitToAdd); }
}