/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. 
Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Main;

import Entidad.Equipo;
import Entidad.Jugador;
import Servicio.ServicioEquipo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros10Al18EjercicioJugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //herramientas
        Scanner lector = new Scanner(System.in).useDelimiter("\n");
        
        //objetos
        Jugador jugador = new Jugador();
        
        //Equipo equipo = new Equipo();
        ServicioEquipo servicio = new ServicioEquipo();
        
        //logica
        Equipo equipo = servicio.crearEquipo();
        
        servicio.mostrarEquipo(equipo);
    }
    
}
