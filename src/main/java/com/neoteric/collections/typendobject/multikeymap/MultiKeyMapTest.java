package com.neoteric.collections.typendobject.multikeymap;

import org.apache.commons.collections4.keyvalue.MultiKey;
import org.apache.commons.collections4.map.MultiKeyMap;

public class MultiKeyMapTest {


        public static void main(String[] args) {

            MultiKeyMap<String, Grade> grades = new MultiKeyMap<>();

            grades.put(new MultiKey<>("Semester 1", "Math"), new Grade("Krish", 85.0));
            grades.put(new MultiKey<>("Semester 1", "Science"), new Grade("Krish", 90.0));
            grades.put(new MultiKey<>("Semester 2", "Math"), new Grade("Krish", 88.0));
            grades.put(new MultiKey<>("Semester 2", "Science"), new Grade("Krish", 92.0));
            grades.put(new MultiKey<>("Semester 2", "History"), new Grade("Krish", 75.0));

            System.out.println("All Grades:");
            for (MultiKey<? extends String> key : grades.keySet()) {
                System.out.println("Semester: " + key.getKey(0) +
                        ", Subject: " + key.getKey(1) +
                        " => " + grades.get(key));
            }


            System.out.println("\nGrade for Semester 2 - Science:");
            System.out.println(grades.get(new MultiKey<>("Semester 2", "Science")));


            System.out.println("\nUpdating grade for Semester 1 - Math...");
            grades.put(new MultiKey<>("Semester 1", "Math"), new Grade("Ashri", 95.0));
            System.out.println("Updated Grade: " + grades.get(new MultiKey<>("Semester 1", "Math")));

            System.out.println("\nRemoving grade for Semester 2 - History...");
            grades.remove(new MultiKey<>("Semester 2", "History"));

            System.out.println("\nGrades After Removal:");
            for (MultiKey<? extends String> key : grades.keySet()) {
                System.out.println("Semester: " + key.getKey(0) +
                        ", Subject: " + key.getKey(1) +
                        " => " + grades.get(key));
            }
        }
}

