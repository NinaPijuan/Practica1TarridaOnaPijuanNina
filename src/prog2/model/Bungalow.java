package prog2.model;

public class Bungalow extends Casa {
    private int park; // 1 o 2
    private boolean terrassa; // true -> en té
    private boolean tele;
    private boolean aire;

    /**
     * Constructor amb paràmetres
     * @param nom
     * @param id
     * @param mida
     * @param numHab
     * @param capacitat
     * @param park
     * @param terrassa
     * @param tele
     * @param aire
     */
    public Bungalow(String nom, int id, int mida, int numHab, int capacitat, int park, boolean terrassa, boolean tele, boolean aire){
        super(nom, id, mida, numHab, capacitat);
        this.park = park;
        this.terrassa = terrassa;
        this.tele = tele;
        this.aire = aire;
    }

    /**
     * Un bungalow té un funcionament correcte si té aire fred
     * @return true si en té, false si no
     */
    @Override
    public boolean correcteFuncionament(){ return aire; }

}
