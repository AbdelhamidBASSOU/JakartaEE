package dao;

import entity.Student;
import java.util.List;

public interface studentDao {
    void addStudent(Student s);
    void updateStudent(Student s);
    Student getStudent(int id);
    List<Student> getStudent();
}
