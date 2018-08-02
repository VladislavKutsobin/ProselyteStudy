package net.proselyte.MyCollectionTask1;
import java.lang.*;

public class EmptyArrayException extends Exception {
    @Override
    public String toString() {
        return "Array is empty now!\nCan`t calculate value!";
    }
}
