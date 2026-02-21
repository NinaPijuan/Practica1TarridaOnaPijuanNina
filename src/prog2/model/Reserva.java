package prog2.model;

import java.time.LocalDate;

public class Reserva implements InReserva {
    private Allotjament allotjament;
    private Client client;
    private LocalDate dataEntrada;
    private LocalDate dataSortida;
    // LA RESERVA NOMÉS ES POT FER SI L'ESTADA ÉS MAJOR O IGUAL QUE L'ESTADA MÍNIMA PREDETERMINADA SEGONS EL TIPUS
    // D'ALLOTJAMENT I SEGONS LA TEMPORADA.

    // LA CLASSE LOCAL DATE??
    // hem de crear una classe que es digui així i posar els seus mètodes allà??
    // hem de crear un mètode a la classe Reserva on calculem l'estada i utilitzar el LocalDate??

    // Constructor
    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) {
        this.allotjament = allotjament;
        this.client = client;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
    }

    /**
     * @return 
     */
    @Override
    public Allotjament getAllotjament_() {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public Client getClient() {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public LocalDate getDataEntrada() {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public LocalDate getDataSortida() {
        return null;
    }

    /**
     * @param allotjament_ 
     */
    @Override
    public void setAllotjament_(Allotjament allotjament_) {

    }

    /**
     * @param client_ 
     */
    @Override
    public void setClient(Client client_) {

    }

    /**
     * @param dataEntrada_ 
     */
    @Override
    public void setDataEntrada(LocalDate dataEntrada_) {

    }

    /**
     * @param dataSortida_ 
     */
    @Override
    public void setDataSortida(LocalDate dataSortida_) {

    }
}
