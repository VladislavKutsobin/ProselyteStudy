package net.proselyte.javacore.chapter15;

interface StringReverce {
    String func(String s);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringReverce sr = s -> {
            String result = "";
            int i;

            for(i =s.length()-1; i>=0; i--) {
                result += s.charAt(i);
            }
            return result;
        };

        System.out.println("Лямбда в обратном порядке: " + sr.func("лямбда"));
        System.out.println("Выражение в обратном порядке: " + sr.func("выражение"));
    }
}
