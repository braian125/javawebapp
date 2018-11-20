/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import concesionario.Person;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Brian Vanegas
 */
@Stateless
public class PersonDAO implements PersonDAOLocal {
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addPerson(Person person) {
        em.persist(person);
    }
    
    public void editPerson(Person person) {
        em.merge(person);
    }
    
    public void deletePerson(String personId) {
        em.remove(getPerson(personId));
    }
    
    public Person getPerson(String personId) {
        return em.find(Person.class, personId);
    }
    
    public List<Person> getAllPersons() {
        return em.createNamedQuery("Person.getAll").getResultList();
    }
}
