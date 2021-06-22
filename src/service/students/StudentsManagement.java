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
    public void updateStudent(Class s, int id, String name, Date dateOfBirth) {

    }

    @Override
    public void deleteStudent(Class s, int id) {

    }


}
