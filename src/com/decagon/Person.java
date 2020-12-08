package com.decagon;
    public class Person {
        //characteristics of a person
        private String id;
        private String staffRoom;
        private String classRoom;

        //constructor 1 being used for principal and teachers
       public Person(String id, String staffRoom){
            this.id = id;
            this.staffRoom = staffRoom;
        }

        public void setId(String id){
            this.id = id;
        }
        public void setStaffRoom(String id){
            this.staffRoom = staffRoom;
        }

        public String getId() {
            return id;
        }

        public String getStaffRoom() {
            return staffRoom;
        }

        public void teachCourse(){
            System.out.println("I am teaching a course");
        }

        public  void takeCourse(){
            System.out.println("I am a student");
        }
    }
