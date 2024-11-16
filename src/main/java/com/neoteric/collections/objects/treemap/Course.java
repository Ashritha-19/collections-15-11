package com.neoteric.collections.objects.treemap;

public class Course implements Comparable<Course>{

    private String courseName;
    private int creditHours;

    public Course(String courseName, int creditHours) {
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }


    @Override
    public String toString() {
        return courseName + " (" + creditHours + " credit hours)";
    }

    @Override
    public int compareTo(Course other) {
        int creditComparison = Integer.compare(this.creditHours, other.creditHours);
        if (creditComparison != 0) {
            return creditComparison;
        }
        return this.courseName.compareTo(other.courseName);
    }
}
