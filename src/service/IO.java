package service;
import model.Classes;
import java.io.*;
import java.util.ArrayList;

import static service.classes.ClassManagement.classesList;

public class IO {
    static final String filePath = System.getenv("filePath");
    public static File file = new File(filePath);

    public static void writeFile(ArrayList<Classes> classesList) throws IOException{
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        try{
            for (Classes c: classesList
                 ) {
                objectOutputStream.writeObject(c);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error");
        }
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static ArrayList<Classes> readFile() throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try {
            for (int i = 0; i < classesList.size(); i++) {
                Classes myClass = classesList.get(i);
                myClass = (Classes) objectInputStream.readObject();
            }
            objectInputStream.close();
            fileInputStream.close();
            return classesList;
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
