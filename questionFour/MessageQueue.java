package com.baazi.questionFour;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {
    private final LinkedList<Integer> queue = new LinkedList<>();
    private final Integer capacity;

    MessageQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void put(int i) {
        while(queue.size() == capacity){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produced value " + i);
        queue.add(i);
        notify();
    }

    public synchronized void get() {
        while(queue.size()==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed value " + queue.removeFirst());
        notify();
    }
}
