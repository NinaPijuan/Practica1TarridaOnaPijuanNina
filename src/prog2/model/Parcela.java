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


    public int getMida(){ return mida; }

    public void setMida(int mida){ this.mida = mida; }

    public int getElec(){ return elec; }

    public void setElec(boolean elec){ this.elec = elec; }



    /**
     * Una parcel·la té un funcionament correcte si té punt de connexió elèctrica
     * @return true si té electricitat, false si no
     */
    @Override
    public boolean correcteFuncionament(){
        return elec;
    }

}



