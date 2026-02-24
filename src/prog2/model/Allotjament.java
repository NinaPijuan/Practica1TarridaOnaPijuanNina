package prog2.model;

// TOTES LES CLASSES HAN DE TENIR CONSTRUCTOR, I GETTERS I SETTERS PER ACCEDIR I MODIFICAR ELS ATRIBUTS
// CADA SUBCLASSE (PARCELA, BUNGALOW, BUNGALOW_PREMIUM, GLAMPING I MOBIL-HOME) HAN D'IMPLEMENTAR EL MÈTODE
// correcteFuncionament
// ELS CONSTRUCTORS HAN DE REBRE ELS PARÀMETRES EN EL MATEIX ORDRE QUE A InCamping
// PENSAR MÈTODE toString (??)

public abstract class Allotjament implements InAllotjament {
    private String nom;
    private String id;
    private long tempsMinBaixa;
    private long tempsMinAlta;


    /**
     * Constructor amb paràmetres
     */
    public Allotjament(String nom, String id, long tempsMinBaixa, long tempsMinAlta) {
        this.nom = nom;
        this.id = id;
        this.tempsMinBaixa = tempsMinBaixa;
        this.tempsMinAlta = tempsMinAlta;
    }


    /**
     * Obté el nom de l'allotjament.
     *
     * @return el nom de l'allotjament.
     */
    public String getNom() {return nom;}

    /**
     * Estableix el nom de l'allotjament.
     *
     * @param nom el nom a assignar.
     */
    public void setNom(String nom) { this.nom = nom; }

    /**
     * Obté l'identificador únic de l'allotjament.
     *
     * @return l'identificador únic de l'allotjament.
     */
    public String getId() { return id; }

    /**
     * Estableix l'identificador únic de l'allotjament.
     *
     * @param id l'identificador a assignar.
     */
    public void setId(String id) { this.id = id; }

    /**
     * Obté el temps mínim d'estada segons la temporada
     * @param temp ALTA o BAIXA
     * @return temps en dies
     */
    public long getEstadaMinima(Temp temp){
        switch (temp){
            case ALTA: return tempsMinAlta;
            case BAIXA: return tempsMinBaixa;
            default: return 0; // Per si de cas?
        }
    }

    /**
     * Enumeració que representa les diferents temporades possibles.
     */
    public enum Temp { BAIXA, ALTA }


    /**
     * Estableix l'estada mínima per a cada temporada.
     *
     * @param tempsMinBaixa l'estada mínima en temporada baixa.
     * @param tempsMinAlta  l'estada mínima en temporada alta.
     */
    public void setEstadaMinima(long tempsMinBaixa, long tempsMinAlta) {
            this.tempsMinBaixa = tempsMinBaixa;
            this.tempsMinAlta = tempsMinAlta;
    }

    /**
     * Comprova si l'allotjament funciona correctament.
     * La implementació dependrà dels criteris específics de cada tipus d'allotjament.
     *
     * @return true si l'allotjament funciona correctament, false altrament.
     */
    public abstract boolean correcteFuncionament();

}
