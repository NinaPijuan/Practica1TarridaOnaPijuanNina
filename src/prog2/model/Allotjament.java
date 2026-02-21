package prog2.model;

// TOTES LES CLASSES HAN DE TENIR CONSTRUCTOR, I GETTERS I SETTERS PER ACCEDIR I MODIFICAR ELS ATRIBUTS
// NÚMERO DE DIES D'ESTADA MÍNIMA HAN DE SER LONG
// CADA SUBCLASSE (PARCELA, BUNGALOW, BUNGALOW_PREMIUM, GLAMPING I MOBIL-HOME) HAN D'IMPLEMENTAR EL MÈTODE
// correcteFuncionament
// ELS CONSTRUCTORS HAN DE REBRE ELS PARÀMETRES EN EL MATEIX ORDRE QUE A InCamping
// PENSAR MÈTODE toString (??)

public abstract class Allotjament implements InAllotjament {
    private String nom;
    private int id;
    private int tempsMin; // en dies
    private int temporada; // alta o baixa

    /**
     * Obté el nom de l'allotjament.
     *
     * @return el nom de l'allotjament.
     */
    @Override
    public String getNom() {
        return null;
    }

    /**
     * Estableix el nom de l'allotjament.
     *
     * @param nom el nom a assignar.
     */
    @Override
    public void setNom(String nom) {

    }

    /**
     * Obté l'identificador únic de l'allotjament.
     *
     * @return l'identificador únic de l'allotjament.
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * Estableix l'identificador únic de l'allotjament.
     *
     * @param id l'identificador a assignar.
     */
    @Override
    public void setId(String id) {

    }

    /**
     * Obté l'estada mínima segons la temporada.
     *
     * @param temp la temporada (ALTA o BAIXA).
     * @return el valor de l'estada mínima per a la temporada indicada.
     */
    @Override
    public long getEstadaMinima(Temp temp) {
        return 0;
    }

    /**
     * Estableix l'estada mínima per a cada temporada.
     *
     * @param estadaMinimaALTA_  l'estada mínima en temporada alta.
     * @param estadaMinimaBAIXA_ l'estada mínima en temporada baixa.
     */
    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {

    }

    /**
     * Comprova si l'allotjament funciona correctament.
     * La implementació dependrà dels criteris específics de cada tipus d'allotjament.
     *
     * @return true si l'allotjament funciona correctament, false altrament.
     */
    @Override
    public boolean correcteFuncionament() {
        return false;
    }
}
