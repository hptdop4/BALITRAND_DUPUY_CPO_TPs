/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_balitrand_dupuy1;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ROXANA
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee ;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass ().getResource("/images/celluleVide.png"));  
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass ().getResource("/images/trouNoir.png"));  
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass ().getResource("/images/jetonRouge.png"));  
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass ().getResource("/images/jetonJaune.png"));  
    
    public CelluleGraphique (Cellule uneCellule){
    celluleAssociee = uneCellule;
  } 

    // cette partie permet de dessiner la cellule graphique
@Override
public void paintComponent (Graphics G){
    super.paintComponent(G);
    
    if(celluleAssociee.presenceTrouNoir()==true){
        
        setIcon (img_trouNoir);
    }
    else{
        
       String couleur_jeton = celluleAssociee.lireCouleurDuJeton();
       
       switch(couleur_jeton){
          
           case "Vide" -> setIcon (img_vide);
           case "Rouge" -> setIcon (img_jetonRouge);
           case "Jaune" -> setIcon (img_jetonJaune);
                    
          
       }
             
        
    }
    
    setIcon (img_vide); // on attribue l'image celluleVide.png
}

        
}
