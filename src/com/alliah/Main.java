package com.alliah;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] integers = {1, 2, 3, 3, 2, 1, 4};
        for(int number: integers)
            set.add(number);

        System.out.println(set);



    }

}
