package mini.projet_balitrand_dupuy;

import java.util.Random;

/*
 * Mini Projet Lights out
 * Dupuy et Balitrand
 */
/**
 *
 * @author Flavie BALITRAND
 */
public class Grille {

    Cellule CelluleActuelle[][] = new Cellule[5][5];

    public Grille() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                CelluleActuelle[j][i] = new Cellule();
            }
        }
    }

    public String LireEtat(int ligne, int colonne) {

        String Light = CelluleActuelle[ligne][colonne].Etat;
        return Light;
    }

    public void ChangerEtat(int ligne, int colonne) {

        String Light = LireEtat(ligne, colonne);

        if ("eteint".equals(Light)) {
            CelluleActuelle[ligne][colonne].Etat = "allume";
        } else if ("allume".equals(Light)) {
            CelluleActuelle[ligne][colonne].Etat = "eteint";
        }
    }

    public int[][] ChoixNiveau(int level) {

        Random rand = new Random();

        int[][] tableau = new int[2][5];

        //level avec une seule lumiere allumée située au hasard
        //level un seul éclairage aleatoire(très difficile)
        //level test solution en un coup (très facile)
        if (level == 2) {
            int ligne = rand.nextInt(5);
            int colo = rand.nextInt(5);
            tableau[0][0] = ligne;
            tableau[1][0] = colo;
            System.out.println(ligne + " " + colo);

            JouerCase(ligne, colo);
            return tableau;
        } //3 actions générées aléatoirement (facile)
        else if (level == 3) {
            for (int i = 0; i < 3; i++) {

                int ligne = rand.nextInt(5);
                tableau[0][i] = ligne;
                int colo = rand.nextInt(5);
                tableau[1][i] = colo;

                System.out.println(ligne + " " + colo);

                JouerCase(ligne, colo);

            }
            return tableau;

        } //4 actions générées aléatoirement (moyen)
        else if (level == 4) {
            for (int i = 0; i < 4; i++) {

                int ligne = rand.nextInt(5);
                tableau[0][i] = ligne;
                int colo = rand.nextInt(5);
                tableau[1][i] = colo;

                System.out.println(ligne + " " + colo);

                JouerCase(ligne, colo);

            }
            return tableau;
        } //5 actions générées aléatoirement (difficile)
        else if (level == 5) {
            for (int i = 0; i < 5; i++) {

                int ligne = rand.nextInt(5);
                tableau[0][i] = ligne;
                int colo = rand.nextInt(5);
                tableau[1][i] = colo;

                System.out.println(ligne + " " + colo);

                JouerCase(ligne, colo);

            }
            return tableau;
        }
        return tableau;

    }

    public void Affichage() {

        for (int i = -1; i < 5; i++) {
            for (int j = -1; j < 6; j++) {
                if (j == 5) {
                    System.out.print("\n");
                } else if (i == -1 && j == -1) {
                    System.out.print("   ");
                } else if (i == -1) {
                    System.out.print(j + " ");
                } else if (j == -1) {
                    System.out.print(i + "  ");
                } else if ("allume".equals(LireEtat(i, j))) {
                    System.out.print("\u001B[33m" + "O ");
                    System.out.print("\u001B[0m");

                } else if ("eteint".equals(LireEtat(i, j))) {
                    System.out.print("\u001B[30m" + "O ");

                }
            }

        }
    }

    public void JouerCase(int ligne, int colonne) {

        ChangerEtat(ligne, colonne);

        if (ligne + 1 != 5) {
            ChangerEtat(ligne + 1, colonne);
        }
        if (ligne - 1 != -1) {
            ChangerEtat(ligne - 1, colonne);
        }
        if (colonne + 1 != 5) {
            ChangerEtat(ligne, colonne + 1);
        }
        if (colonne - 1 != -1) {
            ChangerEtat(ligne, colonne - 1);
        }
    }

    public boolean TerminerJeu() {
        boolean fini = true;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if ("allume".equals(LireEtat(i, j))) {
                    return false;
                }

            }
        }
        return fini;

    }

    public void Reset(int level, int[][] Tab) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                CelluleActuelle[i][j].Etat = "eteint";
            }
        }
        
        for (int i = 0; i < level-1; i++) {

            JouerCase(Tab[0][i], Tab[1][i]);

        }

    }

}
