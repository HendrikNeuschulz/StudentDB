package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentDB {

    private Student[] studentList;

    public StudentDB(Student[] studentList) {
        this.studentList = studentList;
    }

    public Student[] getAllStudents() {
        return studentList;
    }

    public String toString() {
        return Arrays.toString(studentList);
    }

    public Student randomStudent() {
        int randomIndex = (int) (Math.random() * studentList.length);
        return studentList[randomIndex];
    }

    public void addStudent(Student newStudent) {
        studentList = Arrays.copyOf(studentList, studentList.length + 1);
        studentList[studentList.length - 1] = newStudent;
    }

    public void removeStudent(Student exStudent) {
        Student[] newStudentList = new Student[studentList.length - 1];
        int difference = 0;
        for (int i = 0; i < studentList.length; i++) {
            if (!studentList[i].equals(exStudent)) {
                newStudentList[i - difference] = studentList[i];
            } else {
                difference++;
            }
        }
        studentList = newStudentList;


    }

    public Student findById(int id) {
        List<Student> db = Arrays.asList(getAllStudents());
        try {
            for (Student student : db) {
                if (student.id == id) {
                    return student;
                }
            }
            throw new NoSuchElementException("Found no student with id " + id);
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            System.out.println("That's why I return a newly created one.");
            return new Student("no such student", id);
        }
    }


}
