package collections;

import java.util.Set;

public class LearnHashSet {

    public static void main(String[] args) {
        
        Set<Integer> value = new java.util.HashSet<>();

        value.add(10);
        value.add(20);
        value.add(30);
        value.add(60);
        value.add(110);
        value.add(70);
        value.add(77);
        value.add(45);


        value.remove(20);

        System.out.println("does it contain 10 ? : " + value.contains(10));


        System.out.println("is it empty ? : " + value.isEmpty());



        System.out.println(value);      //arranged randomly
    }

}
