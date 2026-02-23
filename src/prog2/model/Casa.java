package prog2.model;

public class Casa extends Allotjament {
    private int mida; // petita, mitjana i gran
    private int numHab;
    private int capacitat;

    /**
     * Constructor amb paràmetres
     * @param nom
     * @param id
     * @param mida
     * @param numHab
     * @param capacitat
     */
    public Casa(String nom, int id, int mida, int numHab, int capacitat){
        super(nom, id);
        this.mida = mida;
        this.numHab = numHab;
        this.capacitat = capacitat;
    }

    /**
     * Obté la mida de la casa
     * @return 1: petita, 2: mitjana, 3: gran
     */
    @Override
    public int getMida(){ return mida; }

    /**
     * Obté el número d'habitacions
     * @return número d'habitacions
     */
    @Override
    public int getNumHab() { return numHab; }

    /**
     * Obté la quantitat de persones que hi caben
     * @return capacitat
     */
    @Override
    public int getCapacitat() { return capacitat; }
}
