//Esta es una clase POJO: porque contiene atributos,constructor(es),geter y setter
package lec01;

public class Persona {
    
    private double iva = 0.13;
    private String nombre;
    private int edad;
    private int cedula;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.cedula = 0;
    }

    public double getIva() {
        return iva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
}
