package net.proselyte.javacore.chapter18;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();
        System.out.println("Start size of array: " + a1.size());

        //добавим элементы в массив
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        a1.add(1, "A2");

        System.out.println("size of array now: " + a1.size());
        System.out.println("Elements of array is: " + a1);

        a1.remove("C");
        a1.remove(0);

        System.out.println("Elements of array after remove: " + a1);
    }
}
