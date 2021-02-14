package com.alliah;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        // insert(2)
        //[1, 3, 3, 5 ,6]
        queue.add(3);
        queue.add(5);
        queue.add(1);
        queue.add(6);
        queue.add(2);
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());


        System.out.println(queue);






    }

}
