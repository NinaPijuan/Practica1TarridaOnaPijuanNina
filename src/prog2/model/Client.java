package prog2.model;

public class Client implements InClient {
    private String nom;
    private String dni; // De 9 caràcters

    // IMPLEMENTAR MÈTODE toString (donar el format desitjant a les impressions per pantalla)

    // Constructor
    public Client(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    /**
     * Getter de nom
     * @return nom
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Getter de dni
     * @return dni
     */
    @Override
    public String getDni() {
        return dni;
    }

    /**
     * Setter de nom
     * @param nom el nom del client
     */
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter de dni
     * @param dni el dni del client
     */
    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }
}
