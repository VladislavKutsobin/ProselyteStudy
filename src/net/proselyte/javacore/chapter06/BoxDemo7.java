package net.proselyte.javacore.chapter06;
/*Использование параметризированого конструктора
*/
class Boxing {
    double width, height, depth;
    //Параметризированый конструктор
    Boxing(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        double vol;
        Boxing mybox1 = new Boxing(10,15, 20);
        Boxing mybox2 = new Boxing(3,6,9);

        vol = mybox1.volume();
        System.out.println("Объём первого: " + vol);

        vol = mybox2.volume();
        System.out.println("Объём второго: " + vol);
    }
}
