package trucobot;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dudut
 */
public class ClasseTeste implements Serializable {
    private int florChamada;


    public void setFlor(int florChamada) { // setar valor de chamar flor
            this.florChamada = florChamada;
    }
    public ClasseTeste() { // construtor com valor setado em -1 (pra n dar treta)
        this.florChamada = -1;
    }
    
    public void print() { // print
        System.out.println(florChamada);
    }
}