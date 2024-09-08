package com.mycompany.biblioteca.java;

public class Principal {
    public static void main(String[] args) {
      
        Libro libro1 = new Libro("los anillos",2020,"KL leonor",3);
        libro1.mostrarInfo();
        
        Revista revista1 = new Revista ("Alquimista",2021,65,"Forbes");
        revista1.mostrarInfo();
        
    }
}
