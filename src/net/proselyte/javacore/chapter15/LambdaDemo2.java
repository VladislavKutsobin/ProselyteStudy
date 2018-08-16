package net.proselyte.javacore.chapter15;

interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest nt = (n) -> (n%2) == 0;

        if(nt.test(10)) {
            System.out.println("Четное");
        }
        if(!nt.test(9)) {
            System.out.println("Нечетное");
        }
        NumericTest ntn = (n) -> n >= 0;
        if(ntn.test(1)) {
            System.out.println("1 Положительное число");
        }
        if(!ntn.test(-1)) {
            System.out.println("-1 Отрицательное число");
        }
    }
}
