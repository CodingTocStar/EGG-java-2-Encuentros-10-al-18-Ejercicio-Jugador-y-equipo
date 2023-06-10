/*
Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author MiriamNahuel
 */
public class Equipo {
    //ATRIBUTO
    private ArrayList<Jugador> jugadores;
    
    //CONSTRUCTORES
    public Equipo(){}

    public Equipo(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    //GETTER & SETTER

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
}
