package mini.projet_balitrand_dupuy;

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

    public void Affichage() {

        for (int i = -1; i < 5; i++) {
            for (int j = -1; j < 6; j++) {
                if (j == 5) {
                    System.out.print("\n");
                }
                else if (i==-1 && j==-1){
                    System.out.print("   ");
                }
                
                else if (i==-1){
                    System.out.print(j+" ");
                }
                else if (j==-1){
                    System.out.print(i+"  ");
                }
                
                else if ("allume".equals(LireEtat(i, j))) {
                    System.out.print("\u001B[33m" + "O ");
                    System.out.print("\u001B[0m");

                } else if ("eteint".equals(LireEtat(i, j))) {
                    System.out.print("\u001B[30m" + "O ");

                }
            }

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
}
