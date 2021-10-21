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
        
        Random generateurAleat1 = new Random();
        Scanner sc = new Scanner(System.in);
        
        
        
       for(int i =1 ; i<=5; i++)
       {
        
        int n = generateurAleat1.nextInt(100);
        System.out.println(n);
       
    }
       
     //test comparation entre nbre choisi et nbre aleatoire
     Random generateurAleat= new Random();
 
    int nbr_joueur =0;  
    int k=1;
    int niveau=0;
    
    System.out.println("Bonjour, choisissez le niveau: \n 1) Facile \n 2) Moyen \n 3) Difficile \n ");
    niveau=sc.nextInt();
    
    
    
       
    if (niveau==1){
        // niveau facile pas de modifications
        
        int nbr_al = generateurAleat.nextInt(100);
             
        System.out.println("Saisissez une valeur entière entre 0 et 100 :");
        nbr_joueur=sc.nextInt(); 
        
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
            
            
     //niveau moyen choix sur 200 nombres
     
     int nbr_al = generateurAleat.nextInt(200);
             
        System.out.println("Saisissez une valeur entière entre 0 et 200 :");
        nbr_joueur=sc.nextInt(); 
        
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
    
    
    
    else if (niveau==3){
        
     //niveau difficile limite de 5 tentatives et choix parmis 200
     
     int lim=1;
     int nbr_al=0;
     
             
        System.out.println("Saisissez une valeur entière entre 0 et 200 :");
        nbr_joueur=sc.nextInt();
    
    while(nbr_joueur != nbr_al & lim< 5){
        
        if (nbr_joueur < nbr_al){
            
           System.out.println("Trop petit"); 
        }
        
        else if (nbr_joueur > nbr_al){
            
           System.out.println("Trop grand"); 
        }
        
        lim++;
        
      
        System.out.println("(Plus que " + (5- lim) +" tentatives restantes. \n"+" Réessayez :");
        nbr_joueur=sc.nextInt();
        k++;
        
    }
    if (lim==5){
        System.out.println("Perdu ! La réponse était : " + nbr_al);
    }
      else{  
    System.out.println("Gagné ! \n" + k + " tentatives");
    }
        
        
        
        
    }
    
    
    
    }
    
}

