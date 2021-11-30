/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_balitrand_dupuy1;

import java.util.Random;

/**
 *
 * @author ROXANA
 */
public class fenetreDejeu extends javax.swing.JFrame {

    Joueur[] ListeJoueur = new Joueur[2];//tableau des deux joueurs de la partie

    Joueur joueurCourant;//désigne le joueur courant à tout moment de la partie
    Grille grilleJeu = new Grille();//la grille de jeu

    Joueur J1;
    Joueur J2;

    /**
     * Creates new form fenetreDejeu
     */
    public fenetreDejeu() {
        initComponents();
        panneau_infos_joueurs.setVisible(false);
        panneau_info_partie.setVisible(false);

        for (int i = 0; i <= 5; i++) { //La case 0,0 dans notre code est en haut à gauche
            for (int j = 0; j <= 6; j++) {

                CelluleGraphique cellGraph = new CelluleGraphique(grilleJeu.CellulesJeu[i][j]);
                panneau_grille.add(cellGraph);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {

                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        } else if (c.jetonCourant.Couleur == joueurCourant.Couleur) {

                            textemessage.setText("Le joueur " + joueurCourant.Nom + " veut recupérer son jeton");

                            Jeton jrecup = c.recupererJeton();
                            //joueurCourant.ajouterJeton(jrecup);
                            joueurCourant.nombreJetonsRestants++;
                            joueurSuivant();

                        } else {
                            textemessage.setText("Erreur ce n'est pas votre jeton");
                        }

                        grilleJeu.tasserGrille2();

                        panneau_grille.repaint();

                        boolean vict_j1 = grilleJeu.etreGagnanteDuJeton(ListeJoueur[0]);
                        boolean vict_j2 = grilleJeu.etreGagnanteDuJeton(ListeJoueur[1]);

                        if (vict_j1 && !vict_j2) {

                            textemessage.setText("Victoire de : " + ListeJoueur[0].Nom);

                        } else if (vict_j2 && !vict_j1) {

                            textemessage.setText("Victoire de " + ListeJoueur[1].Nom);
                        } else if (vict_j1 && vict_j2) {

                            if (joueurCourant == ListeJoueur[0]) {
                                textemessage.setText("Victoire de " + ListeJoueur[1].Nom + " Faute de jeu de " + ListeJoueur[0].Nom);
                            } else {
                                textemessage.setText("Victoire de " + ListeJoueur[0].Nom + " Faute de jeu de " + ListeJoueur[1].Nom);
                            }
                        }

                    }
                });

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_infos_joueurs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        textemessage = new javax.swing.JTextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(204, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 672, 576));

        panneau_infos_joueurs.setBackground(new java.awt.Color(51, 255, 102));
        panneau_infos_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel3.setText("Infos joueurs");
        panneau_infos_joueurs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel4.setText("Joueur 1 : ");
        panneau_infos_joueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel5.setText("Couleur : ");
        panneau_infos_joueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lbl_j1_nom.setText("nomJoueur1 ");
        panneau_infos_joueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        lbl_j1_couleur.setText("couleurJoueur1");
        panneau_infos_joueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));
        panneau_infos_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 10));

        jLabel7.setText("Joueur 2 : ");
        panneau_infos_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel8.setText("Couleur : ");
        panneau_infos_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 196, -1, -1));

        lbl_j2_nom.setText("nomJoueur2");
        panneau_infos_joueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        lbl_j2_couleur.setText("couleurJoueur2");
        panneau_infos_joueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 194, -1, 20));

        getContentPane().add(panneau_infos_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 290, 290));

        panneau_creation_partie.setBackground(new java.awt.Color(51, 255, 102));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom joueur 1 : ");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel2.setText("Nom joueur 2 : ");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        nom_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur1ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, -1));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, -1));

        btn_start.setText("Démarrer la partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 90, 160, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 290, 140));

        panneau_info_partie.setBackground(new java.awt.Color(51, 255, 102));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel10.setText("Infos jeu");
        panneau_info_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel11.setText("joueur courant : ");
        panneau_info_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 20));

        lbl_jcourant.setText("nomJoueur");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 34, -1, 30));

        textemessage.setColumns(20);
        textemessage.setRows(5);
        message.setViewportView(textemessage);

        panneau_info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 250, -1));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 290, 190));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 20, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 20, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 20, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 20, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 20, -1, -1));

        setBounds(0, 0, 1044, 702);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed

        panneau_infos_joueurs.setVisible(true);//affiche le pannel joueur
        panneau_info_partie.setVisible(true);//affiche le pannel joueur
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false); // rend invisible bouton start

    }//GEN-LAST:event_btn_startActionPerformed

    private void nom_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur1ActionPerformed

    //determination des boutons de colonne

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed

        //joueurSuivant();
        if (grilleJeu.colonneRemplie(0) == true) {
            btn_col_0.setEnabled(false);
        }
        jouerDansColonne(0);
        joueurSuivant();

    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        //joueurSuivant();

        if (grilleJeu.colonneRemplie(1) == true) {
            btn_col_1.setEnabled(false);
        }

        jouerDansColonne(1);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        //joueurSuivant();

        if (grilleJeu.colonneRemplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        jouerDansColonne(2);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        //joueurSuivant();

        if (grilleJeu.colonneRemplie(3) == true) {
            btn_col_3.setEnabled(false);
        }

        jouerDansColonne(3);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
       // joueurSuivant();
        if (grilleJeu.colonneRemplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        jouerDansColonne(4);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        //joueurSuivant();
        if (grilleJeu.colonneRemplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        jouerDansColonne(5);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        //joueurSuivant();
        if (grilleJeu.colonneRemplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        jouerDansColonne(6);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    public boolean jouerDansColonne(int indice_colonne) {

        Jeton j;//jeton qui recupere la bonne couleur a ajouter dans la grille
        j = new Jeton(joueurCourant.Couleur); // définit un jeton lui même définit par sa couleur

        joueurCourant.nombreJetonsRestants--;// A chaque jeton joué on enlève un jeton

        boolean verification;//On  ajoute j ( de la bonne couleur) dans la colonne choisie 

        verification = grilleJeu.ajouterJetonDansColonne(j, indice_colonne);

        panneau_grille.repaint();

        boolean vict_j1 = grilleJeu.etreGagnanteDuJeton(ListeJoueur[0]);
        boolean vict_j2 = grilleJeu.etreGagnanteDuJeton(ListeJoueur[1]);

        if (vict_j1 && !vict_j2) {

            textemessage.setText("Victoire de : " + ListeJoueur[0].Nom);

        } else if (vict_j2 && !vict_j1) {

            textemessage.setText("Victoire de " + ListeJoueur[1].Nom);
        } else if (vict_j1 && vict_j2) {

            if (joueurCourant == ListeJoueur[0]) {
                textemessage.setText("Victoire de " + ListeJoueur[1].Nom + " Faute de jeu de " + ListeJoueur[0].Nom);
            } else {
                textemessage.setText("Victoire de " + ListeJoueur[0].Nom + " Faute de jeu de " + ListeJoueur[1].Nom);
            }
        }

        if (verification == true) {

            return true;
        } else {
            return false;
        }

    }

    public void joueurSuivant() {

        if (joueurCourant == ListeJoueur[0]) {

            joueurCourant = ListeJoueur[1];
        } else {
            joueurCourant = ListeJoueur[0];
        }
        lbl_jcourant.setText(joueurCourant.Nom);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDejeu().setVisible(true);
            }
        });
    }

    public void initialiserPartie() {

        //grilleJeu = new Grille() ; // création grille 
        System.out.println("Début de la partie de puissance 4 !");

        //attribution nom aux joueurs
        String nom1 = nom_joueur1.getText();
        String nom2 = nom_joueur2.getText();

        Joueur joueur1 = new Joueur(nom1);//Création des deux joueurs
        Joueur joueur2 = new Joueur(nom2);

        ListeJoueur[0] = joueur1;
        ListeJoueur[1] = joueur2;

        attribuerCouleursAuxJoueurs();

        System.out.println(joueur1.Nom + " est de couleur " + joueur1.Couleur);
        System.out.println(joueur2.Nom + " est de couleur " + joueur2.Couleur);

        lbl_j1_nom.setText(nom1);
        lbl_j2_nom.setText(nom2);
        lbl_j1_couleur.setText(joueur1.Couleur);
        lbl_j2_couleur.setText(joueur2.Couleur);

// attribution des jetons aux joueurs
        for (int t = 0; t <= 20; t++) {

            Jeton jetonj1 = new Jeton(ListeJoueur[0].Couleur);
            ListeJoueur[0].ajouterJeton(jetonj1);

            Jeton jetonj2 = new Jeton(ListeJoueur[1].Couleur);
            ListeJoueur[1].ajouterJeton(jetonj2);

        }

        //On a decide le joueur qui commence (aléatoire)
        Random rand = new Random();
        boolean futurJoueur;
        futurJoueur = rand.nextBoolean();

        if (futurJoueur == true) {

            joueurCourant = joueur1;
        } else if (futurJoueur == false) {

            joueurCourant = joueur2;
        }

        
        
        lbl_jcourant.setText(joueurCourant.Nom);

        // placement des trous noirs aleatoire
        int compteur = 0;
        for (int i = 0; i < 5; i++) {
            int lignAl = rand.nextInt(6);
            int colAl = rand.nextInt(7);
            if (!grilleJeu.placerTrouNoir(lignAl, colAl)) {

                i--;
            }
        }
    }

    //Premier test de random qui ne marche pas
    /*
        int colAl;
        int lignAl;
        int compteur=0;
        
        
        while (compteur<=5){
            
        colAl=(int) ( Math.random()*( 6-0 ));
        // on va chercher un int aléatoire pour la colonne aléatoire entre 6 et 0
        lignAl=(int) (Math.random() * ( 5-0 ));
        // on va chercher un int aléatoire pour la ligne aléatoire entre 5 et 0 
        
        //grilleJeu.placerTrouNoir(lignAl, colAl);
        
        if(grilleJeu.placerTrouNoir(lignAl, colAl)==true){
            
            compteur++;
        } 
    }
    }
     */
    public void attribuerCouleursAuxJoueurs() {

        Random rand = new Random();
        boolean quellecouleur;
        quellecouleur = rand.nextBoolean();

        if (quellecouleur == true) {

            ListeJoueur[0].Couleur = "Jaune";
            ListeJoueur[1].Couleur = "Rouge";
        } else if (quellecouleur == false) {

            ListeJoueur[1].Couleur = "Jaune";
            ListeJoueur[0].Couleur = "Rouge";
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_partie;
    private javax.swing.JPanel panneau_infos_joueurs;
    private javax.swing.JTextArea textemessage;
    // End of variables declaration//GEN-END:variables
}
