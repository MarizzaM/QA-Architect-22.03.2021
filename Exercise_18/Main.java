package com.app;

public class Main {

    public static void main(String[] args) {

        NiceQueue niceQueue = new NiceQueue();

        for (Integer i = 1; i <= 20; i++) {
            niceQueue.enqueue(i);
        }

        System.out.println(niceQueue);

        niceQueue.enqueue("50");

        System.out.println(niceQueue.count());
        System.out.println(niceQueue.next());

        niceQueue.dequeue();
        System.out.println(niceQueue.next());

        niceQueue.clear();
        niceQueue.dequeue();
    }
}