package com.decagon;

public class Main {

    public static void main(String[] args) {
	// Create objects
        Person principal = new Person("principal Card", "Block Z");
        Staffs staffs = new Staffs("staffCard", "block A");
        Students applicants = new Students("applicantId", "Hall");

        //methods
        principal.teachCourse();
        staffs.teachCourse();
        principal.setId("Principal says: "+"I am the principal, i have the masterCard");
        System.out.println(principal.getId());
        applicants.takeCourse();
    }
}

composition
inheritance
        interface
            aggregation

        methods are always verb, get name, walk breathe

                use method overloading  (it will make you use interface)
addStudents
        addCourses
