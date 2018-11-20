/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import concesionario.Person;
import javax.ejb.Local;

/**
 *
 * @author Brian Vanegas
 */
@Local
public interface PersonDAOLocal {

    void addPerson(Person person);
    
}
