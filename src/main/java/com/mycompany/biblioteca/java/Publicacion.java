package com.mycompany.biblioteca.java;

public class Publicacion {
  private String titulo;
private int yearPublicacion;

    public Publicacion (String titulo, int yearPublicacion) {
        this.titulo = titulo;
        this.yearPublicacion = yearPublicacion;
    }

    public void  mostrarInfo(){
        System.out.println("El titulo es: "+titulo+ "Año publicacion: "+yearPublicacion);     
    }




}
