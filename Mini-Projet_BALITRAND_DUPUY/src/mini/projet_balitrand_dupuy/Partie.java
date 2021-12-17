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
    
    public void initialiserPartie() {

        grille = new Grille();
        
        
        // allumage aleatoire d'une case 
        Random rand = new Random();
        int lignAl = rand.nextInt(5);

        int colAl = rand.nextInt(5);
    
        grille.ChangerEtat(lignAl, colAl);
        
    }
    
    //methode principale qui gere toute la partie et se termine quand on detecte que toute la grille est eteinte
    public void TourPartie(){
        
        initialiserPartie();
        
        grille.Affichage();
        
        while(grille.TerminerJeu()==false){
            
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
            
            
            
            
            
            grille.Affichage();
        }
        
    
    }
}

