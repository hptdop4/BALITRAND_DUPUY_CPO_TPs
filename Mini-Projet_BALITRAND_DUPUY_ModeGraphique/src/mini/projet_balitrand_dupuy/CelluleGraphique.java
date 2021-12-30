/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet_balitrand_dupuy;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ROXANA
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee ;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/image_eteint(1).png"));
    ImageIcon img_pleine = new javax.swing.ImageIcon(getClass().getResource("/Images/image_allume(1).png"));
 public CelluleGraphique (Cellule uneCellule){
     celluleAssociee = uneCellule;
 }
 
 @Override
 public void paintComponent (Graphics G){
     super.paintComponent(G);
     
     if ("eteint".equals(celluleAssociee.Etat)){
         setIcon (img_vide);
     }
     else if("allume".equals(celluleAssociee.Etat)){
         setIcon (img_pleine);
     }
     
 }
}
