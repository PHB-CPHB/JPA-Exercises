package test;


import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author philliphbrink
 */
public class Creator {

    public static void main(String[] args) {
        Persistence.generateSchema("JPA", null); //Change PU name
        
    }
}
