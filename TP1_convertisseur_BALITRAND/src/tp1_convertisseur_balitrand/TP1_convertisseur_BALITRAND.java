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
     double varcelcius=0;
     double varkelvin=0;
        
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
        
        tFarenheit=((tKelvin-273.15)*(9/5))+32;
        return tFarenheit;
}  
  public static double FarenheitVersKelvin (double tFarenheit) { 
  
        double tKelvin=0;
        
        tKelvin=((tFarenheit -32) *(5/9))+273.15;
        return tKelvin;
}    
}

