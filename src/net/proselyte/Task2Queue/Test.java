package net.proselyte.Task2Queue;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        MyCollection mc = new MyCollection(0);
        for(int i=0; i<18; i++) {
            mc.offer(i);
        }
        System.out.println("Очередь: " + mc);
        System.out.println(mc.size());
    }
}
