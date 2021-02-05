package com.alliah;

public class Main {
    public static void main(String[] args) {
    	String str ="[([1 + 2])]";
    	Expression expression = new Expression();
    	var result = expression.isBalanced(str);
        System.out.println(result);

    }
}
