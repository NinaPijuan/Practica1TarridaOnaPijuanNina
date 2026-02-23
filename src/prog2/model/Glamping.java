package prog2.model;

public class Glamping extends Casa {
    private String material; //FEM K SIGUI UN CHAR O UN INT?
    private boolean casaMas;

    /**
     * Constructor amb paràmetres
     * @param nom
     * @param id
     * @param mida
     * @param numHab
     * @param capacitat
     * @param material
     * @param casaMas
     */
    public Glamping(String nom, int id, int mida, int numHab, int capacitat, String material, boolean casaMas){
        super(nom, id, mida, numHab, capacitat);
        this.material = material;
        this.casaMas = casaMas;
    }

    /**
     * Un glamping funciona bé si té casa per mascotes
     * @return true si en té, false si no
     */
    @Override
    public boolean correcteFuncionament(){
        return casaMas;
    }


}
