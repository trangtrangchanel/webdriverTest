/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Student;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author saotr
 */
@WebService(serviceName = "StudentWebservice")
public class StudentWebservice {

    @WebMethod
    public List<Student> findAll() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestWSPU");
        EntityManager em = factory.createEntityManager();

        Query q = em.createNamedQuery("Student.findAll", Student.class);
        return q.getResultList();
    }

    //INSERT OR UPDATE 
    @WebMethod
    public void save(Student std) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestWSPU");
        EntityManager em = factory.createEntityManager();

        Student stdFind = em.find(Student.class, std.getId());

        //insert & update
        em.getTransaction().begin();
        if (stdFind == null) {
            em.persist(std);
        } else {
            stdFind.setFullname(std.getFullname());
            stdFind.setIdclass(std.getIdclass());
            stdFind.setBirdplace(std.getBirdplace());
            stdFind.setBirdday(std.getBirdday());
        }
        em.getTransaction().commit();
    }

    @WebMethod
    public void delete(Integer id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestWSPU");
        EntityManager em = factory.createEntityManager();

        Student stdFind = em.find(Student.class, id);

        if (stdFind != null) {
            em.getTransaction().begin();
            em.remove(stdFind);
            em.getTransaction().commit();
        }
    }

    @WebMethod
    public Student find(Integer id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestWSPU");
        EntityManager em = factory.createEntityManager();

        Student stdFind = em.find(Student.class, id);

        return stdFind;
    }
}
