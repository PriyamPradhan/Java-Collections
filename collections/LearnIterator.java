package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnIterator {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(60);
        list.add(90);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element with for loop is : " + list.get(i));
        }


        for(Integer i : list){
            System.out.println("The element with foreach loop is : " + i);
        }
        
        
        Iterator<Integer> it = list.iterator();     //Iterator

        while (it.hasNext()){                       //used .hasNext() and .next()
            System.out.println("The element with iterator is : " + it.next());

        }

    }

}
