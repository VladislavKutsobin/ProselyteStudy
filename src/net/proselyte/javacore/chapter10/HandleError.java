package net.proselyte.javacore.chapter10;
import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for(int i=0; i<32000; i++) {
            try {
                a = r.nextInt();
                b = r.nextInt();
                c = 12345 / (a/b);
            } catch (ArithmeticException e) {
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}
