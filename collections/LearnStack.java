package collections;

import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        

        Stack<String> animals = new Stack<>();

        animals.push("lion");       //add elements to the list
        animals.push("tiger");
        animals.push("elephant");

        System.out.println("List of animals : " + animals);

        System.out.println("Peeking : " + animals.peek());     //show the top element in the stack


        System.out.println("Poping : " + animals.pop());        //removed an element

        System.out.println("List after poping : " + animals);
    }

}
