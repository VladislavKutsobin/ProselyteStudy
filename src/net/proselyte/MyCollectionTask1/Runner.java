package net.proselyte.MyCollectionTask1;

public class Runner {
    public static void main(String[] args) {
        ChangebleArray mc = new ChangebleArray();
        //input elements
        mc.add(6);
        mc.add(9);
        mc.add(5);
        mc.add(14);
        mc.getArray();
        System.out.println("Элемент по индексу: " + mc.getValue(1));
        System.out.println("Элемент по значению и его индекс: " + mc.getIndex(11));
        mc.getArray();
        System.out.println("Минимальный элемент: " + mc.minValue());
        System.out.println("Максимальный элемент: " + mc.maxValue());
        System.out.println("Среднее по массиву: " + mc.getAverage());
        System.out.println("Удаление элемента: " + mc.remove(14));
        mc.getArray();
    }
}

