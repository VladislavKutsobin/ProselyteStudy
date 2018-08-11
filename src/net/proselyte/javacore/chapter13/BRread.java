package net.proselyte.javacore.chapter13;
import java.io.*;

public class BRread {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, введите 'q' для выхода");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');
    }
}
