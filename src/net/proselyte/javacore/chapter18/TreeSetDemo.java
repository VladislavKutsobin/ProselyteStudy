package net.proselyte.javacore.chapter18;
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        java.util.TreeSet<String> ts = new java.util.TreeSet<String>();

        ts.add("A");
        ts.add("Z");
        ts.add("B");
        ts.add("D");
        ts.add("C");
        ts.add("F");

        System.out.println(ts);
    }
}

