/*
Realiza un programa en donde exista una clase Jugador que contenga 
    nombre, 
    apellido, 
    posición y  
    número. 

 */
package Entidad;

/**
 *
 * @author MiriamNahuel
 */
public class Jugador {
    //atributos
    private String nombre;
    private String apellido;
    private String posicion;
    private int numero;
    private Jugador jugador;
    
    //constructores
    
    public Jugador(){}

    public Jugador(String nombre, String apellido, String posicion, int numero, Jugador jugador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
        this.jugador = jugador;
    }

    
    //GETTER & SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }


    
}
