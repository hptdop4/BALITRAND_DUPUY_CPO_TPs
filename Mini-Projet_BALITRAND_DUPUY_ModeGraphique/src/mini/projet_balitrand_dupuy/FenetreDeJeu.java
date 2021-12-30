/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mini.projet_balitrand_dupuy;

/**
 *
 * @author ROXANA
 */
public class FenetreDeJeu extends javax.swing.JFrame {

    Joueur J1;
    Grille grille = new Grille();
    int level;
    int[][] TabReponse = new int[2][5];

    /**
     * Creates new form FenetreDeJeu
     */
    public FenetreDeJeu() {
        initComponents();
        panneau_creation_partie.setVisible(false);
        panneau_infos_jeu.setVisible(false);
        panneau_infos_joueur.setVisible(false);
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5; j++) {
                CelluleGraphique CellGraph = new CelluleGraphique(grille.CelluleActuelle[i][j]);
                panneau_grille.add(CellGraph);
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
        panneau_contexte = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_start1 = new javax.swing.JButton();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nom_joueur = new javax.swing.JTextField();
        btn_start2 = new javax.swing.JButton();
        panneau_infos_joueur = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_nbclics = new javax.swing.JLabel();
        panneau_infos_jeu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(212, 191, 160));
        panneau_grille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 500, 500));

        panneau_contexte.setBackground(new java.awt.Color(141, 185, 132));
        panneau_contexte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Vous vous êtes retrouvés prisonnier de la Forêt Interdite, pour vous libérer vous devez capturer toutes les lucioles. ");
        panneau_contexte.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 20));

        jLabel3.setText("Sinon vous serez perdu à jamais. Que la chance soit avec vous ! ");
        panneau_contexte.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 560, -1));

        btn_start1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_start1.setText("GO !!!");
        btn_start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_start1ActionPerformed(evt);
            }
        });
        panneau_contexte.add(btn_start1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        getContentPane().add(panneau_contexte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 100));

        panneau_creation_partie.setBackground(new java.awt.Color(129, 181, 136));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur : ");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        panneau_creation_partie.add(nom_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 150, -1));

        btn_start2.setText("Lancer l'aventure !");
        btn_start2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_start2ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 330, 120));

        panneau_infos_joueur.setBackground(new java.awt.Color(129, 181, 136));
        panneau_infos_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Infos Joueurs :");
        panneau_infos_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setText("Nombre de clics : ");
        panneau_infos_joueur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lbl_nbclics.setText("nbclics ");
        panneau_infos_joueur.add(lbl_nbclics, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 120, -1));

        getContentPane().add(panneau_infos_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 330, 110));

        panneau_infos_jeu.setBackground(new java.awt.Color(129, 181, 136));
        panneau_infos_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Infos Jeu : ");
        panneau_infos_jeu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_infos_jeu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, -1));

        getContentPane().add(panneau_infos_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 330, 160));

        setBounds(0, 0, 1044, 678);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_start1ActionPerformed
        panneau_creation_partie.setVisible(true);
    }//GEN-LAST:event_btn_start1ActionPerformed

    private void btn_start2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_start2ActionPerformed
        panneau_infos_jeu.setVisible(true);
        panneau_infos_joueur.setVisible(true);
    }//GEN-LAST:event_btn_start2ActionPerformed

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
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_start1;
    private javax.swing.JButton btn_start2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_nbclics;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nom_joueur;
    private javax.swing.JPanel panneau_contexte;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_infos_jeu;
    private javax.swing.JPanel panneau_infos_joueur;
    // End of variables declaration//GEN-END:variables
}
