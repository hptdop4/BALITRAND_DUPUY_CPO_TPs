/*Flavie Balitrand
* TDC
* TP1
* 22/10/21
 */
package tp2_bieres_balitrand;

/**
 *
 * @author Flavie BALITRAND
 */
public class TP2_Bieres_BALITRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean verif=true;
        
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ; 
        
       
        uneBiere.lireEtiquette();
        
        
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
       
        autreBiere.lireEtiquette();
        
        
        BouteilleBiere Biere3 = new BouteilleBiere("Truffier", 6.4 ,"Foret d'Olt") ;
       
        Biere3.lireEtiquette();
        
         BouteilleBiere Biere4 = new BouteilleBiere("Soixantaine", 6.1 ,"Moulin") ;
       
        Biere4.lireEtiquette();
        
         BouteilleBiere Biere5 = new BouteilleBiere("Grandet", 6.9 ,"Chateau Grandet") ;
       
        Biere5.lireEtiquette();
        
        
        verif=uneBiere.Decapsuler();
        System.out.println(verif);
    }
    
}
