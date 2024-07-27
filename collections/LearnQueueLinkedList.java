package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueLinkedList {

    public static void main(String[] args) {
        

        Queue<Integer> queue = new LinkedList<>();      //LinkedList

        queue.offer(55);           //adds elements
        queue.offer(66);
        queue.offer(77);

        System.out.println("Queue : " + queue);

        queue.poll();               //removing element

        System.out.println("Queue after polling : " + queue);


        System.out.println("The next element to be peeked is : " + queue.peek());       //determining the next element

    }

}
