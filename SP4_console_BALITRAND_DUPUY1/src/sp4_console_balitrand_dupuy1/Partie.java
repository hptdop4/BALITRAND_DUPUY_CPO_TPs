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
        
        
        attribuerCouleursAuxJoueurs ();
       
        initialiserPartie ();
        
        joueurCourant=J1;
        
        boolean fin=false;
        
        
        
        while (fin==false){ // tant que la partie n'est pas finie : 
            

            grilleJeu.afficherGrilleSurConsole();
            
            
            // Choix de l'action
             int choix;
             Scanner sc=new Scanner(System.in);
             
             
             System.out.println(joueurCourant.Nom + " il vous reste " + joueurCourant.nombreJetonsRestants + " Jetons");
             
             System.out.println( joueurCourant.Nom +" : Faites votre choix : " + "\n 1 : jouer un jeton" + "\n 2 : récupérer un jeton" + " \n 3 : désintégrer un jeton");
             choix = sc.nextInt();
             
            //On vérifie si il choisit bien un nombre parmi les choix proposés

            while(choix!= 1 && choix !=2 && choix!=3){
                
                
                 System.out.println("Choix non valide, rejouez");
                 
                 System.out.println(joueurCourant.Nom + " il vous reste " + joueurCourant.nombreJetonsRestants + " Jetons");
                 System.out.println(joueurCourant.Nom +" : Faites votre choix : " + "\n 1 : jouer un jeton" + "\n 2 : récupérer un jeton" + " \n 3 : désintégrer un jeton");
                 choix = sc.nextInt();
            }
            
            // Si il choisit de jouer un jeton :
            if (choix == 1){
              
                int colonne;
                System.out.println(joueurCourant.Nom +" : choisissez votre colonne : " + "\n 0 - 1 - 2 - 3 - 4 - 5 - 6 " );
                colonne = sc.nextInt();
              
            // On vérifie si il choisit un nombre parmi les choix proposés
              while(colonne!= 0 &&  colonne !=1 && colonne !=2 && colonne!=3 && colonne!=4 && colonne!=5 && colonne!=6){
                 System.out.println("Choix non valide, rejouez");
                 System.out.println(joueurCourant.Nom +" : choisissez votre colonne : " + "\n 0 - 1 - 2 - 3 - 4 - 5 - 6 " );
                 colonne = sc.nextInt(); 
              }
              
              
              boolean validation = grilleJeu.colonneRemplie(colonne); // Verifie si colonne pleine
              
              System.out.println(validation +" validation");
              
              
              //si la colonne est deja pleine on rejoue
              while (validation == true){
                System.out.println ("La colonne est pleine, vous devez rejouer");
                System.out.println(joueurCourant.Nom +" : choisissez votre colonne : " + "\n 0 - 1 - 2 - 3 - 4 - 5 - 6 " );
                colonne = sc.nextInt();  
                validation = grilleJeu.colonneRemplie(colonne);
              }
              
              
              Jeton j;//jeton qui recupere la bonne couleur a ajouter dans la grille
              j =new Jeton (joueurCourant.Couleur) ; // définit un jeton lui même définit par sa couleur
              
              System.out.println (joueurCourant.Couleur);
              
              System.out.println (j.lireCouleur());
              
              joueurCourant.nombreJetonsRestants--;// A chaque jeton joué on enlève un jeton
              
              
              boolean verification;//On  ajoute j ( de la bonne couleur) dans la colonne choisie 
             
   
 
 
              
              verification = grilleJeu.ajouterJetonDansColonne(j, colonne);  
              
            }
           
            
            
            System.out.println(joueurCourant.nombreJetonsRestants); //verifier si code marche, à supprimer
            
            grilleJeu.afficherGrilleSurConsole();// verifier si code marche, à supprimer 
            
            
            for (int i=0; i<=5; i++){
        for (int k=0; k<=6 ; k++){ 
            
          System.out.println(grilleJeu.CellulesJeu[i][k].lireCouleurDuJeton());
            
         }
        }
            
            
            
            
           if(grilleJeu.etreGagnanteDuJeton(joueurCourant)==true){ // Arret partie si on a une grille gagnante
               
               System.out.println("La partie est finie, résultats : " + "Le gagnant est :" + joueurCourant.Nom);
               
               fin=true;
           }
           else if(grilleJeu.etreRemplie()== true){// Arret partie si on a une grille remplie
               
               System.out.println("La grille est pleine, fin de la partie ");
               
               fin = true;
           }
           else{
               
               joueurCourant=ProchainJoueur();
           }
        }
        
        
   
       
    }
}
    
    