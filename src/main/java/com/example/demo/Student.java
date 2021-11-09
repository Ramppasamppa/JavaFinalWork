package com.example.demo;

public class Student {
String firstName;
String lastName;
int id;
static int studentcounter=0;


public static int getStudentcounter() {
    return studentcounter;
}
public static void setStudentcounter(int studentcounter) {
    Student.studentcounter = studentcounter;
}
public int getId() {
    return id;
}

public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = studentcounter++;
}

@Override
    public String toString() {
        return this.lastName + "-" + this.firstName;
    }

    


}


