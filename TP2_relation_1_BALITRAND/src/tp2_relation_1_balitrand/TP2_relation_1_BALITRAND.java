/*
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
public class TP2_relation_1_BALITRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
 
        Personne bob = new Personne("Bobby", "Sixkiller"); 
        Personne reno = new Personne("Reno", "Raines"); 
 
        System.out.println("liste des voitures disponibles "+ uneClio  + "\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra ) ; 
        
        
       
        
    }
    
}
