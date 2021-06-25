package service.students;

import model.Classes;
import model.Student;
import service.classes.ClassManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsManagement implements IStudentsManagement {
    ArrayList<Student> masterStudentList= new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    @Override
    public Classes selectClass() {
        try {
            System.out.println("------Select a class------");
            System.out.println(ClassManagement.classesList.toString());
            System.out.println("Input class ID: ");
            int inputClassId = Integer.parseInt(sc.nextLine());
            for (Classes c: ClassManagement.classesList) {
                if(c.getId() == inputClassId){
                    return c;
                }
            }

        } catch (NumberFormatException exception) {
            System.out.println("Invalid input. Please try again.");
        }
        return null;
    }

    @Override
    public void save(Student newStudent) {
        Classes selectedClass = selectClass();
        selectedClass.addStudents(newStudent);
        masterStudentList.add(newStudent);
        System.out.println("Student " + newStudent.getName() + " successfully added");
    }

    @Override
    public void show(int studentID) {
        for (Student s:
             masterStudentList) {
            if(s.getId() == studentID){
                System.out.println(s.toString());
            }
        }
    }

    @Override
    public void showAll() {
        for (Student s:
                masterStudentList){
            System.out.println(s.toString());
        }
    }

    @Override
    public void update(int id, Student updatedStudent) {
        int count = 0;
        if(masterStudentList.isEmpty()){
            System.out.println("No student to update");
        }
        for (Student s:
             masterStudentList) {
            if(s.getId() == id){
                s.setId(updatedStudent.getId());
                s.setName(updatedStudent.getName());
                s.setDateOfBirth(updatedStudent.getDateOfBirth());
            }
            count ++;
        }
        if(count == 0){
            System.out.println("Cannot update");
        }
        else {
            System.out.println("Student " + updatedStudent.getName() + " successfully updated");
        }

    }

    @Override
    public void delete(int id) {
        int count = 0;
        if(masterStudentList.isEmpty()){
            System.out.println("No student to delete");
        }
        for (Student s:
                masterStudentList) {
            if(s.getId() == id){
                masterStudentList.remove(s);
                ClassManagement.classesList.remove(s);
            }
            count ++;
        }
        if(count == 0){
            System.out.println("Cannot update");
        }
        else {
            System.out.println("Student successfully deleted");
        }
    }
}
