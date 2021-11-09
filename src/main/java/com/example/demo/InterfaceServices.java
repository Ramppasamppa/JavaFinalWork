package com.example.demo;

import java.util.List;

public interface InterfaceServices {
     List<Student> getStudents();

     List<courses> getCourses();

     Student getStudentById(long studentId);

     courses getCourseId(long courseId);

     List<courses> getCourseOfStudent(long studentId);

     boolean addStudentToCourse(long studentId, long courseId);

     
}
