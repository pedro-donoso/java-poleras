package polera;
import java.util.ArrayList;

public class PoleraClase {
  // ATRIBUTOS CLASE Polera
  String talla, marca;
  int precio;

  ArrayList<PoleraClase> todasPoleras = new ArrayList<PoleraClase>();

  // CONSTRUCTOR POR DEFECTO
  public PoleraClase() {
  }

  // CONSTRUCTOR QUE LLENA LOS DATOS DE LA CLASE
  public PoleraClase(String talla, String marca, int precio) {
    this.talla = talla;
    this.marca = marca;
    this.precio = precio;
  }

  // AGREGO MÉTODO
  public void mostrarPolera() {
    for (PoleraClase poleraObjeto : todasPoleras) {
      System.out.println(
          "Talla: " + poleraObjeto.talla + " Marca: " + poleraObjeto.marca + " Precio: " + poleraObjeto.precio);
    }
  }

}
