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
   
   
   //methode pour renvoyer une suite de caracteres quand on veut lire l'objet 
   
   @Override 
    public String toString() { 
    String chaine_a_retourner; 
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";   
    if (ouverte == true ) chaine_a_retourner += "oui" ; 
    else chaine_a_retourner += "non" ; 
    return chaine_a_retourner ;  
}
   
    
   //methode pour definir rapidement un nouvel objet de classe  BouteilleBiere
    
   public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { 
 
   nom = unNom; 
   degreAlcool = unDegre; 
   brasserie = uneBrasserie; 
   ouverte = true; 
}
   
   
   
   public void lireEtiquette() { 
 
   System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; 
   
}
   
   
   
   //methode qui donne ouverte=true ou renvoie un message d erreur si elle est deja ouverte
   
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
  
