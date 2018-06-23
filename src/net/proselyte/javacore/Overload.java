package net.proselyte.javacore;

class OverloadDemo {
    void test(){
        System.out.println("Параметры отсутствуют");
    }

    //перегружаем метод test, добавим параметр
    void test(int a) {
        System.out.println("Параметр а равен: " + a);
    }

    //перегружаем добавим еще один параметр
    void test(int a, int b) {
        System.out.println("Сумма а и b равна: " +(a + b));
    }

    //перегружаем метод test, теперь возвращающий значение типа double
    double test(double a) {
        System.out.println("а равно: " + a);
        return a*a;
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo a = new OverloadDemo();
        double result;

        a.test();
        a.test(1);
        a.test(1,2);
        result = a.test(2.0);
        System.out.println(result);
    }
}
