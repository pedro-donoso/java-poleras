package polera;

import java.util.ArrayList;

public class Polera {
  // ATRIBUTOS CLASE Polera
  String talla, marca;
  int precio;

  ArrayList<Polera> poleras = new ArrayList<Polera>();

  // CONSTRUCTOR POR DEFECTO
  public Polera() {
  }

  public Polera(String talla, String marca, int precio) {
    this.talla = talla;
    this.marca = marca;
    this.precio = precio;
  }

}
