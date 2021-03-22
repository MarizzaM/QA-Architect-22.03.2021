package com.app;

import java.util.ArrayList;
import java.util.Queue;

public class PostOffice {

    ArrayList<Box> m_boxes;
    Queue<String> m_customers;

    public PostOffice(ArrayList<Box> m_boxes, Queue<String> m_customers) {
        this.m_boxes = m_boxes;
        this.m_customers = m_customers;
    }

    public void newBoxArrived(Box box){
        m_boxes.add(box);
    }

    public void newCustomerArrived (String customer){
        m_customers.add(customer);
    }

    public Box serveNextCustomer(){
        Box next = null;
        String next_box = null;
        String next_customers = m_customers.poll();
        System.out.println("Next customer is " + next_customers);

        for (Box box: m_boxes) {
            if(box.getM_owner().equals(next_customers)){
                next_box = box.getM_content();
                next = box;
            }
        }

        System.out.println(String.format("%s gets %s", next_customers, next_box));
        m_boxes.remove(next);
        return next;
    }
}
