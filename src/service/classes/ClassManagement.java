package service.classes;

import model.Class;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassManagement implements IClassManagement{
    public static ArrayList<Class> classList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void save(Class newClass){
        classList.add(newClass);
    }

    @Override
    public void show(int classId) {
        if(classList.isEmpty()){
            System.out.println("No class to show");
        }
        for (Class c: classList) {
            if(c.getId() == classId){
                System.out.println(c.toString());
            }
        }
    }

    @Override
    public void showAll() {
        if(classList.isEmpty()){
            System.out.println("No class to show");
        }
        for (Class c: classList) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void update(int classId, Class newClass) {
        int count = 0;
        if(classList.isEmpty()){
            System.out.println("No class to update");
        }
        for (Class c: classList) {
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
        if(classList.isEmpty()){
            System.out.println("No class to delete");
        }

        for (Class c: classList) {
            if(classId == c.getId()){
                classList.remove(c);
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
