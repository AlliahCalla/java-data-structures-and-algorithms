package com.alliah;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "a green apple";
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for(char ch: chars){
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch, count+1);
            }else
                map.put(ch, 1);
        }
        System.out.println(map);

        for(var ch: chars)
            if(map.get(ch) == 1){
                System.out.println(ch);
                break;
            }


        System.out.println(Character.MIN_VALUE);


    }

}
