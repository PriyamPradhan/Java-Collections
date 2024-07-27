package collections;

import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {
        

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(44);
        adq.offerFirst(55);     //First means the left
        adq.offerLast(66);      //Last means the right
        adq.offer(88);

        System.out.println(adq);

        System.out.println("Peek : " + adq.peek());
        System.out.println("Peek First : " + adq.peekFirst());
        System.out.println("Peek Last : " + adq.peekLast());


        System.out.println("Poll : " + adq.poll());
        System.out.println("Poll First : " + adq.pollFirst());
        System.out.println("Poll Last : " + adq.pollLast());

        System.out.println("Final Array Queue : " + adq);






    }

}
