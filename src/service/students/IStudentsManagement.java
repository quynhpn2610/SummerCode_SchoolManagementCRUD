package service.students;

import model.Student;

import java.io.IOException;
import java.util.Date;

public interface IStudentsManagement{

    void saveStudent(Student s) throws IOException;

    void showStudent(int id);

    void updateStudent(int id, int newId, String newName, Date newDOB);

    void deleteStudent(int id);

}
