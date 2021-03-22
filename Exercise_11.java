package com.app;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
// (a)
        Stack<String> str = new Stack<>();

        str.add("One");
        str.add("Two");
        str.add("Three");
// (b)
        str.remove(2);
        System.out.println(str);
// (c)
        Stack<String> str1 = new Stack<>();

        str1.add("One");
        str1.add("Two");
        str1.add("Three");

        System.out.println(str1.peek());
        System.out.println(str1);
// (d)
//      (b) Removing at the object at the top of this stack
//      (c) Looks at the object at the top of this stack without removing it from the stack.
        
// (e) The icon depicts a stack ☺ 

    }
}
