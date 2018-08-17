package net.proselyte.javacore.chapter20.example1;
import java.io.File;

class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f = new File("src\\net\\proselyte\\javacore\\chapter20\\example1\\java");

        p("Имя файла:" + f.getName());
        p("Путь к файлу: " + f.getPath());
        p("Полный путь: " + f.getAbsolutePath());
        p(f.exists() ? "файл существует" : "файл не существует");
        p("Доступен для записи? : " + f.canWrite());
    }
}