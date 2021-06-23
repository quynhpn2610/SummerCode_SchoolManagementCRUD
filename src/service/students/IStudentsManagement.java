package service.students;

import model.Class;
import model.Student;
import service.general.IGeneralService;

import java.io.IOException;
import java.util.Date;

public interface IStudentsManagement extends IGeneralService<Student>{
    Class selectClass();
    }
