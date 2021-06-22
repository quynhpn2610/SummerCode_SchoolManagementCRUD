package service.classes;

import model.Class;

public interface IClassManagement {
    void save(Class c);

    void show(int classId);

    void update(int classId, int newId, String newType, double newRate);

    void delete(int classId);

    Class selectClass();
}
