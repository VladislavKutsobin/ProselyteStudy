package net.proselyte.Task2Queue;
import java.util.*;

public class MovingQueue extends PriorityQueue<Object> {
    private static final int DEFAUlT_CAPACITY = 16;
    private int CUSTOM_CAPACITY;
    transient Object[] queue;

    public MovingQueue() {
        super(DEFAUlT_CAPACITY);
        this.CUSTOM_CAPACITY = DEFAUlT_CAPACITY;
    }

    public MovingQueue(int CUSTOM_CAPACITY) {
        if(CUSTOM_CAPACITY < 1) {
            this.CUSTOM_CAPACITY = 16;
            this.queue = new Object[this.CUSTOM_CAPACITY];
        }
        else {
            this.CUSTOM_CAPACITY = CUSTOM_CAPACITY;
            this.queue = new Object[this.CUSTOM_CAPACITY];
        }
        //super(CUSTOM_CAPACITY);
        //this.CUSTOM_CAPACITY = CUSTOM_CAPACITY;
    }

    @Override
    public boolean offer(Object o) {

        if(size() >= this.CUSTOM_CAPACITY) {
            super.remove();
        }
        return super.offer(o);
    }
}