package com.app;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostOfficeTest {
    @Test
    public void serve_next_customer_balloons_for_Dasha(){
        ArrayList<Box> boxes = new ArrayList<>();
        Queue<String> customers =  new LinkedList<>();

        PostOffice po = new PostOffice(boxes , customers);

        po.newBoxArrived(TestData.serve_next_customer_balloons_for_Dasha_box);
        po.newCustomerArrived(TestData.serve_next_customer_balloons_for_Dasha_customer);

        assertEquals(po.serveNextCustomer(),
                TestData.serve_next_customer_balloons_for_Dasha_box);
    }

    @Test
    public void serve_next_customer_balloons_for_Masha(){
        ArrayList<Box> boxes = new ArrayList<>();
        Queue<String> customers =  new LinkedList<>();

        PostOffice po = new PostOffice(boxes , customers);

        po.newBoxArrived(TestData.serve_next_customer_champagne_for_Masha_box);
        po.newCustomerArrived(TestData.serve_next_customer_champagne_for_Masha_customer);

        assertEquals(po.serveNextCustomer(),
                TestData.serve_next_customer_champagne_for_Masha_box);
    }

    @Test
    public void serve_next_customer_balloons_for_Marisha(){
        ArrayList<Box> boxes = new ArrayList<>();
        Queue<String> customers =  new LinkedList<>();

        PostOffice po = new PostOffice(boxes , customers);

        po.newBoxArrived(TestData.serve_next_customer_chocolate_for_Marisha_box);
        po.newCustomerArrived(TestData.serve_next_customer_chocolate_for_Marisha_customer);

        assertEquals(po.serveNextCustomer(),
                TestData.serve_next_customer_chocolate_for_Marisha_box);
    }

    @Test
    public void serve_next_customer_balloons_for_Natasha(){
        ArrayList<Box> boxes = new ArrayList<>();
        Queue<String> customers =  new LinkedList<>();

        PostOffice po = new PostOffice(boxes , customers);

        po.newBoxArrived(TestData.serve_next_customer_flowers_for_Natasha_box);
        po.newCustomerArrived(TestData.serve_next_customer_flowers_for_Natasha_customer);

        assertEquals(po.serveNextCustomer(),
                TestData.serve_next_customer_flowers_for_Natasha_box);
    }

    @Test
    public void serve_next_customer_balloons_for_Katusha(){
        ArrayList<Box> boxes = new ArrayList<>();
        Queue<String> customers =  new LinkedList<>();

        PostOffice po = new PostOffice(boxes , customers);

        po.newBoxArrived(TestData.serve_next_customer_Teddy_for_Katusha_box);
        po.newCustomerArrived(TestData.serve_next_customer_Teddy_for_Katusha_customer);

        assertEquals(po.serveNextCustomer(),
                TestData.serve_next_customer_Teddy_for_Katusha_box);
    }
}
