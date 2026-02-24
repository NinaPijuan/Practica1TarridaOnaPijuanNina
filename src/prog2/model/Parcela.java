package prog2.model;

public class Parcela extends Allotjament {

    private int mida; // en m2
    private boolean elec; //true -> en té

    /**
     * Constructor amb paràmetres
     * @param nom
     * @param id
     * @param mida
     * @param elec
     */
    public Parcela(String nom, int id, int mida, boolean elec){
        super(nom, id);
        this.mida = mida;
        this.elec = elec;
    }

    /**
     * Obté la mida
     * @return mida
     */
    public int getMida(){ return mida; }

    /**
     * Guarda la mida
     * @param mida
     */
    public void setMida(int mida){ this.mida = mida; }

    /**
     * Obté l'electricitat
     * @return elec
     */
    public int getElec(){ return elec; }

    /**
     * Guarda l'electricitat
     * @param elec
     */
    public void setElec(boolean elec){ this.elec = elec; }



    /**
     * Una parcel·la té un funcionament correcte si té punt de connexió elèctrica
     * @return true si té electricitat, false si no
     */
    @Override
    public boolean correcteFuncionament(){
        return elec;
    }

    /**
     * Obté tota la informació de la classe
     * @return un string
     */
    @Override
    public String toString(){
        return super.toString() + ". Parcel·la{mida= " + mida
                + ", connexió elèctrica= " + elec;
    }

}



