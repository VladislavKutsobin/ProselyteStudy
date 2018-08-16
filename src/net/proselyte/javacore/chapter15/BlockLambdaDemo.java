package net.proselyte.javacore.chapter15;

interface NumericFunc {
    int fact(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc nf = n -> {
            int result = 1;

            for(int i=1; i<=n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Факториал для числа 7 : " + nf.fact(7));
    }
}
