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

        System.out.println(J1.Nom + ": nous vous proposons de sélectionner un niveau.");
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();

        grille.ChoixNiveau(level);

    }

    //methode principale qui gere toute la partie et se termine quand on detecte que toute la grille est eteinte
    public void TourPartie() {

        initialiserPartie();

        grille.Affichage();

        boolean fin = grille.TerminerJeu();

        while (fin == false) {

            System.out.println(J1.Nom + " vous avez joué " + J1.nbreClic + " fois.");

            System.out.println(J1.Nom + " : Choisissez les coordonnées de votre prochaine action.");
            System.out.println("Saisissez la ligne:");

            Scanner sc = new Scanner(System.in);
            int ligne = sc.nextInt();

            System.out.println("Saisissez la colonne:");
            int colonne = sc.nextInt();

            while (ligne != 0 && ligne != 1 && ligne != 2 && ligne != 3 && ligne != 4 || colonne != 0 && colonne != 1 && colonne != 2 && colonne != 3 && colonne != 4) {
                System.out.println(J1.Nom + " : vous faites erreur, recommencez.");

                System.out.println("Saisissez la ligne:");
                ligne = sc.nextInt();

                System.out.println("Saisissez la colonne:");
                colonne = sc.nextInt();

            }

            grille.JouerCase(ligne, colonne);

            J1.nbreClic++;

            fin = grille.TerminerJeu();

            grille.Affichage();

            if (J1.nbreClic == 10) {

                System.out.println("Perdu la limite de jeu est dépassée voulez vous voir la réponse ?   Tapez  N ou O");
                String reponse = sc.nextLine();
                
                while(!"N".equals(reponse) && !"O".equals(reponse)){
                    
                    System.out.println("Perdu la limite de jeu est dépassée voulez vous voir la réponse ?   Tapez  N ou O");
                    reponse = sc.nextLine();
                }
                
                
                
                
                if ("N".equals(reponse)){
                    break;
                }
                
                
                
                else if ("O".equals(reponse)){
                    
                    
                    
                }
                
                
                
                
             break;   
            }
        }
        if (fin == true) {
            System.out.println("Félicitation " + J1.Nom + " vous avez réussi en " + J1.nbreClic + " coups");
        }
    }
}
