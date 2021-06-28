package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Classes implements Serializable {
    private String level;
    private int id;
    private double rate;
    private ArrayList<Student> students = new ArrayList<>();

    public Classes(String level, int id, double rate, ArrayList<Student> students) {
        this.level = level;
        this.id = id;
        this.rate = rate;
        this.students = students;
    }

    public Classes(String level, int id, double rate) {
        this.level = level;
        this.id = id;
        this.rate = rate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
                "level='" + level + '\'' +
                ", id=" + id +
                ", rate=" + rate +
                '}';
    }
}
