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
     * Getters de places de parking, terrassa, televisió i sistema d'aire fred
     */
    public int getPark(){ return park; }
    public boolean getTerrassa(){ return terrassa; }
    public boolean getTele(){ return tele; }
    public boolean getAire(){ return aire; }

    /**
     * Setters de places de parking, terrassa, televisió i sistema d'aire fred
     */
    public void setPark(int park){ this.park = park; }
    public void setTerrassa(boolean terrassa){ this.terrassa = terrassa; }
    public void setTele(boolean tele){ this.tele = tele; }
    public void setAire(boolean aire){ this.aire = aire; }

    /**
     * Obté tota la informació de la classe
     * @return un string
     */
    @Override
    public String toString(){
        return super.toString() + ". Bungalow{places de parking= "
                + park + ", terrassa= " + terrassa + ",tele= " + tele
                + ", aire= " + aire;
    }

    /**
     * Un bungalow té un funcionament correcte si té aire fred
     * @return true si en té, false si no
     */
    @Override
    public boolean correcteFuncionament(){ return aire; }

}
