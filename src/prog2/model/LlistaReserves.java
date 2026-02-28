package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class LlistaReserves implements InLlistaReserves {
    private ArrayList<Reserva> llistaReserves;

    public LlistaReserves() {
        this.llistaReserves = new ArrayList<>();
    }


    /**
     * Comprova que l'estada desitjada sigui igual o més llarga que l'estada mínima segons temporada i allotjament
     * @param allotjament
     * @param dataEntrada
     * @param dataSortida
     * @return boolean
     */
    public boolean isEstadaMinima(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {

        long diesEstada = ChronoUnit.DAYS.between(dataEntrada, dataSortida);

        // Per no tenir en compte els anys, es fa amb MonthDay:
        MonthDay iniciTempAlta = MonthDay.of(3, 21);
        MonthDay iniciTempBaixa = MonthDay.of(9, 21);
        // Passem la dataEntrada a MonthDay per poder comprar
        MonthDay diaEntrada = MonthDay.from(dataEntrada);

        InAllotjament.Temp temp;
        // Si la data d'entrada >= iniciTempAlta i <= iniciTempBaixa:
        if (!diaEntrada.isBefore(iniciTempAlta) && !diaEntrada.isAfter(iniciTempBaixa)){
            temp = InAllotjament.Temp.ALTA;
        }
        else { temp = InAllotjament.Temp.BAIXA; }

        long diesMinims = allotjament.getEstadaMinima(temp);

        boolean estadaValida = (diesEstada >= diesMinims);
        return estadaValida;

    }


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
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        // Utilitzar allotjamentDisponible

        // Missatge d'error: "L'allotjament amb identificador {id} no està disponible en la data demanada {dataEntrada}
        // pel {client} amb DNI: {dni}."

        // Utilitzar isEstadaMinima

        // Missatge d'error: "Les dates sol·licitades pel client {client} amb DNI: {dni} no compleixen l'estada mínima
        // per l'allotjament amb identificador {id}."

        // Crear la reserva i afegir-la a llistaReserves;


        if (!isEstadaMinima(allotjament, dataEntrada, dataSortida)) {
            throw new ExcepcioReserva("Les dates sol·licitades pel client " + client + " amb DNI: " +
                    client.getDni() + " no compleixen l'estada mínima per l'allotjament amb identificador "
                    + allotjament.getId());
        }

        if (!allotjamentDisponible(allotjament, dataEntrada, dataSortida)) {
            throw new ExcepcioReserva("L’allotjament amb identificador " + allotjament.getId() +
                    " no està disponible en la data demanada " + dataEntrada + " pel client " + client +
                    " amb DNI: " + client.getDni());
        }

        Reserva reserva = new Reserva(allotjament, client, dataEntrada, dataSortida);
        llistaReserves.add(reserva);

    }

    /**
     * Retorna el número de reserves de la llista
     * @return el número de reserves.
     */
    public int getNumReserves() { return llistaReserves.size(); }


    /**
    * Comprova si un allotjament està disponible en les dates desitjades
    * @param allotjament
    * @param dataEntrada
    * @param dataSortida
    * @return boolean
    */
    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {

        boolean lliure = true;
        String id = allotjament.getId();

        for (int i = 0; i < llistaReserves.size(); i++) {

            Reserva reserva = llistaReserves.get(i);
            Allotjament allotjamentReservat = reserva.getAllotjament_();
            String idReservat = allotjamentReservat.getId();

            if (id.equals(idReservat)) {

                LocalDate dataEntradaReservada = reserva.getDataEntrada();
                LocalDate dataSortidaReservada = reserva.getDataSortida();

                if (!dataSortida.isBefore(dataEntradaReservada) && !dataEntrada.isAfter(dataSortidaReservada)) {
                    lliure = false;
                }
            }
        }

        return lliure;
    }



}
