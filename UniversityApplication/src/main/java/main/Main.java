package main;

import university.Course;
import university.Enrollment;
import university.Student;

public class Main {
    public static void main(String[] args) {
        //create instance of Student
        Student student = new Student();
        student.studentId = 12345;
        student.name = "John Smith";

        //create instance of Course
        Course course = new Course();
        course.courseId = 1101;
        course.courseName = "CS101: Intro to Computer Science";

        //create instance of Enrollment
        Enrollment enrollment = new Enrollment();
        enrollment.student = student;
        enrollment.course = course;
        System.out.println("Enrolled Student: " + enrollment.student.studentId + "; " + enrollment.student.name);
        System.out.println("Enrolled Course: " + enrollment.course.courseId + "; " + enrollment.course.courseName);

    }
}
