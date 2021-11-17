/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_balitrand_dupuy1;

import java.util.Random;
import java.util.Scanner;

public class Partie {
    
    
    Joueur [] ListeJoueur ;//tableau des deux joueurs de la partie
    
    
    Joueur joueurCourant;//désigne le joueur courant à tout moment de la partie
    Grille grilleJeu;//la grille de jeu
    
    
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
        
        
        //attribution nom aux joueurs
        String nom1;
        String nom2;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Joueur 1 quel est votre pseudo ? ");
        nom1 = sc.nextString();
        System.out.println("Joueur 2 quel est votre pseudo ? ");
        nom2 = sc.nextString();
        
        ListeJoueur[0]=nom1;
        ListeJoueur[1]=nom2;
        
        Joueur J1 = new Joueur(nom1) ;
        Joueur J2 = new Joueur(nom2) ;
        
        
       
        
        // attribution des jetons aux joueurs
        
        for (int t=0; t<=20; t++){
        
      Jeton jetonR_t = new Jeton("Rouge");
        }
        
        
        for (int t=0; t<=20; t++){
        
      Jeton jetonJ_t = new Jeton("Jaune");
        }
        
        
        
           
        
        
        
        
    }
    
    public void debuterPartie (){
        
    }
    
    
    public Joueur ProchainJoueur(){
        
        if (joueurCourant==ListeJoueur[0]){
            
            return ListeJoueur[1];
        }
        else{
            return ListeJoueur[0];
        }
    }
}
