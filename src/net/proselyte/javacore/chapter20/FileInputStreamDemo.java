package net.proselyte.javacore.chapter20;
import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try(FileInputStream f = new FileInputStream("src\\net\\proselyte\\javacore\\chapter20\\FileInputStreamDemo.java")) {
            System.out.println("Общее колличество доступных байтов " + (size = f.available()));

            int n = size/40;
            System.out.println("Первые " + n + " символов из файла");
            for(int i=0; i<n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println("\nВсе еще доступно " + f.available());

            byte b[] = new byte[n];
            if(f.read(b) != n) {
                System.err.println("Нельзя прочесть " + n + " из массива");
            }
            System.out.println(new String(b, 0,n));
            System.out.println("Все еще доступно " + f.available());
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
