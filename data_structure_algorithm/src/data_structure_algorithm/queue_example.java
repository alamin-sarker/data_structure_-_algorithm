/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure_algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alamin
 */
public class queue_example {//FIFO

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        System.out.println("Queue size: " + q.size());
        System.out.println("Is queue empty: " + q.isEmpty());

        // Adds elements {0, 1, 2, 3, 4} to queue
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        // Display contents of the queue.
        System.out.println("Elements of queue: " + q);

        // To remove the head of queue.
        System.out.println("removed element: " + q.remove());

        System.out.println(q);

        // To view the head of queue
        System.out.println("head of queue: " + q.peek());
        System.out.println("test element() queue: " + q.element());
        
        System.out.println("test poll queue: " + q.poll());

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.

        System.out.println("Size of queue: " + q.size());
    }
}
