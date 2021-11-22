/*
 * Balitrand Flavie et Roxana Dupuy
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
        
        
        // placement des trous noirs aleatoire
        
        int colAl;
        int lignAl;
        int compteur=0;
        while (compteur<=5){
            
        colAl=(int) ( Math.random()*( 6-0 ));
        
        lignAl=(int) (Math.random() * ( 5-0 ));
            
        System.out.println(colAl);
        System.out.println(lignAl);
        
        grilleJeu.placerTrouNoir(lignAl, colAl);
        
        if(grilleJeu.placerTrouNoir(lignAl, colAl)==false){
            
        compteur++;
        
        } 
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
        
        
        //On a decide que le joueur rouge commence (aléatoire)
        
        if (J1.Couleur=="Rouge"){
            
            joueurCourant=J1;
        }
        
        else if (J2.Couleur=="Rouge"){
            
            joueurCourant=J2;
        }
        
        
        boolean fin=false;
                
        grilleJeu.afficherGrilleSurConsole();
        
        
        
        //Depart de la boucle partie
        
        while (fin==false){ // tant que la partie n'est pas finie : 
            
            
            // Choix de l'action
             int choix;
             Scanner sc=new Scanner(System.in);
             
             
             System.out.println("Autour du joueur " +  joueurCourant.Couleur);
             System.out.println(joueurCourant.Nom +" il vous reste " + joueurCourant.nombreJetonsRestants + " Jetons");
             
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
              
              
              
              //si la colonne est deja pleine on rejoue
              while (validation == true){
                System.out.println ("La colonne est pleine, vous devez rejouer");
                System.out.println(joueurCourant.Nom +" : choisissez votre colonne : " + "\n 0 - 1 - 2 - 3 - 4 - 5 - 6 " );
                colonne = sc.nextInt();  
                validation = grilleJeu.colonneRemplie(colonne);
              }
              
              
              Jeton j;//jeton qui recupere la bonne couleur a ajouter dans la grille
              j =new Jeton (joueurCourant.Couleur) ; // définit un jeton lui même définit par sa couleur
              
              joueurCourant.nombreJetonsRestants--;// A chaque jeton joué on enlève un jeton
              
              
              boolean verification;//On  ajoute j ( de la bonne couleur) dans la colonne choisie 
             
   
              verification = grilleJeu.ajouterJetonDansColonne(j, colonne);  
              
            }
            
           
            
            grilleJeu.afficherGrilleSurConsole();
            
            
            
           if(grilleJeu.etreGagnanteDuJeton(joueurCourant)==true){ // Arret partie si on a une grille gagnante
               
               System.out.println("La partie est finie, résultats : ");
               System.out.println("Le gagnant est :" + joueurCourant.Nom);
               
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
    
    