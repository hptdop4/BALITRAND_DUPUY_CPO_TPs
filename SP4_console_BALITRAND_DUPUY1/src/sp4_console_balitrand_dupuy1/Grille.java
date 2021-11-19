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
    
    for (int i=0; i<=5; i++){
        for (int k=0; k<=7 ; k++){
            
            if (k==7){
               System.out.print("\n") ;
            }
            
            else if (CellulesJeu[i][k].jetonCourant==null){
                
                System.out.print("N ");
            }
            
            else if (CellulesJeu[i][k].jetonCourant.Couleur=="Rouge"){
                
                System.out.print("\u001B[31m" + "O ");
            }
            else if (CellulesJeu[i][k].jetonCourant.Couleur=="Jaune"){
                
                System.out.print("\u001B[33m" + "O ");
            }
        
            
            
        }
        
    }
   
}

///S'aider de moodle

public boolean etreGagnanteDuJeton(Joueur joueur){
    
   
    //Vérifier si il y a une ligne gagnante pour le joueur
    for (int i = 0 ; i<6; i++ ){ // ligne
        for (int k=0 ; k<=3; k++){ // colonne
            if (joueur.Couleur ==   CellulesJeu[i][k].lireCouleurDuJeton() && 
                    joueur.Couleur ==   CellulesJeu[i][k+1].lireCouleurDuJeton() &&
                        joueur.Couleur ==   CellulesJeu[i][k+2].lireCouleurDuJeton() &&
                            joueur.Couleur ==   CellulesJeu[i][k+3].lireCouleurDuJeton()){
                
                return true;}
          
        }
       }
        //Vérifier si il y a une colonne gagnante pour le joueur
    for (int k=0 ; k<=6; k++ ){ // colonne
        for (int i=0 ; i<=2; i++){ // ligne
            if (joueur.Couleur ==   CellulesJeu[i][k].lireCouleurDuJeton() && 
                    joueur.Couleur ==   CellulesJeu[i+1][k].lireCouleurDuJeton() &&
                        joueur.Couleur ==   CellulesJeu[i+2][k].lireCouleurDuJeton() &&
                            joueur.Couleur ==   CellulesJeu[i+3][k].lireCouleurDuJeton()){
                
                return true;}
          
        }
       }
    
        //Vérifier si il y a une diagonale descendante gagnante pour le joueur
        
        for (int k=0 ; k<=3; k++ ){ // colonne
        for (int i=0 ; i<=2; i++){ // ligne
            if (joueur.Couleur ==   CellulesJeu[i][k].lireCouleurDuJeton() && 
                    joueur.Couleur ==   CellulesJeu[i+1][k+1].lireCouleurDuJeton() &&
                        joueur.Couleur ==   CellulesJeu[i+2][k+2].lireCouleurDuJeton() &&
                            joueur.Couleur ==   CellulesJeu[i+3][k+3].lireCouleurDuJeton()){
                
                return true;}
          
        }
       }
        
        //Vérifier si il y a une diagonale montante gagnante pour le joueur
        
        for (int k=0 ; k<=3; k++ ){ // colonne
        for (int i=3 ; i<=5; i++){ // ligne
            if (joueur.Couleur ==   CellulesJeu[i][k].lireCouleurDuJeton() && 
                    joueur.Couleur ==   CellulesJeu[i-1][k+1].lireCouleurDuJeton() &&
                        joueur.Couleur ==   CellulesJeu[i-2][k+2].lireCouleurDuJeton() &&
                            joueur.Couleur ==   CellulesJeu[i-3][k+3].lireCouleurDuJeton()){
                
                return true;}
          
        }
       }
    
        return false;
      }
     
 
   
public boolean colonneRemplie(int colonne){
    
    if(CellulesJeu[0][colonne].jetonCourant!=null){ 
          return true;
   }
    else{
        return false;
    }
 }
}