package ru.ya.olganow.List;

import utils.FakerGenerator;

import java.util.List;

public class Course {
    FakerGenerator fakerGenerator = new FakerGenerator();
    String courseName;
    int hours;
    int price;

    List<String> teacher;

    public Course(String courseName, int hours, int price) {
        this.courseName = courseName;
        this.hours = hours;
        this.price = price;
    }


    public void setTeacher(List<String> teacher) {
        this.teacher = teacher;
    }

}
