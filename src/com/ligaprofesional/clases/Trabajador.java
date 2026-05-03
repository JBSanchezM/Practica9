package com.ligaprofesional.clases;

import java.time.LocalDate;

import com.ligaprofesional.enums.EstadoTraspaso;

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

    /**
     * Devuelve el nombre del tranajador.
     *
     * @return nombre de la camiseta del trabajador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del trabajador
     * 
     * @param nombre nuevo nombre del trabajador
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la fecha de nacimiento del trabajador.
     *
     * @return fecha de nacimiento del trabajador
     */
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Modifica la fecha de naciemiento del trabajador.
     * 
     * @param fechaDeNacimiento nueva fecha de nacimiento
     */
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
