
package prog2.vista;

/**
 *
 * @author lauraigual
 */
public class ExcepcioReserva extends Exception {


    // ERROR D'AFEGIR UNA RESERVA QUAN L'ALLOTJAMENT NO ESTÀ DISPONIBLE PEL PERÍODE SOL·LICITAT
    public ExcepcioReserva(String message) {
        super(message);
    }
    
}
