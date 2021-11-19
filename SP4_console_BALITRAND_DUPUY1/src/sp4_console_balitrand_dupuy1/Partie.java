/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_balitrand_dupuy1;

import java.util.Random;
import java.util.Scanner;


public class Partie {
    
    
    Joueur [] ListeJoueur = new Joueur [2];//tableau des deux joueurs de la partie
    
    
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
        
      Jeton jetonj1 = new Jeton(ListeJoueur[0].Couleur);
      ListeJoueur[0].ajouterJeton(jetonj1);
      Jeton jetonj2 = new Jeton( ListeJoueur[1].Couleur);
       ListeJoueur[1].ajouterJeton(jetonj2);

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


        
    
    public void debuterPartie (){
        
        System.out.println("J4");
        
        attribuerCouleursAuxJoueurs ();
        System.out.println("J5");
        
    
        initialiserPartie ();
        System.out.println(J1.Couleur);
        joueurCourant=J1;
        
        boolean fin=false;
        System.out.println("J5");
        while (fin==false){ // tant que la partie n'est pas finie : 
            System.out.println("J5");
            grilleJeu.afficherGrilleSurConsole();
            System.out.println("ghjfkfy");
            // Choix de l'action
             int choix;
             Scanner sc=new Scanner(System.in);
             System.out.println("Joueur : Faites votre choix : " + "\n 1 : jouer un jeton" + "\n 2 : récupérer un jeton" + " \n 3 : désintégrer un jeton");
             choix = sc.nextInt();
             
            //On vérifie si il choisit bien un nombre parmi les choix proposés

            while(choix!= 1 && choix !=2 && choix!=3){
                 System.out.println("Joueur : Faites votre choix : " + "\n 1 : jouer un jeton" + "\n 2 : récupérer un jeton" + " \n 3 : désintégrer un jeton");
                 choix = sc.nextInt();
            }
            
            // Si il choisit de jouer un jeton :
            if (choix == 1){
              int colonne;
              System.out.println("Joueur : choisissez votre colonne : " + "\n 0 - 1 - 2 - 3 - 4 - 5 - 6 " );
              colonne = sc.nextInt();
              
            // On vérifie si il choisit un nombre parmi les choix proposés
              while(colonne!= 0 &&  colonne !=1 && colonne !=2 && colonne!=3 && colonne!=4 && colonne!=5 && colonne!=6){
                 System.out.println("Joueur : choisissez votre colonne : " + "\n 0 - 1 - 2 - 3 - 4 - 5 - 6 " );
                 colonne = sc.nextInt(); 
              }
              
              
              boolean validation = grilleJeu.colonneRemplie(colonne); // Verifie si colonne pleine
              
              System.out.println(validation);
              
              while (validation == true){
                System.out.println ("La colonne est pleine, vous devez rejouer");
                System.out.println("Joueur : choisissez votre colonne : " + "\n 0 - 1 - 2 - 3 - 4 - 5 - 6 " );
                colonne = sc.nextInt();  
                validation = grilleJeu.colonneRemplie(colonne);
              }
              System.out.println ("L");
              Jeton j;
              j = joueurCourant.ListeJetons [joueurCourant.nombreJetonsRestants-1]; // définit un jeton lui même définit par sa couleur
              System.out.println ("m");
              joueurCourant.nombreJetonsRestants--;// A chaque jeton jooué on en lève un jeton
              System.out.println ("p");
              boolean verification;//On  verifie si colonne déjà pleine
              System.out.println ("o");
              verification = grilleJeu.ajouterJetonDansColonne(j, colonne); 
              System.out.println ("t");
            }
           // System.out.println(joueurCourant.nombreJetonsRestants); verifier si code marche
           // grilleJeu.afficherGrilleSurConsole();
            
            
            
           if(grilleJeu.etreGagnanteDuJeton(joueurCourant)==true){ // Arret partie si on a une grille gagnante
               
               System.out.println("La partie est finie, résultats : " + "Le gagnant est :" + joueurCourant);
               
               fin=true;
           }
           else if(grilleJeu.etreRemplie()== true){// Arret partie si on a une grille remplie
               
               System.out.println("La grille est pleine, fin de la partie ");
               
               fin = true;
           }
           else{
               ProchainJoueur();
           }
        }
        
        
   
       
    }
}
    
    