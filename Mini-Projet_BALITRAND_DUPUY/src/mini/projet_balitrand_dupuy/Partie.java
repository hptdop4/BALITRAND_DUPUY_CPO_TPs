
import java.util.Random;

/*
 * Mini Projet Lights out
 * Dupuy et Balitrand
 */

/**
 *
 * @author Flavie BALITRAND
 */
public class Partie {
    Joueur J1;
    Grille grille;

    
    public Partie(Joueur joueur1) {

        J1 = joueur1;
}
    
    public void initialiserPartie() {

        grille = new Grille();
        
        
        // allumage aleatoire d'une case 
        Random rand = new Random();
        int lignAl = rand.nextInt(5);

        int colAl = rand.nextInt(5);
    
        grille.ChangerEtat(lignAl, colAl);
        
    }
    
    //methode principale qui gere toute la partie et se termine quend on detecte que toute la grille est eteinte
    public void TourPartie(){
        
        initialiserPartie();
        
        grille.Affichage();
        
        while(grille.TerminerJeu()==false){
            
            System.out.println(J1.Nom + " : Choisissez les coordonnées de votre prochaine action.");
            //System.out.println(""
            
            
            
            
            grille.Affichage();
        }
        
    
    }
}

