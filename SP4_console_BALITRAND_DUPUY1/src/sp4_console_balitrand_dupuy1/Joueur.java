/*
 *Balitrand Flavie et Roxana Dupuy
 */
package sp4_console_balitrand_dupuy1;

/**
 *
 * @author Flavie BALITRAND
 */
public class Joueur {

    String Nom;
    String Couleur;
    Jeton[] ListeJetons = new Jeton[21];
    int nombreJetonsRestants;
    //int nombreDesintegrateurs;

    //methode pour definir rapidement un nouvel objet de classe  Joueur
    public Joueur(String unNom) {

        Nom = unNom;
        nombreJetonsRestants = 0;
        //nombreDesintegrateurs=0;
    }

    public void affecterCouleur(String UneCouleur) {

        Couleur = UneCouleur;
    }

    public boolean ajouterJeton(Jeton j) {

        if (nombreJetonsRestants == 21) {

            return false;
        } else {
            ListeJetons[nombreJetonsRestants] = j;
            nombreJetonsRestants++;
            return true;
        }
    }
}
