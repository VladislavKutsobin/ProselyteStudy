package net.proselyte.javacore.chapter07;

class Box {
    double width, height, depth;

    //Это изначальный констуктор класса
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    /*Но что если нам заранее не известно будет ли параллелипипед или куб, или вообще неизвестно что?
    Создадим несколько конструкторов путем перегрузки
     */
    Box() {
        //инициализация параллелипипеда с размерами -1, -1, -1
        width = -1;
        height = -1;
        depth = -1;
    }

    //инициализация куба
    Box(double len) {
        width = height = depth = len;
    }

    //метод рассчитывающий объём
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(2, 3, 5);
        Box mybox2 = new Box();
        Box mybox3 = new Box(4);

        System.out.println("Для первого конструктора: " + mybox1.volume());
        System.out.println("Для второго конструктора: " + mybox2.volume());
        System.out.println("Для третьего конструктора: " + mybox3.volume());
    }
}
