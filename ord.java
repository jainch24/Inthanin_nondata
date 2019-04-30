/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.myapp;

/**
 *
 * @author madmm
 */
public class ord {
    String id;
    String name;
    int unit;
    double price;
    
    public ord( String id,String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return String.format("Menu ID: "+id+"    "+"Menu: "+name+"    "+"price: "+price+" Baht");
    }
}
