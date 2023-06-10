/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class ServicioEquipo {

    public Equipo crearEquipo() {
        ArrayList<Jugador> jugadores = new ArrayList();
        Scanner lector = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Elige a tus jugadores:");
        for (int i = 0; i < 3; i++) {

            System.out.println("Nombre");
            String nombre = lector.next();

            System.out.println("Apellido");
            String apellido = lector.next();

            System.out.println("Posicion");
            String posicion = lector.next();

            System.out.println("Numero");
            int numero = lector.nextInt();
            Jugador jugador = null;

            jugadores.add(new Jugador(nombre, apellido, posicion, numero, jugador));
            
            System.out.println("-----------------------------------------------------");
        }

        return new Equipo(jugadores);

    }

    /**
     *
     * @param equipo
     */
    public void mostrarEquipo(Equipo equipo) {

        Iterator<Jugador> iterador = equipo.getJugadores().iterator();

        while (iterador.hasNext()) {
            Jugador jugador = iterador.next();
            System.out.println("Nombre: " + jugador.getNombre()
                    + ", Apellido: " + jugador.getApellido()
                    + ", Posición: " + jugador.getPosicion()
                    + ", Número: " + jugador.getNumero());
            
            System.out.println("------------------------------------------");
        }
    }
    //=======================================
}
