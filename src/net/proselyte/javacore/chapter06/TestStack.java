package net.proselyte.javacore.chapter06;

class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }
    //Заносим элементы в стек
    void push(int item) {
        if(tos==9) System.out.println("Стек заполнен!");
        else stck[++tos] = item;
    }

    //извлечение элемента из стека
    int get() {
       if (tos<0) {
           System.out.println("Стек пустой!");
           return 0;
       }
       else return stck[tos--];
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack stck1 = new Stack();
        Stack stck2 = new Stack();

        //размещаем числа в стэке
        for(int i=0; i<11; i++) stck1.push(i);
        for(int i=10; i<20; i++) stck2.push(i);

        //Извлекаем числа из стека
        for(int i=0; i<10; i++) System.out.print(stck1.get());
        System.out.println();
        for(int i=0; i<10; i++) System.out.println(stck2.get());
    }
}
