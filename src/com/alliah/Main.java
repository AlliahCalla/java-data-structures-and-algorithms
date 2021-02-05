package com.alliah;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    	String str ="abcd";
    	StringReverser reverser = new StringReverser();
    	var reversed =reverser.reverse(str);

        System.out.println(reversed);
    }
}
