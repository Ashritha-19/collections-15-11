package com.neoteric.collections.example1;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentTest {

    public static void main(String[] args) {

        Map<String,Integer> marksMap = new HashMap<>();
        marksMap.put("Telugu",92);
        marksMap.put("English",67);
        marksMap.put("Hindi",96);
        marksMap.put("Maths",35);
        marksMap.put("Social",65);
        marksMap.put("Science",40);


       // Iterator<Map.Entry<String, Integer>> marksIterator = marksMap.entrySet().iterator();

        Set<Map.Entry<String,Integer>> marksEntry = marksMap.entrySet();
        Iterator<Map.Entry<String,Integer>> marksIterator = marksEntry.iterator();

        while (marksIterator.hasNext()){
            Map.Entry<String,Integer> entry = marksIterator.next();

            System.out.println("Subject: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }
}
