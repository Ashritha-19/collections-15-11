package com.neoteric.collections.collections.enums;

import java.util.EnumMap;

public class EnumMapTest {
        public static void main(String[] args) {

            EnumMap<Subject, Teacher> subjectTeachers = new EnumMap<>(Subject.class);


            subjectTeachers.put(Subject.MATH, new Teacher("Sridevi", 10));
            subjectTeachers.put(Subject.SCIENCE, new Teacher("Sarvani", 8));
            subjectTeachers.put(Subject.HISTORY, new Teacher("Jaya Lakshmi", 12));
            subjectTeachers.put(Subject.ENGLISH, new Teacher("Ram Prasad", 5));
            subjectTeachers.put(Subject.Telugu, new Teacher("AdiLakshmi", 7));


            System.out.println("Subject - Teacher Assignments:");
            for (Subject subject : subjectTeachers.keySet()) {
                System.out.println(subject + ": " + subjectTeachers.get(subject));
            }

            System.out.println("\nTeacher for SCIENCE:");
            System.out.println(subjectTeachers.get(Subject.SCIENCE));

            System.out.println("\nUpdating teacher for HISTORY...");
            subjectTeachers.put(Subject.HISTORY, new Teacher("NagaMani", 15));
            System.out.println("Updated Teacher for HISTORY: " + subjectTeachers.get(Subject.HISTORY));

            System.out.println("\nRemoving teacher for ART...");
            subjectTeachers.remove(Subject.Telugu);


            System.out.println("\nSubject - Teacher Assignments After Removal:");
            for (Subject subject : subjectTeachers.keySet()) {
                System.out.println(subject + ": " + subjectTeachers.get(subject));
            }
        }
    }


