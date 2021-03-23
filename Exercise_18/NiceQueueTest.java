package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NiceQueueTest {

    @Test
    public void test_enqueue_dequeue(){
        NiceQueue niceQueue = new NiceQueue();

        niceQueue.enqueue(TestData.test_enqueue_dequeue_first_element);
        niceQueue.enqueue(TestData.test_enqueue_dequeue_second_element);

        assertEquals(niceQueue.dequeue(), TestData.test_enqueue_dequeue_first_element);
        assertEquals(niceQueue.dequeue(), TestData.test_enqueue_dequeue_second_element);
    }

    @Test
    public void test_boundary_values_max_size(){
        NiceQueue niceQueue = new NiceQueue();

        for (Integer i = 1; i <= 20; i++) {
            niceQueue.enqueue(i);
        }
        niceQueue.enqueue(50);

        assertEquals(niceQueue.count(), TestData.test_boundary_values_max_size);
    }

    @Test
    public void test_boundary_values_empty_queue(){
        NiceQueue niceQueue = new NiceQueue();

        assertEquals(niceQueue.dequeue(), TestData.test_boundary_values_empty_queue);
    }
}
