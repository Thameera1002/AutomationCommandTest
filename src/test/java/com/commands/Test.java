package com.commands;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Samantha", 1);
        map.put("Jessica", 2);
        map.put("Daniel", 3);


        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for(String item : list){
            System.out.println("Item: " + item);
        }

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
    }
}
