/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_balitrand;

/**
 *
 * @author Flavie BALITRAND
 */
public class BouteilleBiere {
   
    
   String nom;
   double degreAlcool;
   String brasserie;
   boolean ouverte;
   
   
   public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { 
 
   nom = unNom; 
   degreAlcool = unDegre; 
   brasserie = uneBrasserie; 
   ouverte = false; 
}
   
   
   
   public void lireEtiquette() { 
 
   System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; 
   
}
   
   public boolean Decapsuler() { 
  
   boolean verif=true;
  
   if (ouverte==true){
       
       System.out.println( "erreur :  biere déjà ouverte");
       verif=false;
   }
   
   
   else if (ouverte==false){
   ouverte = true ; 
   
   }
   
   return verif;
   
   
}
} 
  
