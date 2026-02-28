package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

public class Reserva implements InReserva {
    private Allotjament allotjament;
    private Client client;
    private LocalDate dataEntrada;
    private LocalDate dataSortida;
    // LA RESERVA NOMÉS ES POT FER SI L'ESTADA ÉS MAJOR O IGUAL QUE L'ESTADA MÍNIMA PREDETERMINADA SEGONS EL TIPUS
    // D'ALLOTJAMENT I SEGONS LA TEMPORADA.

    // LA CLASSE LOCAL DATE??
    // hem de crear una classe que es digui així i posar els seus mètodes allà?? No, és una llibreria k es pot utilitzar
    // hem de crear un mètode a la classe Reserva on calculem l'estada i utilitzar el LocalDate?? Es fa a LlistaReserves

    // Constructor
    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) {
        this.allotjament = allotjament;
        this.client = client;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
    }

    /**
     * Getters d'allotjament reservat, client que reserva, i dates d'entrada i sortida
     */
    public Allotjament getAllotjament_() {return allotjament; }
    public Client getClient() {
        return client;
    }
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public LocalDate getDataSortida() {
        return dataSortida;
    }



    // akests no tenen gens de sentit (els poso igualment i després ja decidim)
    /**
     * Setters d'allotjament reservat, client que reserva, i dates d'entrada i sortida
     */
    public void setAllotjament_(Allotjament allotjament) { this.allotjament = allotjament; }
    public void setClient(Client client) { this.client = client; }
    public void setDataEntrada(LocalDate dataEntrada) { this.dataEntrada = dataEntrada; }
    public void setDataSortida(LocalDate dataSortida) { this.dataSortida = dataSortida; }


}
