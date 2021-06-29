package view;

import model.Classes;
import model.Student;
import service.classes.ClassManagement;
import service.classes.IClassManagement;
import service.students.IStudentsManagement;
import service.students.StudentsManagement;

public class Main {
    public static void main(String[] args) {
        final IClassManagement classService = new ClassManagement();
        final IStudentsManagement studentService = new StudentsManagement();
        boolean condition = true;
        while (condition) {
            Menu.showMasterMenu();
            try {
                int userInput = Menu.getUserInput();
                switch (userInput) {
                    case 1:
                        Menu.showClassManagementMenu();
                        try {
                            int classManagementOption = Menu.getUserInput();
                            switch (classManagementOption) {
                                case 1:
                                    Classes newClass = Menu.getClassToAdd();
                                    classService.save(newClass);
                                    break;
                                case 2:
                                    int classId = Menu.getClassIdToSearch();
                                    classService.show(classId);
                                    break;
                                case 3:
                                    System.out.println("Show all classes");
                                    classService.showAll();
                                    break;
                                case 4:
                                    int classIdToUpdate = Menu.getClassIdToUpdate();
                                    Classes updatedClass = Menu.getNewClassInfo();
                                    classService.update(classIdToUpdate, updatedClass);
                                    break;
                                case 5:
                                    int classIdToDelete = Menu.getClassIdToDelete();
                                    classService.delete(classIdToDelete);
                                    break;
                                case 6:
                                    Menu.showMasterMenu();
                                    break;
                                case 7:
                                    System.out.println("Program closing!");
                                    condition = false;
                                    break;
                                default:
                                    System.out.println("Invalid input. Please try again.");
                            }
                        } catch (NumberFormatException exception) {
                            System.out.println("Invalid input format. Please try again.");
                        }
                        break;
                    case 2:
                        Menu.showStudentManagementMenu();
                        try {
                            int studentManagementOption = Menu.getUserInput();
                            switch (studentManagementOption) {
                                case 1:
                                    Student newStudent = Menu.getStudentToAdd();
                                    studentService.save(newStudent);
                                    break;
                                case 2:
                                    int studentId = Menu.getStudentIdToSearch();
                                    studentService.show(studentId);
                                    break;
                                case 3:
                                    System.out.println("Show all students");
                                    studentService.showAll();
                                    break;
                                case 4:
                                    int studentIdToUpdate = Menu.getStudentIdToUpdate();
                                    Student updatedStudent = Menu.getNewStudentInfo();
                                    studentService.update(studentIdToUpdate, updatedStudent);
                                    break;
                                case 5:
                                    int studentIdToDelete = Menu.getStudentIdToDelete();
                                    studentService.delete(studentIdToDelete);
                                    break;
                                case 6:
                                    Menu.showMasterMenu();
                                    break;
                                case 7:
                                    System.out.println("Program closing!");
                                    condition = false;
                                    break;
                                default:
                                    System.out.println("Invalid input. Please try again.");

                            }

                        } catch (NumberFormatException exception2) {
                            System.out.println("Invalid input format. Please try again.");
                        }
                        break;
                    case 3:
                        System.out.println("Program closing! Bye");
                        condition = false;
                        break;
                    default:
                        System.out.println("Invalid input. Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid option");
            }
        }
    }
}
