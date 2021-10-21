/*
 * Flavie Balitrand
* TDC
* TP1
* 18/10/21
 */
package tp1_stats_balitrand;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Flavie BALITRAND
 */
public class TP1_stats_BALITRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     int [] Tab = new int[6];
     
     Random generateurAleat1 = new Random();
     Scanner sc = new Scanner(System.in);
     int m=0;
        
      
      System.out.println("Saisissez une valeur entière :");
        m=sc.nextInt();
      
      for (int i=1; i <= m; i++) {
          //nbr aleatoire tire entre 0 et 5 puis incrementation au tableau
          int n = generateurAleat1.nextInt(5);
          Tab[n]++;
          
      }
      
      for (int k=0; k <= 5; k++) {
          //calcul du pourcentage engendre
      double pourcent=((Tab[k]*100)/m);
      
      System.out.println("Le choix " + (k+1) +" a été tiré " + (Tab[k]) +" soit "+ pourcent + " % des fois.");
      }
    }
    
    
}
