package net.proselyte.javacore.chapter06;

class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.width = 10;
        mybox.height = 15;
        mybox.depth = 20;

        double v = mybox.width * mybox.height * mybox.depth; //Расчитаем объём коробки
        System.out.println("Объём равен: " + v);
    }
}
