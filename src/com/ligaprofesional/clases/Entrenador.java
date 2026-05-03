package com.ligaprofesional.clases;

import java.time.LocalDate;

import com.ligaprofesional.enums.EstadoTraspaso;
import com.ligaprofesional.enums.Formacion;
import com.ligaprofesional.interfaces.GestorTraspasos;

/**
 * Representa un Entrenador de la liga profesional.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */
public class Entrenador extends Trabajador implements GestorTraspasos {

    private Formacion formacionPreferida;
    private static int contadorEntrenadores;

    /**
     * Constructor de la clase Entrenador
     * Crea un nuevo entrenador con los daros basicos
     * 
     * @param nombreEntrenador   Nombre del entrenador
     * @param formacionPreferida Formacion preferida del entrenador
     */
    public Entrenador(String nombre, LocalDate fechaDeNacimiento, Equipo equipo, Formacion formacionPreferida) {
        super(nombre, fechaDeNacimiento, equipo);
        this.formacionPreferida = formacionPreferida;
        contadorEntrenadores++;
    }

    /**
     * Devuelve la formacion preferida del entrenador
     * 
     * @return formacion preferida del entrenador
     */
    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    /**
     * Modifica la formacion preferida del entrenador
     * 
     * @param formacionPreferida nueva formacion preferida
     */
    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    /**
     * Devuelve el número total de entrenadores creados en el sistema.
     *
     * @return contador de entrenadores creados
     */
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

    /**
     * Devuelve una representación en textual del entrenador con toda su
     * informacion.
     * 
     * @return representacion legible del entrenador
     */
    @Override
    public String toString() {
        return "Ficha Tecnica del Entrenador"
                + "\nNombre: " + nombre
                + "\nFormacion Preferida: " + formacionPreferida + "\n";
    }

}
