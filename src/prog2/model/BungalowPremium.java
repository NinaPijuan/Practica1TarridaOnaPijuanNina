package prog2.model;

public class BungalowPremium extends Bungalow {
    private boolean llen;
    private boolean tova;
    private String wifi;

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
     * @param llen
     * @param tova
     * @param wifi
     */
    public BungalowPremium(String nom, int id, int mida, int numHab, int capacitat, int park, boolean terrassa, boolean tele, boolean aire, boolean llen, boolean tova, String wifi){
       super(nom, id, mida, numHab, capacitat, park, terrassa, tele, aire);
       this.llen = llen;
       this.tova = tova;
       this.wifi = wifi;
    }

    /**
     * Getters de llençols, tovalloles i clau del wifi
     */
    public boolean getLlen(){ return llen; }
    public boolean getTova(){ return tova; }
    public String getWifi(){ return wifi; }

    /**
     * Setters de llençols, tovalloles i clau del wifi
     */
    public void setLlen(boolean llen){ this.llen = llen; }
    public void setTova(boolean tova){ this.tova = tova; }
    public void setWifi(String wifi){ this.wifi = wifi; }


    /**
     * Obté la informació de la classe
     * @return un string
     */
    @Override
    public String toString(){
        return super.toString() + ".Premium{llençols= " + llen + ", tovalloles= " +
                tova + ", clau del wifi= " + wifi;
    }


    /**
     * Un bungalow Prenium funciona bé si té aire i el seu codi wifi té entre 8 i 16 caràcters
     * @return true si sí, false si no
     */
    @Override
    public boolean correcteFuncionament(){
       boolean aire = super.correcteFuncionament();
       int caracters = wifi.length();
       return (aire && 8 <= caracters && caracters <= 16);
    }

}
