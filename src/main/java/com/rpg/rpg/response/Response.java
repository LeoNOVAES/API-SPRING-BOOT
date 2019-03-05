/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.response;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leandro
 */
public class Response<T> {
    private T data;
    private List<String> erros;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List getErros() {
        if(this.erros == null){
            this.erros = new ArrayList<String>();
            
        }
        return erros;
    }

    public void setErros(List erros) {
        this.erros = erros;
    }
    
    
}
