package collections;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        List<Integer> list = new java.util.ArrayList<>();

        list.add(10);   //add elements to the lsit at the end
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(50);


        list.add(5,55); //adds element at the specifc index

        System.out.println(list);

        List<Integer> list2 = new java.util.ArrayList<>();

        list2.add(100);
        list2.add(200);
        list2.add(300);


        list.set(0, 4);     //update the value at the given index


        list.addAll(list2);      //add new list to the existing list

        System.out.println(list);


        int var = list.get(3);      //get the value of the element at that index

        System.out.println(var);


        list.remove(2);     //removes the element at that index


        list.remove(Integer.valueOf(50));   //removes the first occuring element

        System.out.println(list);

        list.clear();   //clears the entire list

        System.out.println(list);


        System.out.println(list.contains(50));      //checks if value is there or not


        System.out.println(list.size());        // show no of elements in the list

        list.add(51);
        list.add(61);
        list.add(71);

  
    }

}
