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
    
    Jeton jetonCourant=null;
    boolean desintegrateur=false;
    
    public Cellule() { 
    
       jetonCourant=null;
       desintegrateur=false;
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
    
    
    public String lireCouleurDuJeton(){
        
        if (jetonCourant!=null){
        return jetonCourant.Couleur;
    }
        else{
            return"Vide";
        }
}
}
