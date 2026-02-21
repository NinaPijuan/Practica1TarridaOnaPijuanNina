package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class LlistaReserves implements InLlistaReserves {
    private ArrayList<Reserva> llistaReserves;

    /**
     * Comprova que l'estada que es demani sigui més llarga o igual que l'estada mínima.
     * Comprova que l'allotjament estigui disponible pels dies indicats.
     * En cas afirmatiu, crea la reserva i l’afegeix a la llista de reserves del camping.
     * En cas negatiu, llança una excepció de tipus ExceptionReserva amb el missatge d'error.
     *
     * @param allotjament
     * @param client
     * @param dataEntrada
     * @param dataSortida
     * @throws ExcepcioReserva
     */
    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        // Utilitzar allotjamentDisponible

        // Missatge d'error: "L'allotjament amb identificador {id} no està disponible en la data demanada {dataEntrada}
        // pel {client} amb DNI: {dni}."

        // Utilitzar isEstadaMinima

        // Missatge d'error: "Les dates sol·licitades pel client {client} amb DNI: {dni} no compleixen l'estada mínima
        // per l'allotjament amb identificador {id}."

        // Crear la reserva i afegir-la a llistaReserves;


    }

    /**
     * Retorna el número de reserves de la llista.
     *
     * @return el número de reserves.
     */
    @Override
    public int getNumReserves() {
        return 0;
    }

    // Indica si l'allotjament passat està disponible per fer reserva en el dia indicat
    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {
        return false;
    }

    // Indica si l'estada sol·licitada compleix que és més llarga o igual que l'estada mínima de l'allotjament en
    // la temporada corresponent a la data d'entrada
    public boolean isEstadaMinima(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {
        return false;
    }
}
