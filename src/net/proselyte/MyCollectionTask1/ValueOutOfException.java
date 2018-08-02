package net.proselyte.MyCollectionTask1;
import java.lang.*;

public class ValueOutOfException extends Exception {
    ValueOutOfException() {
        super();
    }

    @Override
    public String toString() {
        return "No such value in array!";
    }
}
