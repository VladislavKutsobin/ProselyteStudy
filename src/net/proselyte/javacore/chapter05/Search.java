package net.proselyte.javacore.chapter05;
//Поиск значения в массиве с помощью for each

public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 7 , 8, 2, 4, 9, 5, 3};
        int var = 5;
        boolean found = false;

        for(int x: nums){
            if(x==var) {
                found = true;
                break;
            }
        }
        if(found) System.out.println("Значение найдено!");
    }
}
