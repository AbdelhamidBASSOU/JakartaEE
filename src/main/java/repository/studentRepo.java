package repository;

import entity.Student;
import java.util.ArrayList;

public interface studentRepo {
    int login(String Email, String Password);
    void logout();
    boolean updatePasswordById(String newPassword, long user_id);
    Student find(long id);
    Student findByEmail(String Email);
    ArrayList<Student> getAll();
    Student add(Student user);
    Student update(Student user);
    boolean delete(long id);
}
