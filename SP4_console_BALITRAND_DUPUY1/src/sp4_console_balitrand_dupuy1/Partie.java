/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_balitrand_dupuy1;

import java.util.Random;


public class Partie {
    
    
    Joueur [] ListeJoueur ;//tableau des deux joueurs de la partie
    
    
    Joueur joueurCourant;//désigne le joueur courant à tout moment de la partie
    Grille grilleJeu;//la grille de jeu
    
    Joueur J1;
    Joueur J2;
    
 public Partie (Joueur joueur1, Joueur joueur2){
    
     J1=joueur1;
     J2=joueur2;
    
 }   
    public void attribuerCouleursAuxJoueurs (){
        
        Random rand = new Random();
        boolean quellecouleur;
        quellecouleur=rand.nextBoolean();
        
        if (quellecouleur==true){
        
        ListeJoueur[0].Couleur="Jaune";
        ListeJoueur[1].Couleur="Rouge";
        }
        else if (quellecouleur==false){
        
        ListeJoueur[1].Couleur="Jaune";
        ListeJoueur[0].Couleur="Rouge";
        }
        
    }
    
    
    public void initialiserPartie (){
        
        grilleJeu = new Grille() ; // création grille 
        
        
        // attribution des jetons aux joueurs
        
        
        
        for (int t=0; t<=20; t++){
        
      Jeton jetonR_t = new Jeton("Rouge");
      
      if(J1.Couleur=="Rouge"){
       J1.ListeJetons[t]=jetonR_t;
      }
      else{
          J2.ListeJetons[t]=jetonR_t;
      }
        }
        
        
        for (int t=0; t<=20; t++){
        
      Jeton jetonJ_t = new Jeton("Jaune");
      
      if(J1.Couleur=="Jaune"){
       J1.ListeJetons[t]=jetonJ_t;
      }
      else{
          J2.ListeJetons[t]=jetonJ_t;
      }
        }
      
        }
        
        
    
    public void debuterPartie (){
        
        JoueurCourant = listeJoueur [0];
        initialiserPartie ();
        
        while (){
            
           
        }
        
        
        
    }
    
    
    public Joueur ProchainJoueur(){
        
        if (joueurCourant==J1){
            
            return J2;
        }
        else{
            return J1;
        }
    }
}
