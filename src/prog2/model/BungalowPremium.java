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
     * Un bungalow Prenium funciona bé si té aire i el seu codi wifi té entre 8 i 16 caràcters
     * @return true si sí, false si no
     */
   @Override
   public boolean correcteFuncionament(){
       boolean aire = super.correcteFuncionament();
       int caracters = wifi.length();
       return (aire  && 8 <= caracters <= 16);
   }

}
