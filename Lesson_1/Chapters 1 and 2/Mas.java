import java.util.*;

public class Mas<T> {
    private T[] mas;

    public Mas(T... mas) { this.mas = mas; }

    public void masElementsExchange(){
        T tmp = mas[0];
        mas[0] = mas[1];
        mas[1] = tmp;
    }

    public void setObj(T[] mas) { this.mas = mas; }

    public T[] getObj() { return mas; }

    public void info() { for (T item : mas) System.out.println(item.getClass().getName()); }

    public ArrayList<T> arrayToArrayList() {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(mas));
        return list;
    }
}