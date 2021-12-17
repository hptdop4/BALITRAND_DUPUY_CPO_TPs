package mini.projet_balitrand_dupuy;


import java.util.Random;
import java.util.Scanner;

/*
 * Mini Projet Lights out
 * Dupuy et Balitrand
 */

/**
 *
 * @author Flavie BALITRAND
 */
public class Partie {
    Joueur J1;
    Grille grille;

    
    public Partie(Joueur joueur1) {

        J1 = joueur1;
}
    
    public void ChoixNiveau(int level){
        
        //level avec une seule lumiere allumée située au hasard
        
        if (level==1){
        Random rand = new Random();
        int lignAl = rand.nextInt(5);

        int colAl = rand.nextInt(5);
    
        grille.ChangerEtat(lignAl, colAl);
        }
        
        //level test victoire évidente
        else if (level==2){
        
        grille.ChangerEtat(2, 2);
        grille.ChangerEtat(3, 2);
        grille.ChangerEtat(1, 2);
        grille.ChangerEtat(2, 3);
        grille.ChangerEtat(2, 1);
        
        }
        
        
        //gegner (4.0 3.3 1.1)
        else if (level==2){
        grille.ChangerEtat(0, 1);
        grille.ChangerEtat(1, 0);
        grille.ChangerEtat(1, 1);
        grille.ChangerEtat(1, 2);
        grille.ChangerEtat(2, 1);
        grille.ChangerEtat(2, 3);
        grille.ChangerEtat(3, 0);
        grille.ChangerEtat(3, 2);
        grille.ChangerEtat(3, 3);
        grille.ChangerEtat(3, 4);
        grille.ChangerEtat(4, 0);
        grille.ChangerEtat(4, 1);
        grille.ChangerEtat(4, 3);
        }
    }
    
    
    
    
    
    public void initialiserPartie() {

        grille = new Grille();
        
        System.out.println(J1.Nom + ": nous vous proposons de sélectionner un niveau.");
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt(); 
        
        ChoixNiveau(level);
       
        
    }
    
    //methode principale qui gere toute la partie et se termine quand on detecte que toute la grille est eteinte
    public void TourPartie(){
        
        initialiserPartie();
        
        grille.Affichage();
        
        boolean fin = grille.TerminerJeu();
        
        while(fin==false){
            
            System.out.println(J1.Nom + " vous avez joué " + J1.nbreClic + " fois.");
            
            System.out.println(J1.Nom + " : Choisissez les coordonnées de votre prochaine action.");
            System.out.println("Saisissez la ligne:");
            
            Scanner sc = new Scanner(System.in);
            int ligne = sc.nextInt();
            
            System.out.println("Saisissez la colonne:");
            int colonne = sc.nextInt();
            
            while (ligne != 0 && ligne != 1 && ligne != 2 && ligne != 3 && ligne !=4 ||  colonne != 0 && colonne != 1 && colonne != 2 && colonne != 3 && colonne !=4 ){
                System.out.println(J1.Nom + " : vous faites erreur, recommencez.");
                
                System.out.println("Saisissez la ligne:");
                ligne = sc.nextInt();
            
                System.out.println("Saisissez la colonne:");
                colonne = sc.nextInt();
                
            }
            
            grille.ChangerEtat(ligne, colonne);
            if (ligne +1 != 5){
               grille.ChangerEtat(ligne +1, colonne); 
            }
            if (ligne -1 != -1){
               grille.ChangerEtat(ligne -1, colonne); 
            }
            if (colonne +1 != 5){
               grille.ChangerEtat(ligne , colonne +1); 
            }
            if (colonne -1 != -1){
               grille.ChangerEtat(ligne , colonne -1); 
            }
            
            
            J1.nbreClic++;
            
            fin = grille.TerminerJeu();
            
            
            grille.Affichage();
        }
        
        System.out.println("Félicitation " + J1.Nom + " vous avez réussi en " + J1.nbreClic + " coups");
    
    }
}

