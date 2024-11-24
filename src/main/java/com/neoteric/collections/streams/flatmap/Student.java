package com.neoteric.collections.streams.flatmap;

import com.neoteric.collections.streams.result.SubjectsEntity;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;

    private String id;

    List<Subjects> subjectsList = new ArrayList<>();

    public Student(String name, String id, List<Subjects> subjectsList) {
        this.name = name;
        this.id = id;
        this.subjectsList = subjectsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void add(Subjects subjects){
        this.subjectsList.add(subjects);
    }

    public List<Subjects> getSubjectsList() {
        return subjectsList;
    }
}
