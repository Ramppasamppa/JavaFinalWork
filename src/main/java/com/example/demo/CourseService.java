package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CourseService implements InterfaceServices {
    List<Student> students = new ArrayList<>(); 
    List<courses> courses = new ArrayList<>();

    @Override
    public List<Student> getStudents() {
        
        return this.students;
    }

    public CourseService() {

    }

    @Override
    public List<courses> getCourses() {
       
        return this.courses;
    }

    @Override
    public Student getStudentById(long studentId) {
        for (Student student : students) {
            if(student.getId()==studentId){
                return student;
            }
        }
     
        return null;
    }

    @Override
    public courses getCourseId(long courseId) {
        for(courses course : this.courses) {
            if(course.getId()==courseId){
                return course;
            }
        }
        
        return null;
    }

    @Override
    public List<courses> getCourseOfStudent(long studentId) {
        List<courses> studentcourses = new ArrayList<>();
        Student student = this.getStudentById(studentId);
       

        for (courses course : this.courses) {
            if(course.getStudents().contains(student)){
                studentcourses.add(course);

            }

        }
        
        return studentcourses;
    }

    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        courses course = this.getCourseId(courseId);
        Student student = this.getStudentById(studentId);
       

       
        return course.addStudent(student);
    }
    
}
