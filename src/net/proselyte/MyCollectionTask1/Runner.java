package net.proselyte.MyCollectionTask1;

public class Runner {
    public static void main(String[] args) {
        MyCollection mc = new MyCollection();
        //input elements
        mc.add(5);
        mc.add(4);
        mc.add(7);
        System.out.println("Элемент по индексу: " + mc.GetValue(1));
        System.out.println("Элемент по значению и его индекс: " + mc.GetIndex(11));
        mc.GetArray();
        System.out.println("Минимальный элемент: " + mc.MinValue());
        System.out.println("Максимальный элемент: " + mc.MaxValue());
        System.out.println("Среднее по массиву: " + mc.GetAverage());
        System.out.println("Удаление элемента: " + mc.Remove(11));
        mc.GetArray();
    }
}

