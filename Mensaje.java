package javaapplication1;

public class Mensaje {
  int fecha;
  char descripcion;
  String nombre;

    public Mensaje(int fecha, char descripcion, String nombre) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public char getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(char descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    
}
