package net.proselyte.javacore.chapter08;

class Box {
    double width, height, depth;

    //конструктор клона объекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор для всех параметров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Конструктор без параметров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //Конструктор куба
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight; //вес параллелипипеда

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        double vol;
        BoxWeight mybox = new BoxWeight(10, 20, 30, 0.982);

        vol = mybox.volume();

        System.out.println("Объём коробки равен: " + vol);
        System.out.println("Вес коробки: " + mybox.weight);
    }
}
