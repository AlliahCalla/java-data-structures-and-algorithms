package com.alliah;

import java.util.stream.*;
import java.util.*;

public class TestResults
{
    public static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }
    }

    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
        List<Student> passingStudents = new ArrayList<>();
        List<String> orderedStudents = new ArrayList<>();
        students.forEach(student -> {
            if(student.score >= passingScore)
                passingStudents.add(student);
        });

        passingStudents.sort(Comparator.comparing(Student::getScore));

       passingStudents.forEach(student -> {
           orderedStudents.add(student.name);

       });
        return orderedStudents;

    }
}
