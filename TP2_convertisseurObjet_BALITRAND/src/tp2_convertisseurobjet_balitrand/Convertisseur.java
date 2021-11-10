/*
 * *Flavie Balitrand
* TDC
* TP1
* 23/10/21
 */
package tp2_convertisseurobjet_balitrand;

/**
 *
 * @author Flavie BALITRAND
 */
public class Convertisseur {
    

   int nbConversions;
    
    public Convertisseur() { 
 
   int nbConversions=0; 
}
    
  
    public  double CelciusVersKelvin (double tCelcius) { 
  
        double tKelvin=0;
        
        tKelvin=tCelcius+273.15;
        nbConversions++;
        return tKelvin;
}
    public  double KelvinVersCelcius (double tKelvin) { 
  
        double tCelcius=0;
        
        tCelcius=tKelvin-273.15;
        nbConversions++;
        return tCelcius;
   
}
    
    public  double FarenheitVersCelcius(double tFarenheit) { 
  
        double tCelcius=0;
        
        tCelcius=(tFarenheit-32)*(5/9);
        nbConversions++;
        return tCelcius;
   
}

    
    public  double CelciusVersFarenheit (double tCelcius) { 
  
        double tFarenheit=0;
        
        tFarenheit=(tCelcius*(9/5))+32;
        nbConversions++;
        return tFarenheit;
}
    
  public  double KelvinVersFarenheit (double tKelvin) { 
  
        double tFarenheit=0;
        double tCelcius=0;
        
        //Pour cette operation on peut se permettre d appeler tour a tour des fonctions deja creees
        
        tCelcius=KelvinVersCelcius(tKelvin);
        tFarenheit=CelciusVersFarenheit(tCelcius);
        nbConversions++;
        return tFarenheit;
}  
  public  double FarenheitVersKelvin (double tFarenheit) { 
  
        double tKelvin=0;
        double tCelcius=0;
        
        tCelcius=FarenheitVersCelcius(tFarenheit);
        tKelvin=CelciusVersKelvin(tCelcius);
        nbConversions++;
        return tKelvin;
}    

    @Override 
public String toString () { 
  return "nb de conversions "+ nbConversions; 
}
}
