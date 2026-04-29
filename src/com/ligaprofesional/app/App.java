package com.ligaprofesional.app;

import java.time.LocalDate;

import com.ligaprofesional.clases.Entrenador;
import com.ligaprofesional.clases.Equipo;
import com.ligaprofesional.clases.Jugador;
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
     * Crea instancias de jugadores, entrenadores y equipos
     * para probar el funcionamiento del sistema.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        System.out.println("===== CREACIÓN DE JUGADORES =====");

        Jugador j1 = new Jugador("Marcos", LocalDate.of(1992, 10, 21), Posicion.DELANTERO);
        Jugador j2 = new Jugador("Lucas", LocalDate.of(1993, 11, 12), Posicion.ARQUERO);
        Jugador j3 = new Jugador("Juan", LocalDate.of(1994, 7, 19), Posicion.DEFENSA);
        Jugador j4 = new Jugador("Mario", LocalDate.of(1995, 9, 17), Posicion.LATERAL);
        Jugador j5 = new Jugador("Maria", LocalDate.of(1996, 1, 6), Posicion.DELANTERO);
        Jugador j6 = new Jugador("Jhon", LocalDate.of(1997, 5, 23), Posicion.CENTROCAMPISTA);
        Jugador j7 = new Jugador("Antony", LocalDate.of(1998, 2, 12), Posicion.CENTROCAMPISTA);
        Jugador j8 = new Jugador("Samuel", LocalDate.of(1993, 7, 30), Posicion.ARQUERO);
        Jugador j9 = new Jugador("Pedro", LocalDate.of(1994, 3, 22), Posicion.DEFENSA);
        Jugador j10 = new Jugador("Ruben", LocalDate.of(1995, 8, 17), Posicion.LATERAL);

        System.out.println("===== CREACIÓN DE ENTRENADORES =====");

        Entrenador en1 = new Entrenador("Carlos", Formacion.CUATRO_TRES_TRES);
        Entrenador en2 = new Entrenador("Pepe", Formacion.TRES_CUATRO_TRES);
        Entrenador en3 = new Entrenador("Jhan", Formacion.CUATRO_TRES_DOS_UNO);

        System.out.println("===== CREACIÓN DE EQUIPOS =====");

        Equipo eq1 = new Equipo("Real Madrid");
        Equipo eq2 = new Equipo("Barcelona");
        Equipo eq3 = new Equipo("Villareal");

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

        eq3.setEntrenador(en1);
        eq2.setEntrenador(en2);
        eq1.setEntrenador(en3);

        System.out.println("===== PRUEBA VER PLANTILLA INICIAL =====");

        eq3.verPlantilla();

        System.out.println("===== PRUEBA TRASPASO (CASO POSITIVO) =====");

        j10.solicitarTraspaso();
        eq3.transferirJugador(j10, eq1);

        System.out.println("===== PLANTILLAS DESPUÉS DEL TRASPASO =====");
        eq3.verPlantilla();
        eq1.verPlantilla();

        System.out.println("===== PRUEBA TRASPASO (CASO NEGATIVO) =====");

        Jugador fake = new Jugador("Fake", LocalDate.of(2000, 1, 1), Posicion.DELANTERO);
        eq3.transferirJugador(fake, eq1);

        System.out.println("===== PRUEBA MÉTODOS JUGADOR =====");

        j1.solicitarTraspaso();
        j1.cancelarTraspaso();
        j1.solicitarTraspaso();
        j1.finalizarTraspaso();

        System.out.println("===== CONTADORES ESTÁTICOS =====");

        System.out.println("Total jugadores: " + Jugador.getContadorJugadores());
        System.out.println("Total equipos: " + Equipo.getContadorEquipos());
        System.out.println("Total entrenadores: " + Entrenador.getContadorEntrenadores());

        System.out.println("===== FIN DEL PROGRAMA =====");
    }

}
