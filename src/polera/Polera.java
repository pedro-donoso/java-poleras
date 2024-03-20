package polera;

import java.util.ArrayList;

public class Polera {
  // ATRIBUTOS CLASE Polera
  String talla, marca;
  int precio;

  ArrayList<Polera> todasPoleras = new ArrayList<Polera>();

  // CONSTRUCTOR POR DEFECTO
  public Polera() {
  }

  // CONSTRUCTOR QUE LLENA LOS DATOS DE LA CLASE
  public Polera(String talla, String marca, int precio) {
    this.talla = talla;
    this.marca = marca;
    this.precio = precio;
  }

  // AGREGO MÉTODO
  public void mostrarPolera() {
    for (Polera poleraObjeto : todasPoleras) {
      System.out.println(
          "Talla: " + poleraObjeto.talla + " Marca: " + poleraObjeto.marca + " Precio: " + poleraObjeto.precio);
    }
  }

}
