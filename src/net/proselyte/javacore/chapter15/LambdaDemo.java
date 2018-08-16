package net.proselyte.javacore.chapter15;

interface MyNumber {
    double getValue();
        }

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber mn;
        mn = () -> 123.05;

        System.out.println(mn.getValue());

        mn = () -> Math.random() * 100;
        System.out.println(mn.getValue());
    }
}
