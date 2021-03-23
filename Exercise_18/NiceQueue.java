package com.app;

import lombok.ToString;

import java.util.ArrayList;
@ToString
public class NiceQueue<E> {

    ArrayList<E> m_queue = new ArrayList<>();

    public void enqueue(E i)
    {
        if (m_queue.size() >= 20){
            System.out.println("Queue is full");
        }else {
            m_queue.add(i);
        }
    }

    public E dequeue(){
        if (m_queue.size() == 0){
            return null;
        } else {
            return m_queue.remove(0);
        }
    }

    public void clear(){
        m_queue.clear();
    }

    public int count(){
        return m_queue.size();
    }

    public E next(){
        return m_queue.get(0);
    }
}
