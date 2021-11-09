package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class courses {
    String coursename;
    String teachername;
    List<Student> students = new ArrayList<>(); 
    static int counter=0;
    int id;

    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
    public String getTeachername() {
        return teachername;
    }
    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }
    public List<Student> getStudents() {

        return new ArrayList<>(students);
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        courses.counter = counter;
    }
    
    public int getId() {
        return id;
    }

    
    public courses(String coursename, String teachername) {
        this.coursename = coursename;
        this.teachername = teachername;
        this.id = counter++;
    }

    public Boolean addStudent(Student student){
        this.students.add(student);
        return true;
    }
    

}


