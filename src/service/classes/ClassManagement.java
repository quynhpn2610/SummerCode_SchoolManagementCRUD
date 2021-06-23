package service.classes;

import model.Class;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassManagement implements IClassManagement{
    ArrayList<Class> classList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void save(Class newClass) throws IOException {
        classList.add(newClass);
    }

    @Override
    public void show(int classId) {

    }

    @Override
    public void update(int key, Class newT) {

    }

    @Override
    public void delete(int classId) {

    }

}
