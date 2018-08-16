package net.proselyte.javacore.chapter15;

//Обобщенный интерфейс
interface SomeInterface<T> {
    T func(T n);
}

public class GenericLambdaDemo {
    public static void main(String[] args) {
        SomeInterface<Integer> factorial = n -> {
            int result = 1;

            for(int i=1; i<=n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Факториал числа 7 равен: " + factorial.func(7));

        SomeInterface<String> str = n -> {
            String result = "";
            int i=0;

            for(i=n.length()-1; i >= 0; i--) {
                result += n.charAt(i);
            }
            return result;
        };

        System.out.println("Высказывание наоборот будет: " + str.func("Высказывание"));
    }
}
