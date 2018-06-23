package net.proselyte.javacore.chapter06;

class Box1 {
    double width, height, depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box1 mybox = new Box1();
        double vol;
        mybox.setDim(10, 15,20);

        vol = mybox.volume();
        System.out.println("Объём равен: " + vol);
    }
}

