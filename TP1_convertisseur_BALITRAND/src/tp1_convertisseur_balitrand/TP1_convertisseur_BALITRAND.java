/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_balitrand;

import java.util.Scanner;

/**
 *
 * @author Flavie BALITRAND
 */
public class TP1_convertisseur_BALITRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     double variable=0;  
     double variable2=0;
     double varcelcius=0;
     double varkelvin=0;
     int choix=0;
        
     //Premiers tests pour comprendre comment fonctionnent les methodes 
     
     Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une valeur réelle:");
        variable=sc.nextDouble();   
        System.out.println(variable+" degres Celcius");
        
        variable=273.15+variable;
        
        System.out.println(variable+" degres Kelvin");
   
        System.out.println("Saisissez une valeur réelle en celcius:");
        varcelcius=sc.nextDouble();
        
        varkelvin=CelciusVersKelvin(varcelcius);
        System.out.println(varkelvin+" degres Kelvin");
        
        System.out.println("Saisissez une valeur réelle en kelvin:");
        varkelvin=sc.nextDouble();
        
        varcelcius=KelvinVersCelcius(varkelvin);
        System.out.println(varcelcius+" degres Celcius");
        
        
        // Version finale  du programme de convertion:
        
        System.out.println("Bonjour,saisissez une valeur réelle:");
        variable=sc.nextDouble();   
        
    
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n" + "1) De Celcius vers Kelvin \n" + "2) De Kelvin vers Celcius \n" + "3) De Farenheit vers Celcius \n" + "4) De Celcius vers Farenheit \n" + "5) De Kelvin vers Farenheit \n" +"6) De Farenheit vers Kelvin \n");
        choix=sc.nextInt();
        
        if (choix==1){
        variable2=CelciusVersKelvin(variable);
        System.out.println(variable+" degres Celcius est egal à "+ variable2+" degres Kelvin." );
        
    }
        else if (choix==2){
        variable2=KelvinVersCelcius(variable);
        System.out.println(variable+" degres Kelvin est egal à "+ variable2+" degres Celcius." );
        
    }
       
        else if (choix==3){
        variable2=FarenheitVersCelcius(variable);
        System.out.println(variable+" degres Kelvin est egal à "+ variable2+" degres Celcius." );
        
    }
        
        else if (choix==4){
        variable2=CelciusVersFarenheit(variable);
        System.out.println(variable+" degres Celcius est egal à "+ variable2+" degres Farenheit." );
        
    }
        
        else if (choix==5){
        variable2=KelvinVersFarenheit(variable);
        System.out.println(variable+" degres Kelvin est egal à "+ variable2+" degres Farenheit." );
        
    }
        
        else if (choix==6){
        variable2=FarenheitVersKelvin(variable);
        System.out.println(variable+" degres Farenheit est egal à "+ variable2+" degres Kelvin." );
        
    }
        
    }
    
    public static double CelciusVersKelvin (double tCelcius) { 
  
        double tKelvin=0;
        
        tKelvin=tCelcius+273.15;
        return tKelvin;
}
    public static double KelvinVersCelcius (double tKelvin) { 
  
        double tCelcius=0;
        
        tCelcius=tKelvin-273.15;
        return tCelcius;
   
}
    
    public static double FarenheitVersCelcius(double tFarenheit) { 
  
        double tCelcius=0;
        
        tCelcius=(tFarenheit-32)*(5/9);
        return tCelcius;
   
}

    
    public static double CelciusVersFarenheit (double tCelcius) { 
  
        double tFarenheit=0;
        
        tFarenheit=(tCelcius*(9/5))+32;
        return tFarenheit;
}
    
  public static double KelvinVersFarenheit (double tKelvin) { 
  
        double tFarenheit=0;
        double tCelcius=0;
        
        //Pour cette operation on peut se permettre d appeler tour a tour des fonctions deja creees
        
        tCelcius=KelvinVersCelcius(tKelvin);
        tFarenheit=CelciusVersFarenheit(tCelcius);
        
        return tFarenheit;
}  
  public static double FarenheitVersKelvin (double tFarenheit) { 
  
        double tKelvin=0;
        double tCelcius=0;
        
        tCelcius=FarenheitVersCelcius(tFarenheit);
        tKelvin=CelciusVersKelvin(tCelcius);
        
        return tKelvin;
}    
}

