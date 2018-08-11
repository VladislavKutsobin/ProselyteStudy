package net.proselyte.javacore.chapter13;
import java.io.*;

public class BRreadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Введите строку");
        System.out.println("Введте 'stop' для выхода");

        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
    }
}
