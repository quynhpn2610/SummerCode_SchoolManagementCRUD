package view;

import model.Classes;
import service.classes.ClassManagement;
import service.students.StudentsManagement;

import java.util.Scanner;

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

    static int getClassIdToSearch() {
        System.out.println("---Search for a class---");
        System.out.println("Enter product Id to search");
        return Integer.parseInt(sc.nextLine());
    }



}

