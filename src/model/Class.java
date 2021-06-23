package model;

import java.util.ArrayList;

public class Class {
    private String type;
    private int id;
    private double rate;
    private ArrayList<Student> students = new ArrayList<>();

    public Class(String type, int id, double rate, ArrayList<Student> students) {
        this.type = type;
        this.id = id;
        this.rate = rate;
        this.students = students;
    }

    public Class(String type, int id, double rate) {
        this.type = type;
        this.id = id;
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudents(Student s){
        students.add(s);
    }

    @Override
    public String toString() {
        return "Class{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", rate=" + rate +
                '}';
    }
}
