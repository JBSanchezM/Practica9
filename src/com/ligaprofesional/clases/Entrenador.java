package com.ligaprofesional.clases;

import com.ligaprofesional.enums.Formacion;

/**
 * Representa un Entrenador de la liga profesional.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */
public class Entrenador {
    private String nombreEntrenador;
    private Formacion formacionPreferida;
    private static int contadorEntrenadores;

    /**
     * Constructor de la clase Entrenador
     * Crea un nuevo entrenador con los daros basicos
     * 
     * @param nombreEntrenador   Nombre del entrenador
     * @param formacionPreferida Formacion preferida del entrenador
     */
    public Entrenador(String nombreEntrenador, Formacion formacionPreferida) {
        this.nombreEntrenador = nombreEntrenador;
        this.formacionPreferida = formacionPreferida;
        contadorEntrenadores++;
    }

    /**
     * Devuelve el nombre del entrenador
     * 
     * @return nombre del entrenador
     */

    public String getNombreEntrenador() {
        return nombreEntrenador;
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

    /**
     * Devuelve una representación en textual del entrenador con toda su
     * informacion.
     * 
     * @return representacion legible del entrenador
     */
    @Override
    public String toString() {
        return "Ficha Tecnica del Entrenador"
                + "\nNombre: " + nombreEntrenador
                + "\nFormacion Preferida: " + formacionPreferida + "\n";
    }

}
