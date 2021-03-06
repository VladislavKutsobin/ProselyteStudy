package net.proselyte.javacore.chapter07;

class Stack {
    private int stck[];
    private int tos;

    //Конструктор инициализация
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if(tos==stck.length-1)
            System.out.println("Стек заполнен");
        else stck[++tos] = item;
    }

    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else return stck[tos--];
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        //заполняем стеки
        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) mystack2.push(i);

        //извлекаем элементы
        System.out.println("Стек в mystack1: ");
        for(int i=0; i<5; i++) System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2: ");
        for(int i=0; i<8; i++) System.out.println(mystack2.pop());
    }
}
