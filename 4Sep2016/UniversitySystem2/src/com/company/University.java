package com.company;

/**
 * Created by zeeshanhanif-pc on 9/4/2016.
 */
public class University {

    private String name;
    //private Student student;
    private Student student[];
    private int studentCount;

    public University(String name) {
        this.name = name;
        this.student = new Student[3];
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addStudent(Student student){
        if(studentCount == this.student.length){
            System.out.println("No space available");
        }
        else {
            this.student[studentCount] = student;
            studentCount++;
        }
    }
    public Student getStudent(){
        return this.student[0];
    }
    public Student getStudent(int index){
        if(index >=0 && index<this.studentCount){
            return this.student[index];
        }
        return null;

    }

}
