package net.proselyte.javacore.chapter13;
import java.io.*;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];

        //Input string
        System.out.println("Введите строки");
        System.out.println("Для выхода введите 'stop'");

        for(int i=0; i<100; i++) {
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }

        //Содержимое массива строк
        System.out.println("Содержимое файла будет: ");
        for(int i=0; i<100; i++){
            if(str[i].equals("stop")) break;
            System.out.print(str[i] + " ");
        }
    }
}
