package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Camping implements InCamping{
    private String nom;
    private ArrayList<Allotjament> llistaAllotjaments;
    private ArrayList<Client> llistaClients;
    private LlistaReserves llistaReserves;
    // Amb els ArrayList cal utilitzar ITERATORS, mirar document de suport


    // Tots els mètodes afegir(Allotjament) creen un objecte del tipus d'allotjament amb els paràmetres i l'afegeix a
    // la llista.

    public Camping(String nom) {
        this.nom = nom;
        this.llistaAllotjaments = new ArrayList<Allotjament>();
        this.llistaClients = new ArrayList<Client>();
        this.llistaReserves = new LlistaReserves();
    }

    /**
     * Retorna el nom del càmping.
     *
     * @return el nom del càmping.
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Retorna la llista de reserves del camping.
     *
     * @return
     */
    @Override
    public LlistaReserves getLlistaReserves() {
        return llistaReserves;
    }

    /**
     * Retorna la llista d'allotjaments del camping.
     */
    @Override
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return llistaAllotjaments;
    }

    /**
     * Retorna la llista de clients del camping.
     *
     * @return
     */
    @Override
    public ArrayList<Client> getLlistaClients() {
        return llistaClients;
    }

    /**
     * Retorna el número total d'allotjaments del càmping.
     *
     * @return el número total d'allotjaments.
     */
    @Override
    public int getNumAllotjaments() {
        return llistaAllotjaments.size();
    }

    /**
     * Retorna el número total de reserves del càmping.
     *
     * @return el número total de reserves.
     */
    @Override
    public int getNumReserves() {
        return llistaReserves.getNumReserves();
    }

    /**
     * Retorna el número total de clients del càmping.
     *
     * @return el número total de clients.
     */
    @Override
    public int getNumClients() {
        return llistaClients.size();
    }

    /**
     * Crea un nou objecte de tipus Client i l'afegeix a la llista de clients.
     *
     * @param nom_ el nom del nou client.
     * @param dni_ el DNI del nou client.
     */
    @Override
    public void afegirClient(String nom_, String dni_) {
        Client c = new Client(nom_, dni_);
        llistaClients.add(c);
    }

    /**
     * Afegeix una nova parcel·la a la llista d'allotjaments.
     *
     * @param nom_              el nom de la parcela.
     * @param idAllotjament_    l'identificador únic de l'allotjament.
     * @param metres            la mida de la parcela.
     * @param connexioElectrica true si disposa de connexió elèctrica, false altrament.
     */
    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        Parcela p = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        llistaAllotjaments.add(p);
    }

    /**
     * Afegeix un nou bungalow a la llista d'allotjaments.
     *
     * @param nom_           el nom del bungalow.
     * @param idAllotjament_ l'identificador únic de l'allotjament.
     * @param mida           la mida del bungalow.
     * @param habitacions    el nombre d'habitacions del bungalow.
     * @param placesPersones el nombre màxim de places per a persones.
     * @param placesParquing el nombre de places de pàrquing disponibles.
     * @param terrassa       true si disposa de terrassa, false altrament.
     * @param tv             true si disposa de televisió, false altrament.
     * @param aireFred       true si disposa d'aire condicionat, false altrament.
     */
    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        Bungalow b = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        llistaAllotjaments.add(b);
    }

    /**
     * Afegeix un bungalow premium a la llista d'allotjaments.
     *
     * @param nom_
     * @param idAllotjament_
     * @param mida
     * @param habitacions
     * @param placesPersones
     * @param placesParquing
     * @param terrassa
     * @param tv
     * @param aireFred
     * @param serveisExtra   true si ofereix serveis extra.
     * @param codiWifi       el codi de la xarxa Wi-Fi.
     *                       (Altres paràmetres igual que `afegirBungalow`)
     */
    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        BungalowPremium bp = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        llistaAllotjaments.add(bp);
    }

    /**
     * Afegeix una casa glamping a la llista d'allotjaments.
     *
     * @param nom_
     * @param idAllotjament_
     * @param mida
     * @param habitacions
     * @param placesPersones
     * @param material       el material del que està fet.
     * @param casaMascota    true si accepta mascotes.
     *                       (Altres paràmetres igual que `afegirBungalow`)
     */
    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        Glamping g = new Glamping(nom, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        llistaAllotjaments.add(g);
    }

    /**
     * Afegeix una mobil-home a la llista d'allotjaments.
     *
     * @param nom_
     * @param idAllotjament_
     * @param mida
     * @param habitacions
     * @param placesPersones
     * @param terrassaBarbacoa true si disposa de terrassa amb barbacoa.
     *                         (Altres paràmetres igual que `afegirBungalow`)
     */
    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        MobilHome mh = new MobilHome(nom, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
        llistaAllotjaments.add(mh);
    }

    /**
     * Afegeix una nova reserva al càmping. Per fer-ho fa el següent: cerca el soci que vol fer la reserva i el servei que es vol reservar amb la informació necessària rebuda com a paràmetres i invoca al mètode afegirReserva de la classe LlistaReserves que crearà la reserva, si es pot, i la afegirà a la llista de reserves.
     *
     * @param id_         l'identificador de l'allotjament.
     * @param dni_        el DNI del client que fa la reserva.
     * @param dataEntrada la data d'entrada.
     * @param dataSortida la data de sortida.
     * @throws ExcepcioReserva si no es pot realitzar la reserva.
     */
    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

        Allotjament allotjament = buscarAllotjament(id_);
        Client client = buscarClient(dni_);

        llistaReserves.afegirReserva(allotjament, client, dataEntrada, dataSortida);

    }

    /**
     * Recorre la llista de serveis comprovant el correcte funcionament de cadascun d'ells per contar el número de serveis que estan operatius.
     *
     * @return el nombre de serveis operatius.
     */
    @Override
    public int calculAllotjamentsOperatius() {

        int allotjamentsOperatius = 0;

        for (int i = 0; i < llistaAllotjaments.size(); i++){

            // Per accedir a un ArrayList es fa .get(i) i no [i]
            if (llistaAllotjaments.get(i).correcteFuncionament()){
                allotjamentsOperatius += 1;
            }
        }

        return allotjamentsOperatius;
    }


    /**
     * Cerca i retorna l'allotjament amb estada mínima de la temporada alta més curta.
     *
     * @param temp
     * @return l'allotjament amb estada mínima de la temporada baixa més curta.
     */
    @Override
    public Allotjament getAllotjamentEstadaMesCurta(InAllotjament.Temp temp) {
        long min = Integer.MAX_VALUE, estadaMinima;
        Allotjament allotjamentMin = null;

        // Creem un iterador de la llistaAllotjaments
        Iterator<Allotjament> itrAllotjament = llistaAllotjaments.iterator();
        while (itrAllotjament.hasNext()) {

            // a serà l'Allotjament on apunta itrAllotjament i l'iterador es mou una posició
            Allotjament a = itrAllotjament.next();

            estadaMinima = a.getEstadaMinima(temp);
            if (estadaMinima < min) {
                min = estadaMinima;
                allotjamentMin = a;
            }
        }

        if(allotjamentMin == null)
            throw new RuntimeException();
        else return allotjamentMin;
    }

    /**
     * Busca l'allotjament en la llista d'allotjaments segons l'id donat
     * @param id
     * @return Allotjament
     * @throws ExcepcioReserva
     */
    public Allotjament buscarAllotjament(String id) throws ExcepcioReserva {

        // Creem un iterador de la llistaAllotjaments
        Iterator<Allotjament> itrAllotjament = llistaAllotjaments.iterator();
        while (itrAllotjament.hasNext()) {

            // a serà l'ALlotjament on apunta itrAllotjament i itrAllotjament es mou una posició
            Allotjament a = itrAllotjament.next();
            if (a.getId().equals(id))
                return a;
        }
        throw new ExcepcioReserva("L'allotjament amb id " + id + " no existeix");
    }

    /**
     * Busca el client en la llista de clients donat el seu DNI
     * @param dni
     * @return Client
     * @throws ExcepcioReserva
     */
    public Client buscarClient(String dni) throws ExcepcioReserva {

        // Creem un iterador de la llistaClients
        Iterator<Client> itrClients = llistaClients.iterator();
        while (itrClients.hasNext()) {
            // c serà el Client on apunta itrClients i itrClients es mou una posició
            Client c = itrClients.next();
            if (c.getDni().equals(dni))
                return c;
        }
        throw new ExcepcioReserva("El client amb DNI " + dni + " no existeix");
    }

    /**
     * Retorna la temporada segons la data donada
     * @param data
     * @return enum
     */
    public static InAllotjament.Temp getTemporada(LocalDate data) {

        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();

        // Temporada alta:
        if ((mes > 4 && mes < 9) || (mes == 3 && dia >= 21) || (mes == 9 && dia <= 20))
            return InAllotjament.Temp.ALTA;
        // Temporada baixa;
        else return InAllotjament.Temp.BAIXA;
    }


}
