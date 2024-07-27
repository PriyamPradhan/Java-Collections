package collections;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

    public static void main(String[] args) {
        

        Set<Integer> tree = new TreeSet<>();

        tree.add(100);
        tree.add(500);
        tree.add(200);
        tree.add(400);
        tree.add(7700);
        tree.add(800);
        tree.add(900);
        tree.add(900);      //doesnot take repeated values


        System.out.println(tree);       //arranged in ascending order
    }

}
