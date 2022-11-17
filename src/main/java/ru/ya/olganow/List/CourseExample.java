package ru.ya.olganow.List;

import utils.FakerGenerator;

import java.util.List;

public class CourseExample {

    public static void main(String[] args) {

        FakerGenerator fakerGenerator = new FakerGenerator();



        Course oldGreek = new Course("Old Greek for all", 120, 20000);
        oldGreek.setTeacher(List.of(fakerGenerator.generateRandomFirstName(), fakerGenerator.generateRandomFirstName(), fakerGenerator.generateRandomFirstName()));
        Course latin = new Course("Latin for all", 120, 25000);
        latin.setTeacher(List.of(fakerGenerator.generateRandomFirstName(), fakerGenerator.generateRandomFirstName()));

        System.out.println("Количество учителей древнегреческого: " + oldGreek.teacher.size());
        int i = 0;
        while (i < oldGreek.teacher.size()) {
            System.out.println("Учитель: " + oldGreek.teacher.get(i));
            i++;

        }
        System.out.println("Количество учителей латыни : " + latin.teacher.size());
        i=0;
        while (i < latin.teacher.size()) {
            System.out.println("Учитель: " + latin.teacher.get(i));
            i++;


        }
    }
}
