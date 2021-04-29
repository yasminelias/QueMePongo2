package com.company;

import java.util.List;

public class Uniforme  {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = requireNonNull(prendaSuperior,"falta prenda superior");
    this.prendaInferior = requireNonNull(prendaInferior,"falta prenda inferior");
    this.calzado = requireNonNull(calzado,"falta calzado");
  }

}
