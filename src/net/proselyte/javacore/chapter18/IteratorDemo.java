package net.proselyte.javacore.chapter18;
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.print("Начальный список: ");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + "  ");
        }

        System.out.println();
        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext()) {
            String element = litr.next();
            System.out.print(element + "+  ");
        }

        System.out.println();

        itr = al.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + "  ");
        }

        System.out.println();
        System.out.print("В обратном порядке тот же массив: ");
        while(litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + "+  ");
        }

    }
}
