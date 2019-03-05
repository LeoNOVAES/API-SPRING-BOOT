/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.reposyiores;

import com.rpg.rpg.models.Persons.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author leandro
 */
public interface PersonsRepository  extends JpaRepository<Persons, Long>{
    Persons findById(long id);
}
