/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_balitrand_dupuy1;

/**
 *
 * @author Flavie BALITRAND
 */
public class Grille {
    
    
    Cellule CellulesJeu[][] = new Cellule [6][7];
    
    public Grille(){
        
        for (int i=0;i<7;i++){
            for (int j=0; j<6 ; j++){
                CellulesJeu[j][i]=new Cellule();
            }
        } 
    }
    
    
    public boolean  ajouterJetonDansColonne(Jeton j, int colonne){
        
      if(CellulesJeu[0][colonne]!=null){ 
          return false;
          
      }
      else{
          for (int i=1; i<=5;i++){
              if (CellulesJeu[i][colonne]!=null){
              
                  CellulesJeu[i-1][colonne].affecterJeton(j);
              }
        
          }
              return true;
          
      }
    }
    
    public boolean etreRemplie(){
        boolean test=true;
        for (int k=0; k<=6;k++){
            
              if (CellulesJeu[0][k]==null){
                   test=false;
              }
    }
        return test;       
}
    
    
    public void viderGrille(){
        
        for (int i=0; i<=5;i++){
          for (int k=0; k<=6;k++){
              
            CellulesJeu[i][k]=null;  
        }  
        }
    }


public boolean celluleOccupee(int ligne , int colonne){
    
    if (CellulesJeu[ligne][colonne]!=null){
        return true;
    }
    else{
        return false;
    }
}
        

public String lireCouleurDuJeton(int ligne , int colonne){
    
   return CellulesJeu[ligne][colonne].lireCouleurDuJeton();
    
}

public void afficherGrilleSurConsole(){
    
   
}

///S'aider de moodle

public boolean etreGagnanteDuJeton(Joueur joueur){
    
    //String saCouleur=joueur.Couleur;
    //Vérifier si il y a une ligne gagnante pour le joueur
    
    if (Jeton.Couleur [i][k]= Jeton.Couleur [i][k+1]){
      if (Jeton.Couleur [x][y]= Jeton.Couleur [x][y+2]){
        if (Jeton.Couleur [x][y]= Jeton.Couleur [x][y+3]){
           return true ;
        }   
          return true; 
      }  
      return true; 
    }
    else {
        return false ;
    }
    
    //Vérifier si il y a une colonne gagnante 
    //Vérifier si il y a une diagonnale montante gagnante
    //Vérifier si il y a une diagonnale descendante gagnante
}


public boolean colonneRemplie(int colonne){
    
    if(CellulesJeu[0][colonne]!=null){ 
          return true;
   }
    else{
        return false;
    }
 }
}