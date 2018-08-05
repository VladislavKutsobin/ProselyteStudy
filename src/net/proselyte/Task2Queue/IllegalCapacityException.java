package net.proselyte.Task2Queue;

public class IllegalCapacityException extends Exception {
    IllegalCapacityException() {
        super();
    }

    @Override
    public String toString() {
        return super.toString() + " Can`t create queue...";
    }
}
