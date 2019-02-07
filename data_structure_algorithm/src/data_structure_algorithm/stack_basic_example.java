/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure_algorithm;

import java.util.Stack;

/**
 *
 * @author Alamin
 */
public class stack_basic_example {

    public static void main(String a[]) {

        Stack<Integer> S = new Stack<>();//last in first out(LIFO)

        System.out.println("Empty Stack: " + S);
        System.out.println("Is stack empty: " + S.isEmpty());


        S.push(100);
        S.push(300);
        S.push(200);
        S.push(500);
        S.push(60);

        int i, size = S.size();

        for (i = 1; i <= size; i++) {
            System.out.println(i + ".pop stack: " + S.pop());
        }
        i = 1;
        
        S.push(100);
        S.push(300);
        S.push(200);
        S.push(500);
        S.push(60);
        
        while (!S.isEmpty()) {
            System.out.println(i + ".Pop: " + S.pop());
            i++;
        }

    }
}


/*Stack<Integer> stack = new Stack<>();
        System.out.println("Empty stack : "  + stack);
        System.out.println("Empty stack : "  + stack.isEmpty());
        // Exception in thread "main" java.util.EmptyStackException
        // System.out.println("Empty stack : Pop Operation : "  + stack.pop());
        stack.push(1001);
        stack.push(1002);
        stack.push(1003);
        stack.push(1004);
        System.out.println("Non-Empty stack : "  + stack);
        System.out.println("Non-Empty stack: Pop Operation : "  + stack.pop());
        System.out.println("Non-Empty stack : After Pop Operation : "  + stack);
        System.out.println("Non-Empty stack : search() Operation : "  + stack.search(1002));
        System.out.println("Non-Empty stack : "  + stack.isEmpty());
***/