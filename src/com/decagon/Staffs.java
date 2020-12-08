package com.decagon;

public class Staffs extends Person {
    //characteristics of a Staff as extended from Person Class
    private  String id;
    private String staffRoom;


    //constructor 3 being used for staff
    public Staffs (String id, String staffRoom){
        super(id, staffRoom);
    }



    @Override
    public void teachCourse() {
        System.out.println("Teacher says: "+"I am a teacher, I can teach any course");

    }

    @Override
    public void takeCourse() {
        super.takeCourse();
        System.out.println("I am taking a course, i have become a student");
    }
}
