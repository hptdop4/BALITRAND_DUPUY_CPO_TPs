/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_balitrand_dupuy1;

/**
 *
 * @author Flavie BALITRAND
 */
public class Cellule {
    
    Jeton jetonCourant;
    boolean desintegrateur=false;
    boolean trouNoir ; //VERSION 2 AJOUT TROU NOIR
    
    public Cellule() { 
    
       jetonCourant=null;
       desintegrateur=false;
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
    /*
    public boolean placerTrouNoir (){ //VERSION 2 AJOUT TROU NOIR
     //ajoute un trou noir à l’endroit indiqué et retourne vrai si l’ajout s’est bien passé, ou faux
        
      
       if (trouNoir==false){
           trouNoir = Cellules[i][k];
           return true;
       } else {
           return false;
       }         
      
     }
    
    
    public boolean presenceTrouNoir (){ // VERSION 2 AJOUT TROU NOIR
       if (trouNoir!=false){ //renvoie vrai si un trou noir est présent sur la cellule
           return true;
       }
    }
    */
    
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
        if (){
            
            return true;
        }else {
            return false;
        }
    }*/
}
