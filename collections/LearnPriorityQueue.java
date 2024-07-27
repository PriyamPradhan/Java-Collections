package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {
        

        Queue<Integer> pq = new PriorityQueue<>();      //PriorityQueue with numbers

        pq.offer(500);
        pq.offer(200);
        pq.offer(100);
        pq.offer(400);
        pq.offer(900);

        System.out.println("PriorityQueue : " + pq);    //even if 100 was added in the middle, the value of 100 came to front because of MinHeap Data Structure

        pq.poll();

        System.out.println("PriorityQueue after pop : " + pq);      //now 200 is smallest , so came to front



        Queue<Integer> reverse = new PriorityQueue<>(Comparator.reverseOrder());      //PriorityQueue with numbers ReverseOrder

        reverse.offer(500);
        reverse.offer(200);
        reverse.offer(100);
        reverse.offer(400);
        reverse.offer(900);

        System.out.println("PriorityQueue reverse : " + reverse);    //even if 100 was added in the middle, the value of 100 came to front because of MaxHeap Data Structure

        reverse.poll();

        System.out.println("PriorityQueue after pop reverse : " + reverse);      //now 200 is smallest , so came to front





        Queue<String> str = new PriorityQueue<>();      //PQ with String values

        str.offer("Lion");
        str.offer("Human");
        str.offer("Zebra");
        str.offer("Monkey");
        str.offer("Tiger");
        str.offer("Apple");
        str.offer("AAAAAAAA");
        str.offer("BBBBB");
        str.offer("aaaaaaaaa");
        str.offer("1234");
        str.offer("-13");

        System.out.println("Lets c what happens in string : " + str);       //Priority =>    Number (Smaller to Larger) > Capitals > Alpahabetic
        
        



    }

}
