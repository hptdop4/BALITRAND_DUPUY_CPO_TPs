/*
 * 
 * Flavie Balitrand
* TDC
* TP2
* 24/10/21
 */
package tp2_relation_1_balitrand;

/**
 *
 * @author Flavie BALITRAND
 */
public class Voiture {
    
    
    int PuissanceCV;
    String Modele;
    String Marque;
    
    
    public Voiture(String modele, String marque, int puissance) { 
      
      PuissanceCV=puissance; 
      Modele=modele;
      Marque=marque;
      
    }
    
    @Override 
    public String toString() { 
    String chaine_a_retourner; 
    chaine_a_retourner = Modele + " de la marque " +Marque+ "( "+PuissanceCV + " chevaux )";   
    
    return chaine_a_retourner ;  
}
    
}
