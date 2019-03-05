/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.dto;

import javax.validation.constraints.NotEmpty;

/**
 *
 * @author leandro
 */
public class PersonsDTO {
    private String id;
    private String nome;
    private String raca;
    private String classe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @NotEmpty(message="Nome nao pode estar vazio")
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    
}
