package net.proselyte.javacore.chapter03;

public class Light {
    public static void main(String[] args) {
        int lightspeed; //скорость света в милях на секунду
        long days, seconds, distance;

        lightspeed = 186000;
        days = 1000;
        seconds = 24 * 60 * 60 * days;

        distance = lightspeed * seconds;
        System.out.println("Расстояние, которое пройдет свет за " + days + " приблизительно равно " + distance +
        " миль");
    }
}
