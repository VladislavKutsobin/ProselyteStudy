package net.proselyte.MyCollectionTask1;

import java.util.*;

public class ChangebleArray extends ArrayList<Integer> {

    //Search element by index
    public int getValue(int index) {
        return get(index);
    }
    //Search by value
    public int getIndex(int value) {
        if(contains(value)) {
            return indexOf(value);
        }
        else return -1;
    }

    //Overriding method add .
    //Now method add changes all previous elements in array. arr[i] = arr[i] + integer
    @Override
    public boolean add(Integer integer) {
        for(int i=0; i<size();i++) {
            set(i, get(i) + integer);
        }
        return super.add(integer);
    }

    //Method remove. It works that :
    //  1)remove element by value(integer)
    //  2)changing elemnt like that : arr[i] = arr[i] - integer

    public int remove(Integer integer) {
        if(this.contains(integer)) {
            super.remove(integer);
            for (int i = 0; i < size(); i++) {
                set(i, get(i) - integer);
            }
        }
        else return -1;
        return integer;
    }

    //Find min value in array
    public int minValue() {
        int min = getValue(0);
        for(int i=1; i<size(); i++){
            if(getValue(i) < min) min = getValue(i);
        }
        return min;
    }

    //Find max value in array
    public int maxValue() {
        int max = 0;
        for(int i=0; i<size(); i++) {
            if(getValue(i) > max) max = getValue(i);
        }
        return max;
    }

    //Find average of array elements
    public double getAverage() {
        int sum = 0;

        for(int i=0; i<size(); i++) {
            sum += getValue(i);
        }
        return (double) sum / size();
    }

    //Show collection
    public void getArray() {
        System.out.println("Сейчас массив выглядит так: " + this);
    }
}

