package net.proselyte.MyCollectionTask1;

import java.util.*;
import java.lang.*;

public class ChangebleArray extends ArrayList<Integer> {

    //Search element by index
    public int getValue(int index) throws IndexOutOfBoundsException {
        if((index < 0) || ((size()-1) < index))
            throw new IndexOutOfBoundsException("Exception! No such index in array!");
        else return get(index);
    }
    //Search by value
    public int getIndex(int value) throws ValueOutOfException {
        if(contains(value)) {
            return indexOf(value);
        }
        else throw new ValueOutOfException();
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

    public int rEmove (Integer integer) throws ValueOutOfException, IndexOutOfBoundsException {
        if(this.contains(integer)) {
            super.remove(getIndex(integer));
            for (int i = 0; i < size(); i++) {
                set(i, get(i) - integer);
            }
            return integer;
        }
        else throw new IndexOutOfBoundsException("Exception! No such index in array!");
    }

    //Find min value in array
    public int minValue() throws EmptyArrayException {
        if(this.isEmpty()) {
            throw new EmptyArrayException();
        }
        else {
            int min = getValue(0);

            for (int i = 1; i < size(); i++) {
                if (getValue(i) < min) min = getValue(i);
            }
            return min;
        }
    }

    //Find max value in array
    public int maxValue() throws EmptyArrayException {
        if(this.isEmpty()) throw new EmptyArrayException();
        else {
            int max = getValue(0);
            for (int i = 0; i < size(); i++) {
                if (getValue(i) > max) max = getValue(i);
            }
            return max;
        }
    }

    //Find average of array elements
    public double getAverage() throws EmptyArrayException {
        if(this.isEmpty()) {
            throw new EmptyArrayException();
        }
        else {
            int sum = 0;
            for(int i=0; i<size(); i++) {
                sum += getValue(i);
            }
        return (double) sum / size();
        }
    }

    //Show collection
    public void getArray() {
        if(this.isEmpty()) System.out.println("Массив пуст!");
        else System.out.println("Сейчас массив выглядит так: " + this);
    }
}

