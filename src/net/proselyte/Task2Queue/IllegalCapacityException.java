package net.proselyte.Task2Queue;

public class IllegalCapacityException extends Exception {
    IllegalCapacityException() {
        super();
    }

    @Override
    public String toString() {
        return "Can`t create queue...";
    }
}
