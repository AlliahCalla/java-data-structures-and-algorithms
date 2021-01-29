package com.alliah;

import com.alliah.arrays.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Array numbers = new Array(3);
	numbers.insert(10);
	numbers.insert(20);
	numbers.insert(30);
	numbers.insert(40);
	numbers.insertAt(50,4);

	int[] compare = {10,50,60,40};
	numbers.print();

    }
}
