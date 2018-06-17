package net.proselyte.javacore.chapter04;

public class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c, d;

        c = ++b;// b = b + 1 -->b=3--->c = b = 3
        d = a++;// d = a = 1, а только потом a = a + 1 = 2
        c++;
        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
        System.out.println("c =  " + c);
        System.out.print("d =  " + d);
    }
}
