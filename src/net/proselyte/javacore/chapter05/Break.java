package net.proselyte.javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Предшествует оператору break.");
                    if(t) break second;
                    System.out.println("Это не выполнится");
                }
                System.out.println("Это не выполнится");
            }
            System.out.println("А тут выполнится");
        }
    }
}
