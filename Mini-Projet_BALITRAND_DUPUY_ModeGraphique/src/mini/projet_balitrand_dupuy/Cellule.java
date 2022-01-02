package mini.projet_balitrand_dupuy;

/*
 * Mini Projet Lights out
 * Dupuy et Balitrand
 */

/**
 *
 * @author Flavie BALITRAND
 */
public class Cellule {
    String Etat;
    
    public Cellule() {
        Etat="eteint";
    }
    
    
    public void ChangerEtat2() {

        

        if (Etat=="eteint") {
            Etat = "allume";
        } else if (Etat == "allume") {
            Etat = "eteint";
        }
    }
    
}
