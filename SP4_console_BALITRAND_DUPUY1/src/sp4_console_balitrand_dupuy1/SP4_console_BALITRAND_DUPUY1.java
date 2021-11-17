/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
        
        
        
        //attribution nom aux joueurs
        String nom1;
        String nom2;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Joueur 1 quel est votre pseudo ? ");
        nom1 = sc.nextString();
        System.out.println("Joueur 2 quel est votre pseudo ? ");
        nom2 = sc.nextString();
        
        ListeJoueur[0]=nom1;
        ListeJoueur[1]=nom2;
        
        Joueur J1 = new Joueur(nom1) ;
        Joueur J2 = new Joueur(nom2) ; 
        
        
        
        
        
        
        
    }
    
}
