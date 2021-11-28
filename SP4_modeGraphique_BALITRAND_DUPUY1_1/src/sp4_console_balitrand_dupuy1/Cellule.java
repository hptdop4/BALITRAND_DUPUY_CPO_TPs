/*
 * Balitrand Flavie et Roxana Dupuy
 */
package sp4_console_balitrand_dupuy1;

/**
 *
 * @author Flavie BALITRAND
 */
public class Cellule {
    
    Jeton jetonCourant;
    //boolean desintegrateur=false;//V4
    boolean trouNoir ; //VERSION 2 AJOUT TROU NOIR
    
    public Cellule() { 
    
       jetonCourant=null;
       //desintegrateur=false;// V4
       trouNoir = false; //VERSION 2 AJOUT TROU NOIR
   }
    
    public boolean affecterJeton(Jeton j){
        
        if (jetonCourant==null){
            
            jetonCourant=j;
            return true;
        }
        else{
            return false;
        }
        
    }
    
//VERSION 3 renvoie une référence vers le jeton de la cellule

   public Jeton recupererJeton (){
       
        Jeton jetonCellule = jetonCourant;
        jetonCourant =null;
        return jetonCellule;
    } 
    
    
    
    //VERSION 2 AJOUT TROU NOIR
    
    
    public boolean placerTrouNoir (){ 
     //ajoute un trou noir à l’endroit indiqué et retourne vrai si l’ajout s’est bien passé, ou faux
        
     
       if (trouNoir==true){
           
           return false;
       } 
       else{   
           trouNoir = true;
           
           return true;
    }       }  
      
     
    
    
    public boolean presenceTrouNoir (){ // VERSION 2 AJOUT TROU NOIR
       if (trouNoir== true){ //renvoie vrai si un trou noir est présent sur la cellule
           return true;
       }
        else {
           return false;
       }
    }
    
    
    
    public String lireCouleurDuJeton(){
        
        if (jetonCourant!=null){
        return jetonCourant.Couleur;
    }
        else{
            return"Vide";
        }
}
    
    /*
    public boolean activerTrouNoir (){ //VERSION 2 AJOUT TROU NOIR
        if (trouNoir){//active le trou noir : le trou noir engloutit le jeton et disparait. Retourne vrai si OK
            jetonCourant = null;
            trouNoir = false;
            System.out.println ("Le pion a disparu, le trou noir l'a fait disparaître");
            return true;
        }else {
            return false;
        }
    }*/
}
