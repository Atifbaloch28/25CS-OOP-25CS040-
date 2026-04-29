package com.atif.service;

import com.atif.model.Student;


import java.util.ArrayList;
import java.util.List;


public class StudentServiceImpl implements StudentService {

    private List<Student> students = new ArrayList<>();

    public StudentServiceImpl() {
        students.add(new Student(1, "Atif", "Java", 88.5));
        students.add(new Student(2, "Ali", "Python", 91.0));
        students.add(new Student(3, "Ahmed", "Spring", 85.0));
    }

    @Override
    public void addStudent() {
        students.add(new Student(4, "Hamza", "C++", 89.0));
        System.out.println("Student Added Successfully!\n");
    }

    @Override
    public void displayStudents() {
        System.out.println("===== STUDENT LIST =====");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public void updateStudent(int id, String newName) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                System.out.println("Student Updated Successfully!\n");
                return;
            }
        }
        System.out.println("Student Not Found!\n");
    }

    @Override
    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Student Deleted Successfully!\n");
    }
}