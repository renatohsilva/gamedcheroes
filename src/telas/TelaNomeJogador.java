/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import com.sun.glass.events.KeyEvent;
import gamedcheroes.Jogador;
import java.awt.Color;
import javax.swing.JOptionPane;
import utilitarios.Enumeraveis;

public class TelaNomeJogador extends javax.swing.JFrame {

    /**
     * Creates new form TelaNomeJogador
     */
    public TelaNomeJogador() {
        this.getContentPane().setBackground(Color.white);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAvancar = new javax.swing.JButton();
        jLabelQualOSeuNome = new javax.swing.JLabel();
        jTextFieldNomeJogador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game DC Heroes - Seu nome?");
        setResizable(false);

        jButtonAvancar.setText("Avançar");
        jButtonAvancar.setVerifyInputWhenFocusTarget(false);
        jButtonAvancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAvancarMouseClicked(evt);
            }
        });
        jButtonAvancar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAvancarKeyPressed(evt);
            }
        });

        jLabelQualOSeuNome.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabelQualOSeuNome.setForeground(new java.awt.Color(59, 95, 161));
        jLabelQualOSeuNome.setText("Qual o seu nome?");
        jLabelQualOSeuNome.setToolTipText("");

        jTextFieldNomeJogador.setToolTipText("");
        jTextFieldNomeJogador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeJogadorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jButtonAvancar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQualOSeuNome)
                            .addComponent(jTextFieldNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelQualOSeuNome)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAvancar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButtonAvancar.getAccessibleContext().setAccessibleName("jButtonAvancar");
        jButtonAvancar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //<editor-fold defaultstate="collapsed" desc="Eventos">
    
    private void jButtonAvancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAvancarMouseClicked
        avancarTela();
    }//GEN-LAST:event_jButtonAvancarMouseClicked

    private void jButtonAvancarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAvancarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            avancarTela();
        }
    }//GEN-LAST:event_jButtonAvancarKeyPressed

    private void jTextFieldNomeJogadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeJogadorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            avancarTela();
        }
    }//GEN-LAST:event_jTextFieldNomeJogadorKeyPressed

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Funções">
    
    private void avancarTela() {
        if(jTextFieldNomeJogador.getText().length() > 0){
            this.dispose();
            //Constrói a TelaSelecionaEquipe
            Jogador jogador = new Jogador(jTextFieldNomeJogador.getText(), Enumeraveis.TipoJogador.Humano);
            TelaSelecionaEquipe telaSelecionaEquipe = new TelaSelecionaEquipe(jogador);
            telaSelecionaEquipe.setLocationRelativeTo(null);
            telaSelecionaEquipe.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Digite seu nome!","Game DC Heroes - Jogador", JOptionPane.INFORMATION_MESSAGE, null);
            jTextFieldNomeJogador.requestFocus();
        }
    }
    
    //</editor-fold>
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAvancar;
    private javax.swing.JLabel jLabelQualOSeuNome;
    private javax.swing.JTextField jTextFieldNomeJogador;
    // End of variables declaration//GEN-END:variables
}
