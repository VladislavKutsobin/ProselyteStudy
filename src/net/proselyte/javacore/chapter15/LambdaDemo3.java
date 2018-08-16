package net.proselyte.javacore.chapter15;

interface NumericTest2 {
    boolean isFactor(int n, int d);
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 nt2 = (n, d) -> (n%d) == 0;

        if(nt2.isFactor(10,2)) {
            System.out.println("2 является множителем 10");
        }
        if(!nt2.isFactor(9, 2)) {
            System.out.println("2 не явлеяется множителем 9");
        }
    }
}
