/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_balitrand;

import java.util.Scanner;

/**
 *
 * @author Flavie BALITRAND
 */
public class TP1_manipNombresInt_BALITRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nb1=0;
        int nb2=0;
        
        
      Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un premier nombre:");
        nb1=sc.nextInt();  
        
        System.out.println("Saisissez un second nombre:");
        nb2=sc.nextInt();
        
        System.out.println(nb1+" ; "+nb2);
        
        System.out.println(nb1+" + "+nb2+" = "+(nb1+nb2));
        System.out.println(nb1+" - "+nb2+" = "+(nb1-nb2));
        System.out.println(nb1+" * "+nb2+" = "+(nb1*nb2));
        
        
        System.out.println(nb1+" / "+nb2+" = "+(nb1/nb2));
        
        System.out.println(nb1+" % "+nb2+" = "+(nb1%nb2));        
     
        
        
        
    }
    
}
