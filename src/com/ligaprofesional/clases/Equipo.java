package com.ligaprofesional.clases;

import java.util.ArrayList;

import com.ligaprofesional.enums.EstadoTraspaso;

/**
 * Clase de pruebas unitarias para la clase Equipo.
 * 
 * Se prueban funcionalidades como:
 * - Creación de equipos.
 * - Asignación de entrenadores.
 * - Añadir jugadores a la plantilla.
 * - Transferencia de jugadores entre equipos.
 * - Verificación del contador estático de equipos.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */
public class Equipo {

    private String nombreEquipo;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;
    private static int contadorEquipos;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = null;
        this.jugadores = new ArrayList<Jugador>();
        contadorEquipos++;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void añadirJugador(Jugador j) {
        jugadores.add(j);

    }

    public void verPlantilla() {
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i));
        }
    }

    public void transferirJugador(Jugador jug, Equipo eq) {
        if (jugadores.contains(jug) && jug.getEstadoTraspaso() == EstadoTraspaso.APROBADO_POR_PRESIDENTE) {
            jugadores.remove(jug);
            eq.getJugadores().add(jug);
            jug.setEquipo(eq);
            jug.finalizarTraspaso();
            System.out.println("Transferencia realizada con exito");
        } else {
            System.out.println("Transferencia no realizada");
        }

    }

    public static int getContadorEquipos() {
        return contadorEquipos;
    }

    @Override
    public String toString() {
        return "Ficha Tecnica:"
                + "\n Equipo: " + nombreEquipo
                + "\n Entrenador: " + entrenador.getNombre()
                + "\n Jugadores: " + jugadores.size() + "\n";
    }

}
