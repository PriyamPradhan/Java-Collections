package collections;

import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {                         // same as HashMap , but sorted on the basis of Key in dictionary way

    public static void main(String[] args) {
        
        
            Map<String, Integer> nums = new TreeMap<>();
    
            nums.put("One", 1);     //adding key:value pair
            nums.put("Two", 2);
            nums.put("Three", 3);
            nums.put("Four", 4);
    
            System.out.println("The map : " + nums);
    
            nums.remove("Three");       //removing data using a key
    
            System.out.println("The map after removing : " + nums);
    
            nums.put("Two", 22);
    
            System.out.println("The value-updated map : " + nums);
    
    
            nums.putIfAbsent("Four", 44);       //to avoid update of the value (to avoid override)
    
            System.out.println("The value-updated map : " + nums);
    
    
    
            // for iteration
    
            for(Map.Entry<String, Integer> mapy : nums.entrySet()){     //of map
                System.out.println("Map data : " + mapy);
            }
    
            for(String key : nums.keySet()){                            //of keys
                System.out.println("Map key : " +key);
            }
    
            for(Integer i : nums.values()){                             //of values
                System.out.println("Map value : " +i);
            }
    
    
    
            System.out.println(nums.containsKey("Two"));            //checks for key
    
            System.out.println(nums.containsValue(2));          //checks for value
    
            System.out.println(nums.isEmpty());                         //checks if empty
    
            nums.clear();
    
            System.out.println("Map afte clearing : " + nums);          //after clearing
    
        
    }

}
