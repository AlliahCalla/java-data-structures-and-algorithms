package com.alliah.arrays;

import java.util.*;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }


    public void insert(int item){
        if(items.length == count){
            int[] newItems = new int[count*2];

            for(int i = 0; i< count; i++)
            newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = item;

    }

    public void insertAt(int item, int index){
        if(index < 0 || index >= count+1)
            throw new IllegalArgumentException();

        int[] newItems = new int[count * 2];
        count++;

        for(int i = 0, j = 0; i < count; i++, j++){
            if(i == index)
                newItems[i++] =item;
            newItems[i] = items[j];
        }
        items = newItems;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int i = index;i < count; i++)
            items[i] = items[i+ 1];

        count--;
    }


    public int indexOf(int item){
        for(int i =0; i < count; i++)
            if(items[i] == item)
                return i;

        return -1;

    }

    public int max(){
        int result = items[0];

        for(int i = 1; i <= count; i++)
            if(result < items[i])
                result = items[i];

        return result;
    }

    public int[] intersect(int[] otherArray){
        ArrayList<Integer> intersection = new ArrayList<>();

        for(int item: otherArray)
            if(indexOf(item) != -1)
               intersection.add(item);

        return intersection.stream().mapToInt(Integer::intValue).toArray();

    }

    public int[] reverse(){
        int[] reversedItems = new int[count];
        for(int i = count - 1, j = 0; i >= 0; i--, j++)
            reversedItems[j] = items[i];
        return  reversedItems;

    }

    public void print(){
        for(int i =0; i < count; i++)
            System.out.println(items[i]);
    }

}
