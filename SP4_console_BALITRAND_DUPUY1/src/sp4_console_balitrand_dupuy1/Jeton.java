/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_balitrand_dupuy1;

/**
 *
 * @author Flavie BALITRAND
 */
public class Jeton {
    
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    
    String Couleur;
    
    public Jeton(String uneCouleur) { 
    
       Couleur=uneCouleur;
   }
    
    public String lireCouleur(){
        
        return Couleur;
    }
    
    @Override 
    public String toString() { 
        
        if ("Rouge".equals(Couleur)){
            
            return "\u001B[31m";
        }
        else{
            return "\u001B[33m";
        }
        
    }
}


