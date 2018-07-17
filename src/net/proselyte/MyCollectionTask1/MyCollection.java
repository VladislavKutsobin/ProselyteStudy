package net.proselyte.MyCollectionTask1;

import java.util.*;

public class MyCollection extends ArrayList<Integer> {
    //Search element by index
    public int GetValue(int index) {
        return get(index);
    }
    //Search by value
    public int GetIndex(int value) {
        if(contains(value)) {
            return indexOf(value);
        }
        else return 404;
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

    public int Remove(Integer integer) {
        super.remove(integer);
        for(int i=0; i<size(); i++){
            set(i, get(i) - integer);
        }
        return integer;
    }

    //Find min value in array
    public int MinValue() {
        int min = GetValue(0);
        for(int i=1; i<size(); i++){
            if(GetValue(i) < min) min = GetValue(i);
        }
        return min;
    }

    //Find max value in array
    public int MaxValue() {
        int max = 0;
        for(int i=0; i<size(); i++) {
            if(GetValue(i) > max) max = GetValue(i);
        }
        return max;
    }

    //Find average of array elements
    public double GetAverage() {
        int sum = 0;

        for(int i=0; i<size(); i++) {
            sum += GetValue(i);
        }
        return (double) sum / size();
    }

    //Show collection
    public void GetArray() {
        System.out.println("Сейчас массив выглядит так: " + this);
    }
}

