package com.atif.service;

public interface StudentService {
    void addStudent();
    void displayStudents();
    void updateStudent(int id, String newName);
    void deleteStudent(int id);
}