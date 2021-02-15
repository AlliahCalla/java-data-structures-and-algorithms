package com.alliah;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();
        for(char ch: chars){
            var count = map.containsKey(ch) ? map.get(ch): 0;
            map.put(ch, count + 1);
        }

        for(char ch: chars)
            if(map.get(ch) == 1)
               return ch;


        return Character.MIN_VALUE;
    }
}
