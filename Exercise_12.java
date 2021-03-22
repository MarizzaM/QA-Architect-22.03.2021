package com.app;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
// (a)
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 3; i++)
            q.add(i);
        System.out.println("Elements of queue " + q);
// (b)
        System.out.println("Take the first element: '" + q.poll() + "' from the Queue" );
// (c)
        System.out.println("Head of queue: " + q.peek());
// (d)
        q.clear();
        System.out.println(q);
    }
}
