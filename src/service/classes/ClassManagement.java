package service.classes;

import model.Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassManagement implements IClassManagement{
    public static ArrayList<Classes> classesList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void save(Classes newClass){
        classesList.add(newClass);
    }

    @Override
    public void show(int classId) {
        if(classesList.isEmpty()){
            System.out.println("No class to show");
        }
        for (Classes c: classesList) {
            if(c.getId() == classId){
                System.out.println(c.toString());
            }
        }
    }

    @Override
    public void showAll() {
        if(classesList.isEmpty()){
            System.out.println("No class to show");
        }
        for (Classes c: classesList) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void update(int classId, Classes newClass) {
        int count = 0;
        if(classesList.isEmpty()){
            System.out.println("No class to update");
        }
        for (Classes c: classesList) {
            if(classId == c.getId()){
                c.setId(newClass.getId());
                c.setType(newClass.getType());
                c.setRate(newClass.getRate());
        }
            count++;
        }
        if (count == 0){
            System.out.println("Cannot update");
        }
        else{
            System.out.println("Class " + newClass.getId() + " successfully updated");
        }

    }

    @Override
    public void delete(int classId) {
        int count = 0;
        if(classesList.isEmpty()){
            System.out.println("No class to delete");
        }

        for (Classes c: classesList) {
            if(classId == c.getId()){
                classesList.remove(c);
            }
            count++;
        }

        if (count == 0){
            System.out.println("Cannot update");
        }
        else{
            System.out.println("Class successfully updated");
        }
    }
}
