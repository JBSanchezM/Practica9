package com.ligaprofesional.clases;

import java.util.ArrayList;

/**
 * Representa un Equipo de la liga profesional.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */
public class Equipo {

    private String nombreEquipo;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;
    private static int contadorEquipos;

    /**
     * Constructor de la clase Equipo.
     * Crea un equipo con nombre indicado, sin entrenador asignado
     * y con una lista vacía de jugadores.
     * 
     * @param nombreEquipo nombre del equipo.
     */
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = null;
        this.jugadores = new ArrayList<Jugador>();
        contadorEquipos++;
    }

    /**
     * Devuelve el nombre del equipo.
     * 
     * @return nombre del equipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * Devuelve el entrenador asignado al equipo.
     * 
     * @return entrenador asignado
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * Devuelve la lista de jugadores del equipo.
     * 
     * @return lista de jugadores del equipo.
     */
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Asigna un entrenador al equipo
     * 
     * @param entrenador nuevo entrenador del equipo
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * Añade un jugador al equipo.
     * No se realizan comprobaciones de duplicados.
     * 
     * @param j jugador a añadir al equipo
     */
    public void añadirJugador(Jugador j) {
        jugadores.add(j);

    }

    /**
     * Muestra por consola la plantilla del equipo,
     * mostrando la información de cada jugador.
     */
    public void verPlantilla() {
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i));
        }
    }

    /**
     * Transfiere un jugador desde este equipo a otro equipo,
     * siempre que pertenezca al equipo actual y haya solicitado el traspaso.
     * 
     * @param jug jugador a transferir
     * @param eq  equipo destino
     */

    public void transferirJugador(Jugador jug, Equipo eq) {
        if (jugadores.contains(jug) == true && jug.getEstadoTraspaso()) {
            jugadores.remove(jug);
            eq.getJugadores().add(jug);
            jug.finalizarTraspaso();
            System.out.println("Transferencia realizada con exito");
        } else
            System.out.println("Transferencia no realizada");

    }

    /**
     * Devuelve el número total de equipos creados en el sistema.
     * 
     * @return número total de equipos creados
     */
    public static int getContadorEquipos() {
        return contadorEquipos;
    }

    /**
     * Devuelve una representación en texto del equipo con su informacion basica.
     * 
     * @return Ficha tecnica que muestra el nombre del equipo, el nombre del
     *         entrenador y la cantidad de jugadores del equipo.
     */

    @Override
    public String toString() {
        return "Ficha Tecnica:"
                + "\n Equipo: " + nombreEquipo
                + "\n Entrenador: " + entrenador.getNombre()
                + "\n Jugadores: " + jugadores.size() + "\n";
    }

}
