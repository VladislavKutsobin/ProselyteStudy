package net.proselyte.Task2Queue;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        try {
            MovingQueue mc = new MovingQueue(16);
            for (int i = 0; i < 16; i++) {
                mc.offer(i);
            }
            System.out.println("Очередь: " + mc);
            System.out.println(mc.size());
        } catch (IllegalCapacityException e) {
            System.out.println(e);
        }
    }
}
