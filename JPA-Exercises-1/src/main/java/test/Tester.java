/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Book;
import entity.Customer;
import enums.CustomerType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author philliphbrink
 */
public class Tester {

    public static void main(String[] args) {
//        Tester t = new Tester();
//        t.test();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA1");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Book b = new Book();
        Book c = new Book("ongo");
        b.setTitle("hej");
        em.persist(b);
        em.persist(c);
        Customer cu = new Customer("Allan", "Madsen", CustomerType.RUSTY);
        em.persist(cu);
        Query a = em.createQuery("SELECT * FROM Customer WHERE ID = 1");
        System.out.println(a.getParameter("FIRSTNAME"));
        // Bør man ikke hente en kunde ud og tilføje en enum til den specefikke bruger.
        em.getTransaction().commit();

    }

//    public void test () {
////        Books a = new Books("Hej med dig");
//        Books b = new Books("Det er godt");
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA1");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(b.getTitle());
//        em.getTransaction().commit();
//    }
}
