package com.neoteric.collections.streams.result;

public class SubjectsEntity {

    private String subjectName;

    private int marks;

    public SubjectsEntity(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    @Override
    public int hashCode() {
        return 7;
    }
}
