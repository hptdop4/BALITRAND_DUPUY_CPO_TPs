/*
 * Balitrand Flavie et Roxana Dupuy
 */
package sp4_console_balitrand_dupuy1;

/**
 *
 * @author Flavie BALITRAND
 */
public class Grille {

    Cellule CellulesJeu[][] = new Cellule[6][7];

    public Grille() {

        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 5; j++) {
                CellulesJeu[j][i] = new Cellule();
            }
        }
    }

    public boolean ajouterJetonDansColonne(Jeton j, int colonne) {

        if (!"Vide".equals(CellulesJeu[0][colonne].lireCouleurDuJeton())) {

            return false;

        } else {
            for (int i = 1; i <= 5; i++) {

                if ("Rouge".equals(CellulesJeu[i][colonne].lireCouleurDuJeton()) || "Jaune".equals(CellulesJeu[i][colonne].lireCouleurDuJeton())) {

                    if (CellulesJeu[i - 1][colonne].trouNoir == true) {

                        CellulesJeu[i - 1][colonne].trouNoir = false;

                        return false;

                    } else {

                        CellulesJeu[i - 1][colonne].affecterJeton(j);
                        return true;
                    }

                } else if (i == 5 && "Vide".equals(CellulesJeu[i][colonne].lireCouleurDuJeton())) {

                    if (CellulesJeu[i][colonne].trouNoir == true) {

                        CellulesJeu[i][colonne].trouNoir = false;

                        return false;
                    } else {

                        CellulesJeu[i][colonne].affecterJeton(j);
                        return true;

                    }
                }
            }
            return true;
        }
    }

    public boolean etreRemplie() {
        boolean test = true;
        for (int k = 0; k <= 6; k++) {

            if ("Vide".equals(CellulesJeu[0][k].lireCouleurDuJeton())) {
                test = false;
            }
        }
        return test;
    }

    public void viderGrille() {

        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 6; k++) {

                CellulesJeu[i][k] = null;
            }
        }
    }

    public boolean celluleOccupee(int ligne, int colonne) {

        if (CellulesJeu[ligne][colonne] != null) {
            return true;
        } else {
            return false;
        }
    }

    public String lireCouleurDuJeton(int ligne, int colonne) {

        return CellulesJeu[ligne][colonne].lireCouleurDuJeton();

    }

    public void afficherGrilleSurConsole() {

        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 7; k++) {

                if (k == 7) {
                    System.out.print("\n");
                } else if (CellulesJeu[i][k].trouNoir == true) {

                    System.out.print("\u001B[35m" + "T ");
                    System.out.print("\u001B[0m");
                } else if (CellulesJeu[i][k].jetonCourant == null) {

                    System.out.print("N ");
                } else if ("Rouge".equals(CellulesJeu[i][k].jetonCourant.Couleur)) {

                    System.out.print("\u001B[31m" + "O ");
                    System.out.print("\u001B[0m");
                } else if ("Jaune".equals(CellulesJeu[i][k].jetonCourant.Couleur)) {

                    System.out.print("\u001B[33m" + "O ");
                    System.out.print("\u001B[0m");
                }

            }

        }

    }

///S'aider de moodle
    public boolean etreGagnanteDuJeton(Joueur joueur) {

        //Vérifier si il y a une ligne gagnante pour le joueur
        for (int i = 0; i < 6; i++) { // ligne
            for (int k = 0; k <= 3; k++) { // colonne
                if (joueur.Couleur == CellulesJeu[i][k].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i][k + 1].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i][k + 2].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i][k + 3].lireCouleurDuJeton()) {

                    return true;
                }

            }
        }
        //Vérifier si il y a une colonne gagnante pour le joueur
        for (int k = 0; k <= 6; k++) { // colonne
            for (int i = 0; i <= 2; i++) { // ligne
                if (joueur.Couleur == CellulesJeu[i][k].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i + 1][k].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i + 2][k].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i + 3][k].lireCouleurDuJeton()) {

                    return true;
                }

            }
        }

        //Vérifier si il y a une diagonale descendante gagnante pour le joueur
        for (int k = 0; k <= 3; k++) { // colonne
            for (int i = 0; i <= 2; i++) { // ligne
                if (joueur.Couleur == CellulesJeu[i][k].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i + 1][k + 1].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i + 2][k + 2].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i + 3][k + 3].lireCouleurDuJeton()) {

                    return true;
                }

            }
        }

        //Vérifier si il y a une diagonale montante gagnante pour le joueur
        for (int k = 0; k <= 3; k++) { // colonne
            for (int i = 3; i <= 5; i++) { // ligne
                if (joueur.Couleur == CellulesJeu[i][k].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i - 1][k + 1].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i - 2][k + 2].lireCouleurDuJeton()
                        && joueur.Couleur == CellulesJeu[i - 3][k + 3].lireCouleurDuJeton()) {

                    return true;
                }

            }
        }

        return false;
    }

    //VERSION 3 lorsqu’un jeton est capturé ou détruit, tasse la grille en 
//décalant de une ligne les jetons situés au dessus de la cellule libérée
    public void tasserGrille(int ligne, int colonne) {

        if (ligne != 0) {

            for (int i = ligne; i > 0; i--) {

                if (CellulesJeu[i - 1][colonne].jetonCourant != null) {

                    CellulesJeu[i][colonne].jetonCourant = CellulesJeu[i - 1][colonne].jetonCourant;
                } else if (CellulesJeu[i - 1][colonne].jetonCourant == null) {

                    CellulesJeu[i][colonne].jetonCourant = null;
                }

            }

            CellulesJeu[0][colonne].jetonCourant = null;

        }
    }

    public void tasserGrille2() {
        for (int k = 0; k <= 6; k++) {

            for (int i = 5; i >= 0; i--) {

                if (i == 0) {
                    CellulesJeu[i][k].jetonCourant = null;

                } else if (CellulesJeu[i][k].jetonCourant == null) {

                    CellulesJeu[i][k].jetonCourant = CellulesJeu[i - 1][k].jetonCourant;
                    CellulesJeu[i - 1][k].jetonCourant = null;
                }
            }

        }
    }

    public void recupererJeton(int ligne, int colonne) {

        CellulesJeu[ligne][colonne].recupererJeton();

    }

    public boolean colonneRemplie(int colonne) {

        if (!"Vide".equals(CellulesJeu[0][colonne].lireCouleurDuJeton())) {
            return true;
        } else {
            return false;
        }
    }

// ajoute un trou noir à l’endroit indiqué et retourne vrai si l’ajout ok
    public boolean placerTrouNoir(int ligne, int colonne) { // VERSION 2 

        if (CellulesJeu[ligne][colonne].presenceTrouNoir() == false) {

            CellulesJeu[ligne][colonne].placerTrouNoir();
            return true;
        } else {
            return false;
        }

    }

}
