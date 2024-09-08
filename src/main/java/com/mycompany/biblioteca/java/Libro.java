package com.mycompany.biblioteca.java;

public class Libro extends Publicacion{

    private String autor;
    private int NumeroPaginas;

    public Libro(String titulo, int yearPublicacion,String autor,int NumeroPaginas) {
        super(titulo, yearPublicacion);
        this.NumeroPaginas = NumeroPaginas;
        this.autor = autor;
    }
    
    @Override
    public void mostrarInfo() {
     super.mostrarInfo(); System.out.println("El autor del libro es: "  +autor+ "/ Numero de paginas del libro: " +NumeroPaginas);
    }

  
    
}
