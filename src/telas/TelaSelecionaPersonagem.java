/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import personagens.base.*;
import utilitarios.Enumeraveis;
import personagens.controle.PersonagemControle;

public class TelaSelecionaPersonagem extends javax.swing.JDialog {

    ArrayList<Personagem> listPersonagens = new ArrayList<Personagem>();
    ArrayList<Personagem> listPersonagensSelecionados = new ArrayList<Personagem>();
    PersonagemControle personagemControle = new PersonagemControle();
    Personagem personagemSelecionado;

    public TelaSelecionaPersonagem(ArrayList<Personagem> listPersonagensSelecionados) {
        this.setModal(true);
        this.getContentPane().setBackground(Color.white);
        initComponents();
        this.listPersonagensSelecionados = listPersonagensSelecionados;
       
        listPersonagens = personagemControle.getTodosPersonagens();
        jComboBoxPersonagem.removeAllItems();
        
        listPersonagens.stream().forEach((personagem) -> {
            jComboBoxPersonagem.addItem(personagem);
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionar = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();
        jComboBoxPersonagem = new javax.swing.JComboBox();
        jLabelAlinhamento = new javax.swing.JLabel();
        jLabelClasse = new javax.swing.JLabel();
        jLabelDano = new javax.swing.JLabel();
        jLabelResistencia = new javax.swing.JLabel();
        jLabelQtdeVida = new javax.swing.JLabel();
        jLabelNomePersonagem = new javax.swing.JLabel();
        jLabelAlinhamentoText = new javax.swing.JLabel();
        jLabelClasseText = new javax.swing.JLabel();
        jLabelDanoText = new javax.swing.JLabel();
        jLabelResistenciaText = new javax.swing.JLabel();
        jLabelQtdeVidaText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdicionarMouseClicked(evt);
            }
        });
        jButtonAdicionar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAdicionarKeyPressed(evt);
            }
        });

        jComboBoxPersonagem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPersonagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPersonagemItemStateChanged(evt);
            }
        });

        jLabelAlinhamento.setText("Alinhamento:");

        jLabelClasse.setText("Classe:");

        jLabelDano.setText("Dano:");

        jLabelResistencia.setText("Resistência:");

        jLabelQtdeVida.setText("Qtde. Vida:");

        jLabelNomePersonagem.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabelNomePersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomePersonagem.setToolTipText("");
        jLabelNomePersonagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPersonagem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAlinhamento)
                                    .addComponent(jLabelClasse, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDano, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelResistencia, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelQtdeVida, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAlinhamentoText)
                                    .addComponent(jLabelClasseText)
                                    .addComponent(jLabelDanoText)
                                    .addComponent(jLabelResistenciaText)
                                    .addComponent(jLabelQtdeVidaText))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButtonAdicionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAlinhamento)
                            .addComponent(jLabelAlinhamentoText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelClasseText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDano)
                            .addComponent(jLabelDanoText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelResistencia)
                            .addComponent(jLabelResistenciaText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQtdeVida)
                            .addComponent(jLabelQtdeVidaText))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePersonagem)
                    .addComponent(jButtonAdicionar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //<editor-fold defaultstate="collapsed" desc="Eventos">

    private void jComboBoxPersonagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPersonagemItemStateChanged
        personagemSelecionado = ((Personagem) jComboBoxPersonagem.getSelectedItem());
        if(personagemSelecionado != null){
            jLabelNomePersonagem.setText(personagemSelecionado.getNome());
            jLabelAlinhamentoText.setText(personagemSelecionado.getAlinhamento().toString());
            jLabelClasseText.setText(personagemSelecionado.getClasse().toString());
            jLabelDanoText.setText(personagemSelecionado.getDano().toString());
            jLabelResistenciaText.setText(personagemSelecionado.getResistencia().toString());
            jLabelQtdeVidaText.setText(personagemSelecionado.getQuantidadeVida().toString());
            jLabelImagem.setIcon(new ImageIcon(getClass().getResource(personagemSelecionado.getImagem())));
            
            if(personagemSelecionado.getAlinhamento() == Enumeraveis.Alinhamento.Antagonista){
                jLabelNomePersonagem.setForeground(Color.red);
                jLabelAlinhamentoText.setForeground(Color.red);
                jLabelClasseText.setForeground(Color.red);
                jLabelDanoText.setForeground(Color.red);
                jLabelResistenciaText.setForeground(Color.red);
                jLabelQtdeVidaText.setForeground(Color.red);
            }
            else if(personagemSelecionado.getAlinhamento() == Enumeraveis.Alinhamento.Protagonista){
                jLabelNomePersonagem.setForeground(Color.blue);
                jLabelAlinhamentoText.setForeground(Color.blue);
                jLabelClasseText.setForeground(Color.blue);
                jLabelDanoText.setForeground(Color.blue);
                jLabelResistenciaText.setForeground(Color.blue);
                jLabelQtdeVidaText.setForeground(Color.blue);
            }
        }
    }//GEN-LAST:event_jComboBoxPersonagemItemStateChanged

    private void jButtonAdicionarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAdicionarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            adicionarPersonagem();
        }
    }//GEN-LAST:event_jButtonAdicionarKeyPressed

    private void jButtonAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdicionarMouseClicked
        adicionarPersonagem();
    }//GEN-LAST:event_jButtonAdicionarMouseClicked

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Funções">
    
    public void adicionarPersonagem(){
        personagemSelecionado = ((Personagem) jComboBoxPersonagem.getSelectedItem());
        if(personagemSelecionado != null){
            listPersonagensSelecionados.add(personagemSelecionado);
            this.dispose();
        }
    }
    
    //</editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JComboBox jComboBoxPersonagem;
    private javax.swing.JLabel jLabelAlinhamento;
    private javax.swing.JLabel jLabelAlinhamentoText;
    private javax.swing.JLabel jLabelClasse;
    private javax.swing.JLabel jLabelClasseText;
    private javax.swing.JLabel jLabelDano;
    private javax.swing.JLabel jLabelDanoText;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelNomePersonagem;
    private javax.swing.JLabel jLabelQtdeVida;
    private javax.swing.JLabel jLabelQtdeVidaText;
    private javax.swing.JLabel jLabelResistencia;
    private javax.swing.JLabel jLabelResistenciaText;
    // End of variables declaration//GEN-END:variables
}