package mini.projet_balitrand_dupuy;

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
    Grille grille = new Grille ();
    int level;
    int[][] TabReponse = new int[2][5];

    public Partie(Joueur joueur1) {

        J1 = joueur1;
    }

    public void initialiserPartie() {

        //grille = new Grille();

        System.out.println(J1.Nom + ": nous vous proposons de sélectionner un niveau entre 2  3  4  et  5 :");
        Scanner sc = new Scanner(System.in);
        level = sc.nextInt();
        while (level != 2 && level != 3 && level != 4 && level != 5) {
            System.out.println(J1.Nom + " : vous faites erreur, recommencez.");

            System.out.println("Saisissez un niveau entre 2  3  4  et  5 :");
            level = sc.nextInt();
        }

        TabReponse = grille.ChoixNiveau(level);

    }

    //methode principale qui gere toute la partie et se termine quand on detecte que toute la grille est eteinte
    public void TourPartie() {
        Scanner sc = new Scanner(System.in);

        initialiserPartie();

        grille.Affichage();

        System.out.println(level);
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.println(TabReponse[j][i]);
            }
        }

        boolean fin = grille.TerminerJeu();

        while (fin == false) {

            Jouer_tour();

            fin = grille.TerminerJeu();

            grille.Affichage();

            if (J1.nbreClic == 15) {

                System.out.println("Perdu la limite de jeu est dépassée voulez vous voir la réponse ?   Tapez  N ou O");
                String reponse = sc.nextLine();

                while (!"N".equals(reponse) && !"O".equals(reponse)) {

                    System.out.println("Perdu la limite de jeu est dépassée voulez vous voir la réponse ?   Tapez  N ou O");
                    reponse = sc.nextLine();
                }

                if ("N".equals(reponse)) {
                    break;
                } else if ("O".equals(reponse)) {
                    
                    System.out.println("Vous allez rejouer sur la même configuration, pour gagner le plus efficacement suivez les instructions");

                    grille.Reset(level, TabReponse);
                    J1.nbreClic=0;
                    int coord=level-2;
                    grille.Affichage();
                    
                    while (fin == false && J1.nbreClic < 10){
                        System.out.println("Les coordonnées à saisir sont: " + TabReponse[0][coord] + " - "+TabReponse[1][coord]);
                        Jouer_tour();
                        grille.Affichage();
                        fin = grille.TerminerJeu();
                        
                        coord--;
                        
                    }
                    break;

                }

                break;
            }
        }
        if (fin == true) {
            System.out.println("Félicitation " + J1.Nom + " vous avez réussi en " + J1.nbreClic + " coups");
        }
    }

    public void Jouer_tour() {

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


    }
}
