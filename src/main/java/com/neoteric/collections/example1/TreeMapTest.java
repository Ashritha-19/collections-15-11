package com.neoteric.collections.example1;

import java.util.*;

public class TreeMapTest {

    public static void main(String[] args) {

        Map<String,Integer> sortedMarksMap = new TreeMap<>();
        sortedMarksMap.put("Telugu",92);
        sortedMarksMap.put("English",67);
        sortedMarksMap.put("Hindi",96);
        sortedMarksMap.put("Maths",35);
        sortedMarksMap.put("Social",65);
        sortedMarksMap.put("Science",40);


        // Iterator<Map.Entry<String, Integer>> marksIterator = marksMap.entrySet().iterator();

     /*   Set<Map.Entry<String,Integer>> marksEntry = sortedMarksMap.entrySet();
        Iterator<Map.Entry<String,Integer>> marksIterator = marksEntry.iterator();

        while (marksIterator.hasNext()){
            Map.Entry<String,Integer> entry = marksIterator.next();

            System.out.println("Subject: " + entry.getKey() + ", Marks: " + entry.getValue());
        }   */

        // Streams:-

        sortedMarksMap.entrySet().stream().forEach(entry -> {
            System.out.println("key:-" + entry.getKey()+","+ "value:-" + entry.getValue());
        });



    }
}
