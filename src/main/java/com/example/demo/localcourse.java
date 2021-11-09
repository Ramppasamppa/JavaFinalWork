package com.example.demo;

public class localcourse extends courses {
String classnumber;
int classcapacity=25;



    public localcourse(String coursename, String teachername, String classnumber) {
        super(coursename, teachername);
        this.classnumber = classnumber;
    }
    

    public String getClassnumber() {
        return classnumber;
    }


    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    @Override
    public Boolean addStudent(Student student){
        if(this.students.size()>=25){ 
        this.students.add(student);
        return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        return this.teachername + "-" + this.coursename + "-" + this.classnumber;
    }
}
