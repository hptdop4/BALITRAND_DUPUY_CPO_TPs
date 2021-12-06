/*
 *Mini Projet Lights out
 * Dupuy et Balitrand
 */
package mini.projet_balitrand_dupuy;

import Joueur;
import java.util.Scanner;

/**
 *
 * @author Flavie BALITRAND
 */
public class MiniProjet_BALITRAND_DUPUY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenue dans l'aventure");
        System.out.println("Quel est votre nom ?");
        
        Scanner sc = new Scanner(System.in);
        
        String nom = sc.nextLine();
        
        
        Joueur J1= new Joueur(nom);
        Partie partieJeu = new Partie(J1);
        
        
        
    }
    
}
