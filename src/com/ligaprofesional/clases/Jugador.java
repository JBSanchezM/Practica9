package com.ligaprofesional.clases;

import java.time.LocalDate;

import com.ligaprofesional.enums.Posicion;

/**
 * Representa un jugador de la liga profesional.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */

public class Jugador extends Trabajador {
    private Posicion posicion;
    private boolean traspasoSolicitado;
    private static int contadorJugadores;

    /**
     * Constructor de la clase Jugador.
     * Crea un nuevo jugador con los datos básicos.
     * El traspaso se inicializa como no solicitado.
     * 
     * @param nombreCamiseta    Nombre del jugador en la camiseta
     * @param fechaDeNacimiento Fecha de nacimiento del jugador
     * @param posicion          Posición en la que juega
     */
    public Jugador(String nombre, LocalDate fechaDeNacimiento, Equipo equipo, Posicion posicion) {
        super(nombre, fechaDeNacimiento, equipo);
        this.posicion = posicion;
        this.traspasoSolicitado = false;
        contadorJugadores++;
    }

    /**
     * Devuelve la posicion del jugador.
     * 
     * @return posicion del jugador
     */
    public Posicion getPosicion() {
        return posicion;
    }

    /**
     * Modifica la posicion del jugador.
     * 
     * @param posicion nueva posicion del jugador
     */
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    /**
     * Indica si el jugador ha solicitado un traspaso.
     * 
     * @return true si ha solicitado traspaso, false en caso contrario
     */
    public boolean isTraspasoSolicitado() {
        return traspasoSolicitado;
    }

    /**
     * Indica que el jugador ha solicitado un traspaso
     * Cambia traspaso solicitado como true
     */
    public void solicitarTraspaso() {
        this.traspasoSolicitado = true;
        System.out.println("el jugador " + nombre + " ha solicitado el traspaso");
    }

    /**
     * Indica que el jugador ha cancelado un traspaso
     * Cambia traspaso solicitado como false
     */
    public void cancelarTraspaso() {
        this.traspasoSolicitado = false;
        System.out.println("el jugador " + nombre + " ha cancelado el traspaso");
    }

    /**
     * Finaliza el proceso de traspaso del jugador,
     * reseteando su estado de solicitud.
     */
    public void finalizarTraspaso() {
        this.traspasoSolicitado = false;
    }

    /**
     * Devuelve el número total de jugadores creados en el sistema.
     *
     * @return contador total de jugadores
     */
    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    /**
     * Devuelve una representación en textual del jugador con todos sus datos.
     * 
     * @return representacion legible del jugador
     */
    @Override
    public String toString() {
        return "Ficha Tecnica del Jugador:"
                + "\n Nombre: " + nombre
                + "\n Fecha de nacimiento: " + fechaDeNacimiento
                + "\n Posicion: " + posicion
                + "\n Traspaso solicitado: " + traspasoSolicitado + "\n";
    }

}
