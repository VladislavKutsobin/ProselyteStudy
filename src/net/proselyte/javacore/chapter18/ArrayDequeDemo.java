package net.proselyte.javacore.chapter18;
import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.push("A");
        adq.push("C");
        adq.push("B");
        adq.push("D");
        adq.push("F");

        System.out.print("Извлечение элементов из стека: ");

        while(adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }

    }
}
