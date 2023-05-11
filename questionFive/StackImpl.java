package com.baazi.questionFive;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class StackImpl<T> {
    private Queue<T> firstQueue = new LinkedList<>();
    private Queue<T> secondQueue = new LinkedList<>();

    void push(T element) {
        secondQueue.add(element);
        while (!firstQueue.isEmpty()) {
            secondQueue.add(firstQueue.peek());
            firstQueue.remove();
        }
        Queue<T> q = firstQueue;
        firstQueue = secondQueue;
        secondQueue = q;
    }

    public void pop() {
        if (firstQueue.isEmpty())
            throw new EmptyStackException();
        firstQueue.remove();
    }

    public T top() {
        if (firstQueue.isEmpty())
            throw new EmptyStackException();
        return firstQueue.peek();
    }

    public Integer size() {
        return firstQueue.size();
    }
}
