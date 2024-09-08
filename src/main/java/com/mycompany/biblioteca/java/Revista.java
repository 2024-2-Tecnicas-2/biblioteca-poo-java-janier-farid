package com.mycompany.biblioteca.java;

public class Revista extends Publicacion {
    
    private int NumeroRevista;
    private String NombreRevista;
    
    public Revista(String titulo, int yearPublicacion,int NumeroRevista,String NombreRevista) {
        super(titulo, yearPublicacion);
        this.NumeroRevista = NumeroRevista;
        this.NombreRevista = NombreRevista;
        
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); System.out.println("Numero revista: "+NumeroRevista+ "Nombre revista: "+NombreRevista);
    }

}
