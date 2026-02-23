package prog2.model;

public class MobilHome extends Casa {
    private boolean barba;

    /**
     * Constructor amb paràmetres
     * @param nom
     * @param id
     * @param mida
     * @param numHab
     * @param capacitat
     * @param barba
     */
    public MobileHome(String nom, int id, int mida, int numHab, int capacitat, boolean barba) {
        super(nom, id, mida, numHab, capacitat);
        this.barba = barba;
    }



    /**
     * Una Mobil-Home funciona bé si té terrassa amb barbacoa
     * @return true si en té, false si no
     */
    @Override
    public boolean correcteFuncionament(){
        return barba;
    }


}
