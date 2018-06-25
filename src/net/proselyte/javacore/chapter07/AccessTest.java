package net.proselyte.javacore.chapter07;

class Testik {
    int a; //доступ по умолчанию
    public int b; //открытый доступ
    private int c;

    //методы доступа к закрытым переменным
    void setc(int i) {
        c = i; //устанавливаем параметр с
    }

    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Testik ob = new Testik();
        ob.a = 10;
        ob.b = 20; //с параметрос c так не получится его даже не видит среда разработки

        ob.setc(100); //задаем значение параметру с с помощью методов доступа
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
