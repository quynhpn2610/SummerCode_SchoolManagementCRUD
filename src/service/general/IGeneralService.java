package service.general;

import model.Student;

public interface IGeneralService<T>{
    void save(T obj);

    void show(int key);

    void update(int key, T newT);   // 1 -> Ton  1-> Tin
                                    // 0 -> Tin newT.setId(1), xoa' Ton
                                    // 1 -> Tin
//    updateStudent
//    nhap vao id -> 1 -> Ton userIput = 1 id unique
//    nhap ten moi -> Tin
//    Student updatedStudent = new Student(0, "Tin");
//    studentList.remove student where student.id == userInput
//    updatedStudent.setId(userInput);
    void delete(int key);

}
