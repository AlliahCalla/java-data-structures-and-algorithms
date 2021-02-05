package com.alliah;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(','[','<','{');
    private final List<Character> rightBrackets = Arrays.asList(')',']','>','}');

    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()){
            if (isLeftBrace(ch))
                stack.push(ch);

            if(isRightBrace(ch)){
                if(stack.empty()) return false;
                var top = stack.pop();
                if(!bracketMatch(top,ch))return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isLeftBrace(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBrace(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean bracketMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);

    }

}
