package ru.ya.olganow.List;

import ru.ya.olganow.Array.Apartmemt;

import java.util.List;

public class CourseExample {

    public static void main(String[] args) {

        Course oldGreek = new Course("Old Greek for all", 120, 20000);
        oldGreek.setTeacher(List.of("Ivanova", "Romanova"));
        Course latin = new Course("Latinfor all", 120, 25000);
        latin.setTeacher(List.of("Petrova", "Rodionova"));

        int i = 0;
        while (i < latin.teacher.size());{
            System.out.println("3OS  version : " + latin.teacher.get(i));
            i++;
       }
    }
}
