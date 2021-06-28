package view;

import model.Classes;
import model.Student;
import service.classes.ClassManagement;
import service.students.StudentsManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Menu {
    private static final Scanner sc = new Scanner(System.in);
    private static final StudentsManagement studentsManagement = new StudentsManagement();
    private static final ClassManagement classManagement = new ClassManagement();

    static void showMasterMenu(){
        System.out.println("Welcome to the School Management program");
        System.out.println("------Please select an option------");
        System.out.println("1 - Class Management");
        System.out.println("2 - Student Management");
        System.out.println("3 - Quit program");
    }

    public static void showClassManagementMenu() {
        System.out.println("___ Class Management ____");
        System.out.println("1 - Add a new class");
        System.out.println("2 - Search a class by ID");
        System.out.println("3 - Show all classes");
        System.out.println("4 - Update a class");
        System.out.println("5 - Delete a class");
        System.out.println("6 - Back to main menu");
        System.out.println("7 - Quit");
    }

    public static void showStudentManagementMenu() {
        System.out.println("___ Student Management ___");
        System.out.println("1 - Add a new student");
        System.out.println("2 - Search a student by id");
        System.out.println("3 - Show all students");
        System.out.println("4 - Update a student");
        System.out.println("5 - Delete a student");
        System.out.println("6 - Back to main menu");
        System.out.println("7 - Quit");
    }

    static int getUserInput(){
        return Integer.parseInt(sc.nextLine());
    }

    static Classes getClassToAdd(){
        System.out.println("---Add a new class---");
        System.out.println("Enter class level: ");
        String classLevel = sc.nextLine();
        System.out.println("Enter class id: ");
        int classId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter class rate: ");
        int rate = Integer.parseInt(sc.nextLine());
        return new Classes(classLevel, classId, rate);
    }

    static int getClassIdToSearch() {
        System.out.println("---Search for a class---");
        System.out.println("Enter product Id to search");
        return Integer.parseInt(sc.nextLine());
    }

    static int getClassIdToUpdate() {
        System.out.println("---Update a class---");
        System.out.println("Enter class id");
        return Integer.parseInt(sc.nextLine());
    }

    static Classes getNewClassInfo() {
        System.out.println("Enter new class level");
        String newLevel = sc.nextLine();
        System.out.println("Enter new class id");
        int newId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter new rate");
        int newRate = Integer.parseInt(sc.nextLine());
        return new Classes(newLevel, newId, newRate);
    }

    static int getClassIdToDelete() {
        System.out.println("---Delete a class---");
        System.out.println("Enter class id");
        return Integer.parseInt(sc.nextLine());
    }


    static Student getStudentToAdd() throws ParseException {
        System.out.println("---Add a new student---");
        System.out.println("Enter student id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student DOB (dd/mm/yyyy): ");
        String dOb = sc.nextLine();
        Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dOb);
        return new Student(id, name, dateOfBirth);
    }

    static int getStudentIdToSearch() {
        System.out.println("---Search for a student---");
        System.out.println("Enter student Id to search");
        return Integer.parseInt(sc.nextLine());
    }

    static int getStudentIdToUpdate() {
        System.out.println("---Update a student---");
        System.out.println("Enter student id");
        return Integer.parseInt(sc.nextLine());
    }

    static Student getNewStudentInfo() throws ParseException {
        System.out.println("Enter new student id");
        int newId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter new name");
        String newName = sc.nextLine();
        System.out.println("Enter new date of birth");
        String dOb = sc.nextLine();
        Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dOb);
        return new Student(newId, newName, dateOfBirth);
    }

    static int getStudentIdToDelete() {
        System.out.println("---Delete a student---");
        System.out.println("Enter student id");
        return Integer.parseInt(sc.nextLine());
    }





}

