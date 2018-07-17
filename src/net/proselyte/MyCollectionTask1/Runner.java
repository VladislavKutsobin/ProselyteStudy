package net.proselyte.MyCollectionTask1;

public class Runner {
    public static void main(String[] args) {
        MyCollection mc = new MyCollection();
        //input elements
        mc.add(6);
        mc.add(9);
        mc.add(5);
        mc.add(14);
        mc.GetArray();
        System.out.println("Элемент по индексу: " + mc.GetValue(1));
        System.out.println("Элемент по значению и его индекс: " + mc.GetIndex(11));
        mc.GetArray();
        System.out.println("Минимальный элемент: " + mc.MinValue());
        System.out.println("Максимальный элемент: " + mc.MaxValue());
        System.out.println("Среднее по массиву: " + mc.GetAverage());
        System.out.println("Удаление элемента: " + mc.Remove(14));
        mc.GetArray();
    }
}

