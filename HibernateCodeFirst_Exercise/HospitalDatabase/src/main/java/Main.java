import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    public static void main (String[] args){
        EntityManager entityManager = Persistence.createEntityManagerFactory("soft_uni").createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}