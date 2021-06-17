package service;

import model.Class;
import model.Student;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class StudentsManagement implements IStudentsManagement{
    public static Class[] classes = new Class[4];
    Scanner sc = new Scanner(System.in);

    static{
        classes[0] = new Class("B1", 01, )
    }

    @Override
    public Class selectClass() {
        return null;
    }

    @Override
    public void saveStudent(Student s) throws IOException {

    }

    @Override
    public void showStudent(Class c) {

    }

    @Override
    public void showAll() {

    }

    @Override
    public void updateStudent(Class s, int id, String name, Date dateOfBirth) {

    }

    @Override
    public void deleteStudent(Class s, int id) {

    }

    @Override
    public void deleteClass(Class s) {

    }

}
