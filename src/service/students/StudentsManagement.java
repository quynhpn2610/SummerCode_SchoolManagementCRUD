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
    public Class selectClass() {
        try {
            System.out.println("------Select a class------");
            System.out.println("01 - A2 - Rate 4,000,000");
            System.out.println("02 - B1 - Rate 1,000,000");
            System.out.println("03 - B2 - Rate 1,500,000");
            int classType = Integer.parseInt(sc.nextLine());
            switch (classType) {
                case 1:
                    return new Class("A2", );
                case 2:
                    return classes[1];
                case 3:
                    return classes[2];
            }
        } catch (NumberFormatException exception) {
            System.out.println("Invalid input. Please try again.");
        }
        return null;
    }

    @Override
    public void save(Student obj) {

    }

    @Override
    public void show(int key) {

    }

    @Override
    public void update(int key, Student newT) {

    }

    @Override
    public void delete(int key) {

    }
}
