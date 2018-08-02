package net.proselyte.MyCollectionTask1;

public class Runner {
    public static void main(String[] args) {
        ChangebleArray mc = new ChangebleArray();
        //input elements
        //mc.add(6);
        //mc.add(9);
        //mc.add(5);
        mc.add(14);
        mc.getArray();
        try {
            System.out.println("Элемент по индексу: " + mc.getValue(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Элемент по значению и его индекс: " + mc.getIndex(28));
        } catch (ValueOutOfException e) {
            System.out.println(e);
        }
        mc.getArray();
        try {
            System.out.println("Минимальный элемент: " + mc.minValue());
        } catch (EmptyArrayException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Максимальный элемент: " + mc.maxValue());
        } catch (EmptyArrayException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Среднее по массиву: " + mc.getAverage());
        } catch (EmptyArrayException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Удаление элемента: " + mc.rEmove(14));
        } catch (ValueOutOfException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        mc.getArray();
    }
}

