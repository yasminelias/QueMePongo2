package com.company;

public class Institucion {
  String nombre;
  Uniforme uniforme;

  public Institucion(String nombre, Uniforme uniforme) {
   if (usuario.esAdmin()){
    this.nombre = requireNonNull(nombre,"fala agregar el nombre");
    this.uniforme = requireNonNull(uniforme,"fala agregar el uniforme");
  }
}
