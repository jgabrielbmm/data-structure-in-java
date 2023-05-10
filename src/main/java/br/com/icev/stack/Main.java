package br.com.icev.stack;

import br.com.icev.stack.implementation.MathExpressionVerificationStack;
import br.com.icev.stack.implementation.Stack;

public class Main {
    public static void main(String[] args) {
       /*
        Implements in Java an algorithm that receives a mathematics expression and determines
        if it is correct or not in terms of two mathematics expressions and its grouping symbols.
        */

        MathExpressionVerificationStack validation = new MathExpressionVerificationStack();

        System.out.println(validation.expressionVerification("x+2+](y + 4)]"));
    }

}
