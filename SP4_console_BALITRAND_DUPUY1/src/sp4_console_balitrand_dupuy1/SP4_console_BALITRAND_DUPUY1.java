/*
 * Tp Super puissance 4 version console
 * Balitrand Flavie et Roxana Dupuy
 */
package sp4_console_balitrand_dupuy1;

import java.util.Scanner;

/**
 *
 * @author Flavie BALITRAND
 */
public class SP4_console_BALITRAND_DUPUY1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Début de la partie de puissance 4 !");

        //attribution nom aux joueurs
        String nom1;
        String nom2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Joueur 1 quel est votre pseudo ? ");
        nom1 = sc.nextLine();
        System.out.println("Joueur 2 quel est votre pseudo ? ");
        nom2 = sc.nextLine();

        Joueur joueur1 = new Joueur(nom1);//Création des deux joueurs
        Joueur joueur2 = new Joueur(nom2);

        Partie nouvellePartie = new Partie(joueur1, joueur2); // Création d'une partie

        nouvellePartie.ListeJoueur[0] = joueur1;
        nouvellePartie.ListeJoueur[1] = joueur2;

        nouvellePartie.debuterPartie();

    }

}
