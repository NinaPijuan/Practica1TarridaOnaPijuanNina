package prog2.model;

public class Client implements InClient {
    private String nom;
    private String dni; // De 9 caràcters

    // IMPLEMENTAR MÈTODE toString (donar el format desitjant a les impressions per pantalla)

    // Constructor
    public Client(String nom, String dni) {
        this.nom = nom;
        setDni(dni);
    }

    /**
     * Getter de nom
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter de dni
     * @return dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter de nom
     * @param nom el nom del client
     */
    public void setNom(String nom) {

        if (nom.length() == 9){ this.nom = nom; }
        else { System.out.println("DNI no vàlid."); }
    }

    /**
     * Getter de dni
     * @param dni el dni del client
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obté tota la informació de la classe
     * @return un string
     */
    public String toString(){
        return nom + " amb DNI: " + dni + ". ";
    }
}


