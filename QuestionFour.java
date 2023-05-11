package com.baazi.questionFour;

public class QuestionFour {

    public static void main(String[] args) {
        MessageQueue mq = new MessageQueue(3);
        Producer producer = new Producer(mq);
        Consumer consumer = new Consumer(mq);
        Thread producerThread = new Thread(producer, "ProducerThread");
        Thread consumerThread = new Thread(consumer, "ConsumerThread");
        producerThread.start();
        consumerThread.start();
    }
}
