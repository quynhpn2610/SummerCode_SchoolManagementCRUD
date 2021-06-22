package service;

import model.Class;
import model.Student;

import java.io.IOException;
import java.util.Date;

public interface IStudentsManagement {

    void saveStudent(Student s) throws IOException;

    void showStudent(Class c);

    void showAll();

    void updateStudent(Class s, int id, String name, Date dateOfBirth);

    void deleteStudent(Class s, int id);

}
