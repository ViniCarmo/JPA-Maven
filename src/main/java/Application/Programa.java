package Application;

import Dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Joao Paulo", "joaopaulo@gmail.com");
        Pessoa p2 = new Pessoa(null, "Paulo Jesus", "PauloJesus@gmail.com");
        Pessoa p3 = new Pessoa(null, "Marcela Almeida", "marcelaalmeida@gmail.com");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /* add no banco
        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);
        entityManager.getTransaction().commit();
         */

        /* Imprimindo cadstro do banco
        Pessoa p = entityManager.find(Pessoa.class,2);
        System.out.println(p);
         */

        entityManager.find(Pessoa.class, 2);
        entityManager.getTransaction().begin();
        entityManager.remove(2);
        entityManager.getTransaction().commit();
        System.out.println("Pronto");
    }
}
