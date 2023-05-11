package com.baazi.questionFour;

public class Producer implements Runnable{
    private final MessageQueue mq;

    public Producer(MessageQueue mq) {
        this.mq = mq;
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            mq.put(i++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
