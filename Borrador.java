package com.company;

import java.util.List;

public class Borrador {
  TipoPrenda tipoPrenda;
  Material material;
  Trama trama;
  Color color;
  Color colorSecundario;
  List<Prenda> prendas;
  void cargarTipoPrenda(TipoPrenda tipo){
    this.tipoPrenda = tipo;
  }
  void cargarPrenda(Material material,Trama trama ,Color color, Color colorSecundario){
    this.material = material;
    this.trama = trama;
    this.color=color;
    this.colorSecundario = colorSecundario;
  }

  Prenda crearPrenda(){
    return new Prenda(tipoPrenda,material,trama,color,colorSecundario);
  }
}
