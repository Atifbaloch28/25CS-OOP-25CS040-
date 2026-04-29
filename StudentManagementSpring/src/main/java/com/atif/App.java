package com.atif;

import com.atif.service.CourseService;
import com.atif.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService =
                (StudentService) context.getBean("studentService");

        CourseService courseService =
                (CourseService) context.getBean("courseService");

        // Read
        studentService.displayStudents();
        courseService.displayCourses();

        // Create
        studentService.addStudent();

        // Update
        studentService.updateStudent(2, "Bilal");

        // Delete
        studentService.deleteStudent(1);

        // Final Output
        studentService.displayStudents();
    }
}