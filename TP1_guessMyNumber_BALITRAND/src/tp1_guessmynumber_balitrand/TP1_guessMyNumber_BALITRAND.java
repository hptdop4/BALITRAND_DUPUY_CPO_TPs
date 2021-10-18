/*
 * Flavie Balitrand
* TDC
* TP1
* 17/10/21
 */
package tp1_guessmynumber_balitrand;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Flavie BALITRAND
 */
public class TP1_guessMyNumber_BALITRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //test sur 5 nombres aléatoires
        
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        
        
        
       for(int i =1 ; i<=5; i++)
       {
        
        int n = generateurAleat.nextInt(100);
        System.out.println(n);
       
    }
       
     //test comparation entre nbre choisi et nbre aleatoire
     
    int nbr_al = generateurAleat.nextInt(100);
    int nbr_joueur =0;  
    int k=1;
    int niveau=0;
    
    System.out.println("Bonjour, choisissez le niveau: \n 1) Facile \n 2) Moyen \n 3) Difficile \n 4) Cauchemar");
    niveau=sc.nextInt();
    
    
    
    System.out.println("Saisissez une valeur entière entre 0 et 100 :");
    nbr_joueur=sc.nextInt();  
       
    if (niveau==1){
        // niveau facile pas de modifications
        
        while(nbr_joueur != nbr_al){
        
        if (nbr_joueur < nbr_al){
            
           System.out.println("Trop petit"); 
        }
        
        else if (nbr_joueur > nbr_al){
            
           System.out.println("Trop grand"); 
        }
        
        System.out.println("Réessayez :");
        nbr_joueur=sc.nextInt();
        k++;
        
    }
    
    System.out.println("Gagné ! \n" + k + " tentatives");
    
    }
        
        
        
    
    
    
    
    else if (niveau==2){
            
            
     //niveau moyen limite de 5 tentatives
     
     int lim=1;
    
    while(nbr_joueur != nbr_al && lim<= 5){
        
        if (nbr_joueur < nbr_al){
            
           System.out.println("Trop petit"); 
        }
        
        else if (nbr_joueur > nbr_al){
            
           System.out.println("Trop grand"); 
        }
        
        lim++;
        
      
        System.out.println("(Plus que " + (5- lim) +" tentatives. \n"+" Réessayez :");
        nbr_joueur=sc.nextInt();
        k++;
        
    }
    if (lim==6){
        System.out.println("Perdu ! La réponse était : " + nbr_al);
    }
        
    System.out.println("Gagné ! /n" + k + " tentatives");
    
    }
    
    
    
    
    
    
    

