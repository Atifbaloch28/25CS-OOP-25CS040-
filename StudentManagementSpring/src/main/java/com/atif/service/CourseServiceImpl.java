package com.atif.service;

import com.atif.model.Course;


import java.util.ArrayList;
import java.util.List;


public class CourseServiceImpl implements CourseService {

    private List<Course> courses = new ArrayList<>();

    public CourseServiceImpl() {
        courses.add(new Course("Java Programming", 4));
        courses.add(new Course("Python Development", 3));
        courses.add(new Course("Spring Framework", 2));
    }

    @Override
    public void displayCourses() {
        System.out.println("===== AVAILABLE COURSES =====");
        for (Course c : courses) {
            System.out.println(c);
        }
        System.out.println();
    }
}