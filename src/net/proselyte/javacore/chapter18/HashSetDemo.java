package net.proselyte.javacore.chapter18;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hs = new java.util.HashSet<String>();

        hs.add("Alpha");
        hs.add("Beta");
        hs.add("Gamma");
        hs.add("Delta");
        hs.add("Epsilon");
        hs.add("Kappa");

        System.out.println(hs);
    }
}

