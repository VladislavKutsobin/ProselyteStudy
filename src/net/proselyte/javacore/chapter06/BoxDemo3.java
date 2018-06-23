package net.proselyte.javacore.chapter06;

class BoX {
    double width, height, depth;

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        double vol;
        BoX mybox1 = new BoX();
        BoX mybox2 = new BoX();

        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 20;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.volume();
        System.out.println("Объём равен: " + vol);

        vol = mybox2.volume();
        System.out.println("Обём второго равен: " + vol);
    }
}
