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
        
        grilleJeu.viderGrille();
        
        System.out.println("Début de la partie de puissance 4 !");
        
        
        //attribution nom aux joueurs
        String nom1;
        String nom2;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Joueur 1 quel est votre pseudo ? ");
        nom1 = sc.nextLine();
        System.out.println("Joueur 2 quel est votre pseudo ? ");
        nom2 = sc.nextLine();
        
        
        Joueur joueur1 = new Joueur(nom1) ;//Création des deux joueurs
        Joueur joueur2 = new Joueur(nom2) ;
        
       
       ListeJoueur[0]=joueur1;
       ListeJoueur[1]=joueur2;
        
        
        attribuerCouleursAuxJoueurs ();
        
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
        // on va chercher un int aléatoire pour la colonne aléatoire entre 6 et 0
        lignAl=(int) (Math.random() * ( 5-0 ));
        // on va chercher un int aléatoire pour la ligne aléatoire entre 5 et 0 
        
        grilleJeu.placerTrouNoir(lignAl, colAl);
        
        if(grilleJeu.CellulesJeu[lignAl][colAl].trouNoir==true){
            
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
        
        
        initialiserPartie ();
        
        boolean fin=false;
                
        grilleJeu.afficherGrilleSurConsole();
        
        
        
        //Depart de la boucle partie
        
         while (fin==false){ // tant que la partie n'est pas finie : 
            
            
            // Choix de l'action
             int choix;
             Scanner sc=new Scanner(System.in);
             
             
             System.out.println("Au tour du joueur " +  joueurCourant.Couleur);
             System.out.println(joueurCourant.Nom +" il vous reste " + joueurCourant.nombreJetonsRestants + " Jetons");
             
             System.out.println( joueurCourant.Nom +" : Faites votre choix : " + "\n 1 : jouer un jeton" + "\n 2 : récupérer un jeton" );
             choix = sc.nextInt();
             
            //On vérifie si il choisit bien un nombre parmi les choix proposés

            while(choix!= 1 && choix !=2){
                
                
                 System.out.println("Choix non valide, rejouez");
                 
                 System.out.println(joueurCourant.Nom + " il vous reste " + joueurCourant.nombreJetonsRestants + " Jetons");
                 System.out.println(joueurCourant.Nom +" : Faites votre choix : " + "\n 1 : jouer un jeton" + "\n 2 : récupérer un jeton");
                 choix = sc.nextInt();
            }
            /*
            while (choix==3 && joueurCourant.nombreDesintegrateurs==0){
                
                System.out.println("Choix non valide, vous avez actuellement 0 desintegrateur. Rejouez");
                
                 System.out.println(joueurCourant.Nom + " il vous reste " + joueurCourant.nombreJetonsRestants + " Jetons");
                 System.out.println(joueurCourant.Nom +" : Faites votre choix : " + "\n 1 : jouer un jeton" + "\n 2 : récupérer un jeton" + " \n 3 : désintégrer un jeton");
                 choix = sc.nextInt();
                
            }
            
            */
            
            
            
            
            
            
            
            
            
            
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
              
              
              if (verification==false){
                  
                  System.out.println ("Oh non un trou noir est apparu, votre jeton a été avalé !");

                  System.out.println ("Au tour du joueur suivant");
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
           
           else if(J1.nombreJetonsRestants==0 && J2.nombreJetonsRestants==0){// Arret partie si le joueur n'a plus de jetons 
               
               System.out.println("Les joueurs n'ont plus de jetons. Egalité. ");
               
               fin = true;
           }
           
           
           else{
               
               joueurCourant=ProchainJoueur();
           }
        }
    
            
            
            else if (choix==2){
                
                int recupColonne;
                int recupLigne;
                
                System.out.println ("Vous allez récupérer un jeton de votre couleur");
                System.out.println ("Saisissez la colonne du jeton (de 0 a 6 en commençant à gauche) ");
                recupColonne=sc.nextInt();
                
                System.out.println ("Saisissez la ligne du jeton (de 0 a 5 en commençant en haut) ");
                recupLigne=sc.nextInt();
                
                //verification que l'on veut retirer un jeton qui nous appartient
                
                while (!joueurCourant.Couleur.equals(grilleJeu.lireCouleurDuJeton(recupLigne, recupColonne))){
                    
                    
                System.out.println ("Erreur ce jeton n'est pas à vous.");
                System.out.println ("Saisissez la colonne du jeton (de 0 a 6 en commençant à gauche) ");
                recupColonne=sc.nextInt();
                
                System.out.println ("Saisissez la ligne du jeton (de 0 a 5 en commençant en haut) ");
                recupLigne=sc.nextInt();
                    
                }
                
                System.out.println ("----------------------");
                grilleJeu.afficherGrilleSurConsole();
                
                grilleJeu.recupererJeton(recupLigne, recupColonne);
                
                System.out.println ("----------------------");
                
                grilleJeu.afficherGrilleSurConsole();
                
                joueurCourant.nombreJetonsRestants++;
                
                grilleJeu.tasserGrille(recupLigne, recupColonne);
                
               
                System.out.println ("----------------------");
            
            grilleJeu.afficherGrilleSurConsole();
            
            
            
            int nbrGagnant=0;
            String nomGagnant=" ";
            
            
            
           if(grilleJeu.etreGagnanteDuJeton(J1)==true){ // Arret partie si on a une grille gagnante
               
               System.out.println( J1.Nom + " a aligné sufisamment de jetons");
               
               nbrGagnant++;
               
               nomGagnant=J1.Nom;
               
               fin=true;
           }
           
           if(grilleJeu.etreGagnanteDuJeton(J2)==true){ // Arret partie si on a une grille gagnante
               
               System.out.println( J2.Nom + " a aligné sufisamment de jetons");
               
               nbrGagnant++;
               
               nomGagnant=J2.Nom;
               
               fin=true;
           }
           
           if(nbrGagnant!=0){
               
               if (nbrGagnant == 1){
                   
                   System.out.println( "Après tassement nous avons un gagnant : " + nomGagnant);
                   
               }
               else{
                   System.out.println( joueurCourant.Nom + " a causé une égalité.");
                   System.out.println("Le vainqueur est donc : " + ProchainJoueur().Nom);
               }
               
               
           }
           
           else{
           
           if(grilleJeu.etreRemplie()== true){// Arret partie si on a une grille remplie
               
               System.out.println("La grille est pleine, fin de la partie ");
               
               fin = true;
           }
           
           else if(J1.nombreJetonsRestants==0 && J2.nombreJetonsRestants==0){// Arret partie si le joueur n'a plus de jetons 
               
               System.out.println("Les joueurs n'ont plus de jetons. Egalité. ");
               
               fin = true;
           }
           
           
           else{
               
               joueurCourant=ProchainJoueur();
           }
        }
    }
            
           // System.out.println(joueurCourant.nombreDesintegrateurs);
}}
}
    
    