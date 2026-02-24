package prog2.model;

public class Glamping extends Casa {
    private String material; // tela o fusta. FEM K SIGUI UN CHAR O UN INT?
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
     * Getters de tipus de material i casa de mascotes
     */
    public String getMaterial(){ return material; }
    public boolean getCasaMas(){ return casaMas; }

    /**
     * Setters de tipus de material i casa de mascotes
     */

    // EL SET DE MATERIAL SÍ K HAURIA DE TENIR CONDICIONS (només pot ser fusta o tela)
    public void setMaterial(String material){ this.material = material; }
    public void setCasaMas(boolean casaMas){ this.casaMas = casaMas; }


    /**
     * Obté tota la informació de la classe
     * @return un string
     */
    @Override
    public String toString(){
        return super.toString() + ". Glamping{material= " + material + ", casa per mascotes= "
                + casaMas;
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
