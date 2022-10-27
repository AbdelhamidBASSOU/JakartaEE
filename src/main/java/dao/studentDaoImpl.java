package dao;

import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class studentDaoImpl implements studentDao {

    @Override
    public Student add(Student s) {
        System.out.println("1");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

        EntityManager entityManager = emf.createEntityManager();
        System.out.println("2");
        entityManager.getTransaction().begin();
        entityManager.persist(s);
        entityManager.getTransaction().commit();
        entityManager.close();
        return s;

    }
}


