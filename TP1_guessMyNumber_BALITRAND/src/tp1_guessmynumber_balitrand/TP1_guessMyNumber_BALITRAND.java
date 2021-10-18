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
       for(int i =1 ; i<=5; i++)
       {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        
         Scanner sc = new Scanner(System.in);
        System.out.println(n);
       
    }
       
     //test comparation entre nbre choisi et nbre aleatoire
     
     int nbr_al = generateurAleat.nextInt(100);
       
       
       
    }
}
