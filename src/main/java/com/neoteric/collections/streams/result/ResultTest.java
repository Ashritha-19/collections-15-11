package com.neoteric.collections.streams.result;

import java.util.ArrayList;
import java.util.List;

public class ResultTest {

    public static void main(String[] args) {

        List<SubjectsEntity> subjectsEntityList = new ArrayList<>();
        subjectsEntityList.add(new SubjectsEntity("Telugu",89));
        subjectsEntityList.add(new SubjectsEntity("Hindi",76));
        subjectsEntityList.add(new SubjectsEntity("English",70));
        subjectsEntityList.add(new SubjectsEntity("Maths",35));
        subjectsEntityList.add(new SubjectsEntity("Social",69));
        subjectsEntityList.add(new SubjectsEntity("Science",50));






        // using foreach
     subjectsEntityList.stream().forEach(subjectsEntity -> {
          String result = subjectsEntity.getMarks()>= 35 ? "Passed" : "Failed";
          System.out.println(subjectsEntity.getSubjectName()+ ":" + result);

         System.out.println(subjectsEntity.getSubjectName().hashCode());

      });

       // using map and filter

      /*  boolean isStudentPassed = subjectsEntityList.stream()
                .map(subjectsEntity -> subjectsEntity.getMarks())
                .filter(marks -> marks >= 35).count() == subjectsEntityList.size();

        String result = isStudentPassed ? "Passed" : "Failed" ;

        System.out.println(result); */

    }
}
