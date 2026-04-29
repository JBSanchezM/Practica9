package com.ligaprofesional.clases;

import java.time.LocalDate;

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

}
