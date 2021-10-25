/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_balitrand_dupuy1;

/**
 *
 * @author Flavie BALITRAND
 */
public class Joueur {
    
    String Nom;
    String Couleur;
    Jeton [] ListeJetons = new Jeton[21];
    int nombreJetonsRestants;
    
    //methode pour definir rapidement un nouvel objet de classe  Joueur
    
   public Joueur(String unNom) { 
    
       Nom=unNom;
   }
    
    public void affecterCouleur(String UneCouleur){
        
        Couleur=UneCouleur;
    }
    
}
