package br.com.icev.stack;

import br.com.icev.stack.implementation.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(Integer.class, 6);
        stack.push(1);
        stack.push(2);
        stack.push(7);
        stack.push(11);


        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.push(11);

        System.out.println(stack);

        System.out.println("Top is " + stack.top());
        System.out.println("Is empty " + stack.isEmpty());

        System.out.println(stack.top());


        System.out.println(stack.pop());

        System.out.println("Is empty " + stack.isEmpty());

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println("Stack size " + stack.getSize());

    }

}
