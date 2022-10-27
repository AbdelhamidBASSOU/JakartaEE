package service;

import entity.Student;
import repository.studentRepo;
import repository.studentRepoImpl;

import java.util.ArrayList;

public class studentServiceImpl implements studentService {
   studentRepo studentRepo = new studentRepoImpl();
    @Override
    public Student add(Student s) {
        return studentRepo.add(s);

    }


}
