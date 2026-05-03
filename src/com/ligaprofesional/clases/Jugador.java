package com.ligaprofesional.clases;

import java.time.LocalDate;

import com.ligaprofesional.enums.EstadoTraspaso;
import com.ligaprofesional.enums.Posicion;

/**
 * Clase de pruebas unitarias para la clase Jugador.
 * 
 * Se verifican funcionalidades como:
 * - Creación correcta de jugadores.
 * - Cambio de estado de traspaso.
 * - Solicitud y cancelación de traspasos.
 * - Validación de estados permitidos.
 * - Contador estático de jugadores.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */

public class Jugador extends Trabajador {
    private Posicion posicion;
    private EstadoTraspaso estadoTraspaso;
    private static int contadorJugadores;

    public Jugador(String nombre, LocalDate fechaDeNacimiento, Equipo equipo, Posicion posicion) {
        super(nombre, fechaDeNacimiento, equipo);
        this.posicion = posicion;
        this.estadoTraspaso = EstadoTraspaso.SIN_SOLICITAR;
        contadorJugadores++;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public EstadoTraspaso getEstadoTraspaso() {
        return estadoTraspaso;
    }

    public void setEstadoTraspaso(EstadoTraspaso estadoTraspaso) {
        this.estadoTraspaso = estadoTraspaso;
    }

    public void solicitarTraspaso() {
        if (estadoTraspaso == EstadoTraspaso.SIN_SOLICITAR) {
            this.estadoTraspaso = EstadoTraspaso.SOLICITADO;
            System.out.println("el jugador " + nombre + " ha solicitado el traspaso");
        } else {
            System.out.println("No se puede solicitar el traspaso");
        }

    }

    public void cancelarTraspaso() {
        if (estadoTraspaso == EstadoTraspaso.SOLICITADO) {

            this.estadoTraspaso = EstadoTraspaso.SIN_SOLICITAR;
            System.out.println("el jugador " + nombre + " ha cancelado el traspaso");
        } else {
            System.out.println("No se puede cancelar el traspaso");
        }
    }

    public void finalizarTraspaso() {
        this.estadoTraspaso = EstadoTraspaso.SIN_SOLICITAR;
    }

    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    @Override
    public String toString() {
        return "Ficha Tecnica del Jugador:"
                + "\n Nombre: " + nombre
                + "\n Fecha de nacimiento: " + fechaDeNacimiento
                + "\n Posicion: " + posicion
                + "\n Estado Traspaso: " + estadoTraspaso + "\n";
    }

}
