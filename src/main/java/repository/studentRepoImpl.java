package repository;
import dao.studentDao;
import entity.Student;
import dao.studentDaoImpl;

import java.util.ArrayList;

public class studentRepoImpl implements studentRepo {
studentDao studentDao=new studentDaoImpl();


    @Override
    public Student add(Student s) {
        return studentDao.add(s);
    }


}
