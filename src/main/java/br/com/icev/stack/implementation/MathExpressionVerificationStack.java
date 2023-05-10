package br.com.icev.stack.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathExpressionVerificationStack{
    Stack<Character> expressionStack = new Stack<>(Character.class, 50);

    public boolean expressionVerification(String expression){
        expression = expression.replace(" ", "");
        char[] expressionArray = expression.toCharArray();
        return bracketsValidation(expressionArray);
    }

    public boolean bracketsValidation(char[] charArray){
        Character[] openBracketsArray = {'(', '[', '{', '⎣', '⎡'};
        Character[] closedBracketsArray = {')', ']', '}', '⎦', '⎤'};

        List<Character> openBracketsList = Arrays.asList(openBracketsArray);
        List<Character> closedBracketsList = Arrays.asList(closedBracketsArray);

        for(char character : charArray){
            if(openBracketsList.contains(character)){
                expressionStack.push(character);
            }
            else if (!expressionStack.isEmpty() && closedBracketsList.contains(character)) {
                if(
                        (character == ')' && expressionStack.top == '(') ||
                        (character == ']' && expressionStack.top == '[') ||
                        (character == '}' && expressionStack.top == '{') ||
                        (character == '⎦' && expressionStack.top == '⎣') ||
                        (character == '⎤' && expressionStack.top == '⎡')
                ) {
                    expressionStack.pop();
                }
                else {
                    return false;
                }
            }
            else if (expressionStack.isEmpty() && closedBracketsList.contains(character)){
                return false;
            }
        }

        return expressionStack.isEmpty();
    }
}
