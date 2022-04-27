package com.cc.java;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class App {
    
    public static void main(String[] args) {

        // Vorüberlegung
        // Cat cat1 = new Cat("Dessy");
        // Cat cat2 = new Cat("Tom");
        // Cat cat3 = new Cat("Flurry");
        // Cat cat4 = new Cat("Dessy");

        String [] nameArr = {"Tom","Timmy","Dizzy","Flurry","Bully"};

        ArrayList<Cat> catList = new ArrayList<>();
        
       


        for (int i = 0; i < nameArr.length; i++) {
            // new Cat(nameArr[i]); // Objekte, Aber keine Referenzen

            catList.add(new Cat(nameArr[i]));
       
            
        }



    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

