package net.proselyte.javacore.chapter18;
import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<Integer>();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        //ArrayList to array
        Integer ia[]= new Integer[a1.size()];
        ia = a1.toArray(ia);

        int sum = 0;

        //Sum of array elements
        for(int i: ia) sum += i;
        System.out.println("Sum of array elements: " + sum);

    }
}
