package trucobot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dudut
 */
public class TrucoUI extends javax.swing.JFrame {

    /**
     * Creates new form TrucoUI
     */
    
    public TrucoUI() {
        initComponents();
        btNovoJogo.setVisible(false); // partida acabou, setar para visivel
        btIniciarPartida.setVisible(true);
        txtCarta1P1.setVisible(false);
        txtCarta1P2.setVisible(false);
        txtCarta2P1.setVisible(false);
        txtCarta2P2.setVisible(false);
        txtCarta3P1.setVisible(false);
        txtCarta3P2.setVisible(false);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btFlorP1 = new javax.swing.JButton();
        btEnvidoP1 = new javax.swing.JButton();
        cbCartasP1 = new javax.swing.JComboBox();
        btJogarP1 = new javax.swing.JButton();
        btFugirP1 = new javax.swing.JButton();
        btTrucoP1 = new javax.swing.JButton();
        btJogarP2 = new javax.swing.JButton();
        btFugirP2 = new javax.swing.JButton();
        btTrucoP2 = new javax.swing.JButton();
        btFlorP2 = new javax.swing.JButton();
        btEnvidoP2 = new javax.swing.JButton();
        cbCartasP2 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        Carta1P1 = new javax.swing.JLabel();
        Carta2P1 = new javax.swing.JLabel();
        Carta3P1 = new javax.swing.JLabel();
        Carta1P2 = new javax.swing.JLabel();
        Carta2P2 = new javax.swing.JLabel();
        Carta3P2 = new javax.swing.JLabel();
        btIniciarPartida = new javax.swing.JButton();
        btNovoJogo = new javax.swing.JButton();
        txtCarta1P1 = new javax.swing.JTextField();
        txtCarta2P1 = new javax.swing.JTextField();
        txtCarta3P1 = new javax.swing.JTextField();
        txtCarta2P2 = new javax.swing.JTextField();
        txtCarta1P2 = new javax.swing.JTextField();
        txtCarta3P2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btFlorP1.setText("Flor");
        btFlorP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFlorP1ActionPerformed(evt);
            }
        });

        btEnvidoP1.setText("Envido");
        btEnvidoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnvidoP1ActionPerformed(evt);
            }
        });

        cbCartasP1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCartasP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCartasP1ActionPerformed(evt);
            }
        });

        btJogarP1.setText("Jogar");
        btJogarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogarP1ActionPerformed(evt);
            }
        });

        btFugirP1.setText("Fugir");
        btFugirP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFugirP1ActionPerformed(evt);
            }
        });

        btTrucoP1.setText("Truco");
        btTrucoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrucoP1ActionPerformed(evt);
            }
        });

        btJogarP2.setText("Jogar");
        btJogarP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogarP2ActionPerformed(evt);
            }
        });

        btFugirP2.setText("Fugir");
        btFugirP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFugirP2ActionPerformed(evt);
            }
        });

        btTrucoP2.setText("Truco");
        btTrucoP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrucoP2ActionPerformed(evt);
            }
        });

        btFlorP2.setText("Flor");
        btFlorP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFlorP2ActionPerformed(evt);
            }
        });

        btEnvidoP2.setText("Envido");
        btEnvidoP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnvidoP2ActionPerformed(evt);
            }
        });

        cbCartasP2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCartasP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCartasP2ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setOpaque(true);

        Carta1P1.setText("Carta1");

        Carta2P1.setText("Carta2");

        Carta3P1.setText("Carta3");

        Carta1P2.setText("Carta1");

        Carta2P2.setText("Carta2");

        Carta3P2.setText("Carta3");

        btIniciarPartida.setText("Inciar Partida");
        btIniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarPartidaActionPerformed(evt);
            }
        });

        btNovoJogo.setText("Novo Jogo");
        btNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoJogoActionPerformed(evt);
            }
        });

        txtCarta1P1.setText("jTextField1");

        txtCarta2P1.setText("jTextField1");

        txtCarta3P1.setText("jTextField1");

        txtCarta2P2.setText("jTextField1");

        txtCarta1P2.setText("jTextField1");

        txtCarta3P2.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(Carta2P1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCarta2P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btFlorP1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCarta1P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Carta1P1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarta3P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carta3P1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btIniciarPartida)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btEnvidoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btTrucoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cbCartasP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btFugirP1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btJogarP1)))))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btFlorP2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEnvidoP2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btNovoJogo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTrucoP2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbCartasP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btFugirP2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btJogarP2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarta2P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carta2P2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Carta1P2)
                            .addComponent(txtCarta1P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Carta3P2)
                            .addComponent(txtCarta3P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 137, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btEnvidoP1, btEnvidoP2, btFlorP1, btFlorP2, btFugirP1, btFugirP2, btJogarP1, btJogarP2, btTrucoP1, btTrucoP2, cbCartasP1, cbCartasP2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btIniciarPartida)
                                .addGap(1, 1, 1)
                                .addComponent(Carta2P1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCarta2P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Carta1P1)
                                    .addComponent(Carta3P1)))
                            .addComponent(btNovoJogo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Carta2P2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCarta2P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Carta1P2)
                            .addComponent(Carta3P2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCarta1P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarta3P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarta1P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarta3P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btFlorP2)
                            .addComponent(btEnvidoP2)
                            .addComponent(btFugirP2)
                            .addComponent(btTrucoP2)
                            .addComponent(cbCartasP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btJogarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCartasP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFugirP1)
                            .addComponent(btTrucoP1)
                            .addComponent(btEnvidoP1)
                            .addComponent(btFlorP1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btJogarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btEnvidoP1, btEnvidoP2, btFlorP1, btFlorP2, btFugirP1, btFugirP2, btJogarP1, btJogarP2, btTrucoP1, btTrucoP2, cbCartasP1, cbCartasP2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFlorP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFlorP1ActionPerformed
        // TODO add your handling code here:
        int chamarFlor = 1;
        ClasseTeste chamouFlor = new ClasseTeste(); // cria variavel com valor de -1
        chamouFlor.setFlor(chamarFlor); // seta com o valor que eu determinei quando aperta o botao
        chamouFlor.print(); // system.out.println
    }//GEN-LAST:event_btFlorP1ActionPerformed

    private void btEnvidoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnvidoP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEnvidoP1ActionPerformed

    private void btTrucoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrucoP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTrucoP1ActionPerformed

    private void cbCartasP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCartasP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCartasP1ActionPerformed

    private void btJogarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogarP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btJogarP1ActionPerformed

    private void btFugirP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFugirP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btFugirP1ActionPerformed

    private void btJogarP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogarP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btJogarP2ActionPerformed

    private void btFugirP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFugirP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btFugirP2ActionPerformed

    private void btTrucoP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrucoP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTrucoP2ActionPerformed

    private void btFlorP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFlorP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btFlorP2ActionPerformed

    private void btEnvidoP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnvidoP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEnvidoP2ActionPerformed

    private void cbCartasP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCartasP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCartasP2ActionPerformed

    private void btIniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarPartidaActionPerformed
        // TODO add your handling code here:
        btIniciarPartida.setVisible(false);
        Player Mario = new Player();
        Player Luigi = new Player();
        PlayingTruco JogoDeTruco = new PlayingTruco();
        JogoDeTruco.Match(Mario, Luigi);
        Hand p1 = Mario.getPlayerHand();
        Hand p2 = Luigi.getPlayerHand();
        txtCarta1P1.setText(p1.HandArray[0].Nome);
        txtCarta1P2.setText(p2.HandArray[0].Nome);
        txtCarta2P1.setText(p1.HandArray[1].Nome);
        txtCarta2P2.setText(p2.HandArray[1].Nome);
        txtCarta3P1.setText(p1.HandArray[2].Nome);
        txtCarta3P2.setText(p2.HandArray[2].Nome);
        txtCarta1P1.setVisible(true);
        txtCarta1P2.setVisible(true);
        txtCarta2P1.setVisible(true);
        txtCarta2P2.setVisible(true);
        txtCarta3P1.setVisible(true);
        txtCarta3P2.setVisible(true);
    }//GEN-LAST:event_btIniciarPartidaActionPerformed

    private void btNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoJogoActionPerformed

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
            java.util.logging.Logger.getLogger(TrucoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrucoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrucoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrucoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrucoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carta1P1;
    private javax.swing.JLabel Carta1P2;
    private javax.swing.JLabel Carta2P1;
    private javax.swing.JLabel Carta2P2;
    private javax.swing.JLabel Carta3P1;
    private javax.swing.JLabel Carta3P2;
    private javax.swing.JButton btEnvidoP1;
    private javax.swing.JButton btEnvidoP2;
    private javax.swing.JButton btFlorP1;
    private javax.swing.JButton btFlorP2;
    private javax.swing.JButton btFugirP1;
    private javax.swing.JButton btFugirP2;
    private javax.swing.JButton btIniciarPartida;
    private javax.swing.JButton btJogarP1;
    private javax.swing.JButton btJogarP2;
    private javax.swing.JButton btNovoJogo;
    private javax.swing.JButton btTrucoP1;
    private javax.swing.JButton btTrucoP2;
    private javax.swing.JComboBox cbCartasP1;
    private javax.swing.JComboBox cbCartasP2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCarta1P1;
    private javax.swing.JTextField txtCarta1P2;
    private javax.swing.JTextField txtCarta2P1;
    private javax.swing.JTextField txtCarta2P2;
    private javax.swing.JTextField txtCarta3P1;
    private javax.swing.JTextField txtCarta3P2;
    // End of variables declaration//GEN-END:variables
}