package com.example.demo;

public class onlinecourse extends courses {
String url;
    
    public onlinecourse(String coursename, String teachername, String url) {
        super(coursename, teachername);
        this.url = url;
        
        
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public String toString() {
        return this.teachername + "-" + this.coursename + "-" + this.url;
    }

   
        
    
}
