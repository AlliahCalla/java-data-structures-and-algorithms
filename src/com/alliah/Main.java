package com.alliah;

import com.alliah.arrays.Array;
import com.alliah.linkedList.LinkedList;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
		var list = new LinkedList();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addFirst(0);
		list.addLast(70);

		var array = list.toArray();
		System.out.println(Arrays.toString(array));
		System.out.println(list.getKthFromTheEnd(5));








    }
}
