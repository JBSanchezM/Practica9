package com.ligaprofesional.clases;

import java.time.LocalDate;

import com.ligaprofesional.interfaces.GestorTraspasos;

public class Presidente extends Trabajador implements GestorTraspasos {

    public Presidente(String nombre, LocalDate fechaDeNacimiento, Equipo equipo) {
        super(nombre, fechaDeNacimiento, equipo);
    }

    @Override
    public void aprobarTraspaso(Jugador j) {

    }

    @Override
    public void rechazarTraspaso(Jugador j) {

    }
}
