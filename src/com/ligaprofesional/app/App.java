package com.ligaprofesional.app;

import java.time.LocalDate;

import com.ligaprofesional.clases.Entrenador;
import com.ligaprofesional.clases.Equipo;
import com.ligaprofesional.clases.Jugador;
import com.ligaprofesional.clases.Presidente;
import com.ligaprofesional.enums.Formacion;
import com.ligaprofesional.enums.Posicion;

/**
 * Clase principal de la aplicación.
 * Permite ejecutar pruebas del sistema de gestión de liga profesional.
 *
 * @author Jonathan Sanchez
 * @version 1.0
 */

public class App {

    /**
     * Método principal de la aplicación.
     * Crea instancias de jugadores, entrenadores, presidentes y equipos
     * para probar el funcionamiento del sistema.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        System.out.println("===== CREACIÓN DE EQUIPOS =====");

        Equipo eq1 = new Equipo("Real Madrid");
        Equipo eq2 = new Equipo("Barcelona");
        Equipo eq3 = new Equipo("Villareal");

        System.out.println("===== CREACIÓN DE PRESIDENTES =====");

        Presidente pr1 = new Presidente("Florentino", LocalDate.of(1947, 8, 03), eq1);
        Presidente pr2 = new Presidente("JoanLaporta", LocalDate.of(1962, 6, 29), eq2);
        Presidente pr3 = new Presidente("FernandoRoig", LocalDate.of(1947, 8, 03), eq3);

        System.out.println("===== CREACIÓN DE ENTRENADORES =====");

        Entrenador en1 = new Entrenador("Carlos", LocalDate.of(1987, 05, 06), eq1, Formacion.CUATRO_TRES_DOS_UNO);
        Entrenador en2 = new Entrenador("Pepe", LocalDate.of(1975, 04, 22), eq2, Formacion.TRES_CUATRO_TRES);
        Entrenador en3 = new Entrenador("Jhan", LocalDate.of(1989, 10, 20), eq3, Formacion.CUATRO_TRES_DOS_UNO);

        System.out.println("===== CREACIÓN DE JUGADORES =====");

        Jugador j1 = new Jugador("Marcos", LocalDate.of(1992, 10, 21), eq1, Posicion.DELANTERO);
        Jugador j2 = new Jugador("Lucas", LocalDate.of(1993, 11, 12), eq1, Posicion.ARQUERO);
        Jugador j3 = new Jugador("Juan", LocalDate.of(1994, 7, 19), eq1, Posicion.DEFENSA);
        Jugador j4 = new Jugador("Mario", LocalDate.of(1995, 9, 17), eq1, Posicion.LATERAL);
        Jugador j5 = new Jugador("Maria", LocalDate.of(1996, 1, 6), eq2, Posicion.DELANTERO);
        Jugador j6 = new Jugador("Jhon", LocalDate.of(1997, 5, 23), eq2, Posicion.CENTROCAMPISTA);
        Jugador j7 = new Jugador("Antony", LocalDate.of(1998, 2, 12), eq2, Posicion.CENTROCAMPISTA);
        Jugador j8 = new Jugador("Samuel", LocalDate.of(1993, 7, 30), eq3, Posicion.ARQUERO);
        Jugador j9 = new Jugador("Pedro", LocalDate.of(1994, 3, 22), eq3, Posicion.DEFENSA);
        Jugador j10 = new Jugador("Ruben", LocalDate.of(1995, 8, 17), eq3, Posicion.LATERAL);

        System.out.println("===== ASIGNACIÓN DE JUGADORES =====");

        eq1.añadirJugador(j1);
        eq1.añadirJugador(j2);
        eq1.añadirJugador(j3);
        eq1.añadirJugador(j4);

        eq2.añadirJugador(j5);
        eq2.añadirJugador(j6);
        eq2.añadirJugador(j7);

        eq3.añadirJugador(j8);
        eq3.añadirJugador(j9);
        eq3.añadirJugador(j10);

        System.out.println("===== ASIGNACIÓN DE ENTRENADORES =====");

        eq1.setEntrenador(en1);
        eq2.setEntrenador(en2);
        eq3.setEntrenador(en3);

        System.out.println("===== PRUEBA VER PLANTILLA INICIAL =====");

        eq3.verPlantilla();

        System.out.println("===== PRUEBA TRASPASO (CASO POSITIVO) =====");

        j10.solicitarTraspaso();

        en3.aprobarTraspaso(j10);

        pr3.aprobarTraspaso(j10);

        eq3.transferirJugador(j10, eq1);

        System.out.println("===== PLANTILLAS DESPUÉS DEL TRASPASO =====");
        eq3.verPlantilla();
        eq1.verPlantilla();

        System.out.println("===== PRUEBA TRASPASO (CASO NEGATIVO) =====");

        j1.solicitarTraspaso();

        eq1.transferirJugador(j1, eq2);

        System.out.println("===== PRUEBA RECHAZO ENTRENADOR =====");

        j2.solicitarTraspaso();

        en1.rechazarTraspaso(j2);

        eq1.transferirJugador(j2, eq2);

        System.out.println("===== PRUEBA RECHAZO PRESIDENTE =====");

        j3.solicitarTraspaso();

        en1.aprobarTraspaso(j3);

        pr1.rechazarTraspaso(j3);

        eq1.transferirJugador(j3, eq2);

        System.out.println("===== CONTADORES ESTÁTICOS =====");

        System.out.println("Total jugadores: " + Jugador.getContadorJugadores());
        System.out.println("Total equipos: " + Equipo.getContadorEquipos());
        System.out.println("Total entrenadores: " + Entrenador.getContadorEntrenadores());

        System.out.println("===== FIN DEL PROGRAMA =====");
    }

}
