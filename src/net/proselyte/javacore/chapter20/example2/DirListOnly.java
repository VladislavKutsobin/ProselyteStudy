package net.proselyte.javacore.chapter20.example2;
import java.io.*;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "src\\net\\proselyte\\javacore\\chapter20\\example2";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String s[] = f1.list(only);

        for(int i=0; i<s.length; i++) {
            System.out.println(s[i]);
        }
    }
}