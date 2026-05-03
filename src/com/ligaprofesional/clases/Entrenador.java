package com.ligaprofesional.clases;

import java.time.LocalDate;

import com.ligaprofesional.enums.EstadoTraspaso;
import com.ligaprofesional.enums.Formacion;
import com.ligaprofesional.interfaces.GestorTraspasos;

/**
 * Clase de pruebas unitarias para la clase Entrenador.
 * 
 * Se validan funcionalidades relacionadas con:
 * - Creación de entrenadores.
 * - Gestión de aprobaciones y rechazos de traspasos.
 * - Verificación del mismo equipo.
 * - Cambio de estados de traspaso en jugadores.
 * - Contador estático de entrenadores.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */
public class Entrenador extends Trabajador implements GestorTraspasos {

    private Formacion formacionPreferida;
    private static int contadorEntrenadores;

    public Entrenador(String nombre, LocalDate fechaDeNacimiento, Equipo equipo, Formacion formacionPreferida) {
        super(nombre, fechaDeNacimiento, equipo);
        this.formacionPreferida = formacionPreferida;
        contadorEntrenadores++;
    }

    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

    @Override
    public void aprobarTraspaso(Jugador j) {
        if (mismoEquipo(j) && (j.getEstadoTraspaso() == EstadoTraspaso.SOLICITADO)) {
            j.setEstadoTraspaso(EstadoTraspaso.APROBADO_POR_ENTRENADOR);
            System.out.println("Traspaso aprobado por el entrenador!");
        } else {
            System.out.println("No se puede aprobar el traspaso");
        }

    }

    @Override
    public void rechazarTraspaso(Jugador j) {
        if (mismoEquipo(j) && (j.getEstadoTraspaso() == EstadoTraspaso.SOLICITADO)) {
            j.setEstadoTraspaso(EstadoTraspaso.RECHAZADO);
            System.out.println("Traspaso rechazado por el entrenador!");
        } else {
            System.out.println("No se puede rechazar el traspaso");
        }
    }

    @Override
    public String toString() {
        return "Ficha Tecnica del Entrenador"
                + "\nNombre: " + nombre
                + "\nFormacion Preferida: " + formacionPreferida + "\n";
    }

}
