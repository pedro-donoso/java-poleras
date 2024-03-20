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

  // AGREGO MÉTODO agregarPolera
  public void agregarPolera(String talla, String marca, int precio) {
    PoleraClase Polera = new PoleraClase(talla, marca, precio);
    todasPoleras.add(Polera); 
  }

  // AGREGO MÉTODO mostrarDatos
  public void mostrarDatos() {
    System.out.println("Talla: " + talla);
    System.out.println("Marca: " + marca);
    System.out.println("Precio: " + precio);
  }
  
  public void mostrarPoleras() {
    if(todasPoleras.isEmpty()) {
      System.out.println("No hay poleras");
      return;
    }
    for (PoleraClase Polera : todasPoleras) {
      Polera.mostrarDatos();
    }
  }





}
