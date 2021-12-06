/*
 * Mini Projet Lights out
 * Dupuy et Balitrand
 */

/**
 *
 * @author Flavie BALITRAND
 */
public class Grille {
    
    Cellule CelluleActuelle[][] = new Cellule[5][5];

    public Grille() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                CelluleActuelle[j][i] = new Cellule();
            }
        }
    }
    
    
    public String LireEtat(int ligne , int colonne){
        
       String Light = CelluleActuelle[ligne][colonne].Etat;
       return Light;
    }
    
    public void ChangerEtat(int ligne , int colonne){
        
       String Light = LireEtat(ligne,colonne);
       
       if ("eteind".equals(Light)){
           CelluleActuelle[ligne][colonne].Etat = "allume";
       }
       else if ("allume".equals(Light)){
           CelluleActuelle[ligne][colonne].Etat = "eteind";
       }
    }
    
    public void Affichage(){
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if 
            }
        }
        
    }
}
