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
public class Personne {
    
    String nom;
    String prenom;
    
    
    public Personne(String Nom, String Prenom) { 
      
      nom=Nom;
      prenom=Prenom;
    }
    
    @Override 
    public String toString() { 
    String chaine_a_retourner; 
    chaine_a_retourner = nom + prenom;   
    
    return chaine_a_retourner ;  
}
    
}
