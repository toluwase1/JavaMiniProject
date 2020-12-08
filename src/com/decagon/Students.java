package com.decagon;

import com.decagon.Person;

public class Students extends Person {
    //characteristics of a Student as extended from Person Class
    private  String id;
    private String classRoom;


    //constructor 2 being used for students
    public Students (String id, String classRoom){
        super(id, classRoom);
    }

    @Override
    public void teachCourse() {
        System.out.println("I am now a teacher");

    }

    @Override
    public void takeCourse() {
        super.takeCourse();
        System.out.println("I am taking a course, i have become a student");
    }
}
