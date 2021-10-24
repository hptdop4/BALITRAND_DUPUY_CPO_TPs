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
    int nbVoitures ; 
    Voiture [] liste_voitures ;
    
    
    public Personne(String Nom, String Prenom) { 
      
      nom=Nom;
      prenom=Prenom;
      liste_voitures = new Voiture [3] ;
      nbVoitures=0;
    }
    
    @Override 
    public String toString() { 
    String chaine_a_retourner; 
    chaine_a_retourner = nom + prenom;   
    
    return chaine_a_retourner ;  
}
    
   public boolean ajouter_voiture( Voiture voiture_a_ajouter) { 
 
       
       
       
       
       
}  
    
    
    
    
    
}
