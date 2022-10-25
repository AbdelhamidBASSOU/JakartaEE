import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Student student =new Student();
        student.setfName("abdel");
        student.setlName("bass");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
