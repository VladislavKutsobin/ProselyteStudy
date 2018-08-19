package net.proselyte.javacore.chapter20.example2;
import java.io.File;

class DirDemo {
    public static void main(String[] args) {
        String dirname = "src\\net\\proselyte\\javacore\\chapter20\\example2";
        File f1 = new File(dirname);
        if(f1.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String s[] = f1.list();

            for(int i=0; i < s.length; i++) {
                File f = new File(dirname + "\\" + s[i]);
                if(f.isDirectory()) {
                    System.out.println(s[i] + " Является каталогом");
                }
                else {
                    System.out.println(s[i] + " Является файлом");
                }
            }
        }
        else {
            System.out.println("Не явлеяется каталогом");
        }
    }
}