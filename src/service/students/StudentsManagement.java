package service.students;

import model.Class;
import model.Student;
import service.students.IStudentsManagement;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class StudentsManagement implements IStudentsManagement {
    Scanner sc = new Scanner(System.in);

    @Override
    public void saveStudent(Student s) throws IOException {


    }

    @Override
    public void showStudent(int id) {

    }

    @Override
    public void updateStudent(int id, int newId, String newName, Date newDateOfBirth) {

    }

    @Override
    public void deleteStudent(int id) {

    }


}
