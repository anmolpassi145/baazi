package com.baazi.questionFour;

public class Consumer implements Runnable{
    private final MessageQueue mq;

    public Consumer(MessageQueue mq) {
        this.mq = mq;
    }

    @Override
    public void run() {
        while(true){
            mq.get();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
