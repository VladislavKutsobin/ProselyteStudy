package net.proselyte.javacore.chapter20.FileOutputStreamDemo;
import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Spring is comming.\n" +  "birds are singing.\n" + "people are laughing";

        byte buf[] = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("src\\net\\proselyte\\javacore\\chapter20\\FileOutputStreamDemo\\file1.txt");
            f1 = new FileOutputStream("src\\net\\proselyte\\javacore\\chapter20\\FileOutputStreamDemo\\file2.txt");
            f2 = new FileOutputStream("src\\net\\proselyte\\javacore\\chapter20\\FileOutputStreamDemo\\file3.txt");

            // Запись в файл каждого второго символа
            for(int i=0; i<buf.length; i+=2) {
                f0.write(buf[i]);
            }

            //Запись всего содержимого в файл
            f1.write(buf);

            //Запись последней четверти текста в файл
            f2.write(buf, buf.length-buf.length/4, buf.length/4);
        } catch (IOException e) {
            System.out.println("Warning!!! IO Error");
        }

        finally {
            try {
                if(f0 != null) f0.close();
            } catch(IOException e) {
                System.out.println("Ошибка закрытия файла 1");
            }
            try {
                if(f1 != null) f1.close();
            } catch(IOException e) {
                System.out.println("Ошибка закрытия файла 2");
            }
            try {
                if(f2 != null) f2.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла 3");
            }
        }
    }
}
