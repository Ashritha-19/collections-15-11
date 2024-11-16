package com.neoteric.collections.typendobject.enums;


public class Teacher {
    private String name;
    private int experienceYears;

    public Teacher(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }


    @Override
    public String toString() {
        return name + " (Experience: " + experienceYears + " years)";
    }
}
