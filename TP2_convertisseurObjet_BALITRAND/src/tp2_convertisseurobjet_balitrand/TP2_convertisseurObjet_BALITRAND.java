/*
 * *Flavie Balitrand
* TDC
* TP1
* 23/10/21
 */
package tp2_convertisseurobjet_balitrand;

import java.util.Scanner;

/**
 *
 * @author Flavie BALITRAND
 */
public class TP2_convertisseurObjet_BALITRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      double variable=0;  
      double variable2=0;
      int choix=0;  
        
      Scanner sc = new Scanner(System.in);  
        
        
       Convertisseur premier = new Convertisseur(); 
        
        
        
      System.out.println("Bonjour,saisissez une valeur réelle:");
        variable=sc.nextDouble();   
        
    
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n" + "1) De Celcius vers Kelvin \n" + "2) De Kelvin vers Celcius \n" + "3) De Farenheit vers Celcius \n" + "4) De Celcius vers Farenheit \n" + "5) De Kelvin vers Farenheit \n" +"6) De Farenheit vers Kelvin \n");
        choix=sc.nextInt();
        
        if (choix==1){
        variable2=premier.CelciusVersKelvin(variable);
        System.out.println(variable+" degres Celcius est egal à "+ variable2+" degres Kelvin." );
        
    }
        else if (choix==2){
        variable2=premier.KelvinVersCelcius(variable);
        System.out.println(variable+" degres Kelvin est egal à "+ variable2+" degres Celcius." );
        
    }
       
        else if (choix==3){
        variable2=premier.FarenheitVersCelcius(variable);
        System.out.println(variable+" degres Kelvin est egal à "+ variable2+" degres Celcius." );
        
    }
        
        else if (choix==4){
        variable2=premier.CelciusVersFarenheit(variable);
        System.out.println(variable+" degres Celcius est egal à "+ variable2+" degres Farenheit." );
        
    }
        
        else if (choix==5){
        variable2=premier.KelvinVersFarenheit(variable);
        System.out.println(variable+" degres Kelvin est egal à "+ variable2+" degres Farenheit." );
        
    }
        
        else if (choix==6){
        variable2=premier.FarenheitVersKelvin(variable);
        System.out.println(variable+" degres Farenheit est egal à "+ variable2+" degres Kelvin." );
        
    }         
               
               
        System.out.println(premier);      
               
        
        
    }
    
}
