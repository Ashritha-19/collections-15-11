package com.neoteric.collections.collections.multikeymap;

public class Grade {
    private String studentName;
    private double score;


    public Grade(String studentName, double score) {
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return studentName + " (Score: " + score + ")";
    }
}
