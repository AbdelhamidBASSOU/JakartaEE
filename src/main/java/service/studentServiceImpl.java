package service;

import entity.Student;

import java.util.ArrayList;

public class studentServiceImpl implements studentService {
    @Override
    public int login(String Email, String Password) {
        return 0;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean updatePasswordById(String newPassword, long user_id) {
        return false;
    }

    @Override
    public Student find(long id) {
        return null;
    }

    @Override
    public Student findByEmail(String Email) {
        return null;
    }

    @Override
    public ArrayList<Student> getAll() {
        return null;
    }

    @Override
    public Student add(Student user) {
        return null;
    }

    @Override
    public Student update(Student user) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
