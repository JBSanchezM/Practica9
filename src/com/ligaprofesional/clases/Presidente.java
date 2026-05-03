package com.ligaprofesional.clases;

import java.time.LocalDate;

import com.ligaprofesional.enums.EstadoTraspaso;
import com.ligaprofesional.interfaces.GestorTraspasos;

/**
 * Clase de pruebas unitarias para la clase Presidente.
 * 
 * Se comprueba el correcto funcionamiento de:
 * - Aprobación de traspasos autorizados previamente.
 * - Rechazo de traspasos.
 * - Validación de estados del proceso de traspaso.
 * - Verificación de pertenencia al mismo equipo.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */

public class Presidente extends Trabajador implements GestorTraspasos {

    public Presidente(String nombre, LocalDate fechaDeNacimiento, Equipo equipo) {
        super(nombre, fechaDeNacimiento, equipo);
    }

    @Override
    public void aprobarTraspaso(Jugador j) {
        if (mismoEquipo(j) && (j.getEstadoTraspaso() == EstadoTraspaso.APROBADO_POR_ENTRENADOR)) {
            j.setEstadoTraspaso(EstadoTraspaso.APROBADO_POR_PRESIDENTE);
            System.out.println("Traspaso aprobado por el presidente!");
        } else {
            System.out.println("No se puede aprobar el traspaso");
        }
    }

    @Override
    public void rechazarTraspaso(Jugador j) {

        if (mismoEquipo(j) && (j.getEstadoTraspaso() == EstadoTraspaso.APROBADO_POR_ENTRENADOR)) {
            j.setEstadoTraspaso(EstadoTraspaso.RECHAZADO);
            System.out.println("Traspaso rechazado por el presidente!");
        } else {
            System.out.println("No se puede rechazar el traspaso");
        }

    }
}
