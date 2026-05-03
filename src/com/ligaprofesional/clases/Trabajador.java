package com.ligaprofesional.clases;

import java.time.LocalDate;

/**
 * Clase de pruebas unitarias para la clase abstracta Trabajador.
 * 
 * Se validan métodos heredados por las clases hijas:
 * - Obtención y modificación de nombre.
 * - Obtención y modificación de fecha de nacimiento.
 * - Asignación de equipo.
 * - Verificación de trabajadores pertenecientes al mismo equipo.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */

public abstract class Trabajador {
    protected String nombre;
    protected LocalDate fechaDeNacimiento;
    protected Equipo equipo;

    public Trabajador(String nombre, LocalDate fechaDeNacimiento, Equipo equipo) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.equipo = equipo;

    }

    public boolean mismoEquipo(Trabajador t) {
        return this.equipo.getNombreEquipo().equals(t.equipo.getNombreEquipo());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Equipo getEquipo() {

        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

}
