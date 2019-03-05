/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.controllers;

import com.rpg.rpg.models.Persons.Persons;
import com.rpg.rpg.reposyiores.PersonsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leandro
 */

@RestController
@RequestMapping(value="/api")
public class GetPersons {
    
    @Autowired
    PersonsRepository personRep;
    
    @GetMapping("/persons")
    public List<Persons> tteste(){
        return  personRep.findAll();
    }
    
    @GetMapping("/person/{id}")
    public Persons porId(@PathVariable(value="id") long id){
        return  personRep.findById(id);
    }
    
    @PostMapping("/cadastro")
    public Persons cadfun(@RequestBody Persons person){
          return personRep.save(person);
    }
    
}
