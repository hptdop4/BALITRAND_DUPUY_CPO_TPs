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
        
        
       // atribution d une voiture a un propriaitaire
       
       bob.liste_voitures[0] = uneClio ; 
       bob.nbVoitures = 1 ; 
 
       uneClio.proprietaire = bob; 
       
       //on accede a cette voiture
       System.out.println("La premiere voiture de Bob est une " + bob.liste_voitures[0] ) ; 
       
       //autre attributions
       
       bob.liste_voitures[1] = une2008 ; 
       bob.nbVoitures = 2 ; 
 
       une2008.proprietaire = bob;
       System.out.println("La seconde voiture de Bob est une " + bob.liste_voitures[1] ) ;
        
       //de meme pour reno
       
       reno.liste_voitures[0] = uneAutreClio ; 
       reno.nbVoitures = 1 ; 
 
       uneAutreClio.proprietaire = reno;
       System.out.println("La premiere voiture de Reno est une " + reno.liste_voitures[0] ) ;
       
       reno.liste_voitures[1] = uneMicra ; 
       reno.nbVoitures = 2 ; 
 
       uneMicra.proprietaire = reno;
       System.out.println("La seconde voiture de Reno est une " + reno.liste_voitures[1] ) ;
       
       
    }
    
}
