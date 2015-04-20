/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estudos;

import javax.swing.JOptionPane;

/**
 *
 * @author Renato
 */
public class Principal extends javax.swing.JFrame {

   Locadora loc = new Locadora();
   Fornecedor Acer = new Fornecedor("Acer ltda", "00-000-000-0000-00", "rua teste", "Jatai");
   
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelCodigoLivro = new javax.swing.JLabel();
        jTextFieldCodLivro = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelVlCompra = new javax.swing.JLabel();
        jTextFieldVlCompra = new javax.swing.JTextField();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jCheckBoxInativo = new javax.swing.JCheckBox();
        jLabelIdioma = new javax.swing.JLabel();
        jTextFieldIdioma = new javax.swing.JTextField();
        jLabelLegenda = new javax.swing.JLabel();
        jTextFieldLegenda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeFantasia = new javax.swing.JLabel();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jLabelCNPJ = new javax.swing.JLabel();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelMidia = new javax.swing.JLabel();
        jTextFieldMidia = new javax.swing.JTextField();
        jButtonMostrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonSair = new javax.swing.JButton();
        jLabelObservacao = new javax.swing.JLabel();
        jTextFieldObservacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Locadora"));

        jLabelDescricao.setText("Descrição");

        jLabelCodigoLivro.setText("Código Livro");

        jTextFieldCodLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodLivroActionPerformed(evt);
            }
        });

        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        jLabelVlCompra.setText("Valor da Compra");

        jTextFieldVlCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVlCompraActionPerformed(evt);
            }
        });

        jCheckBoxAtivo.setText("Ativo");

        jCheckBoxInativo.setText("Inativo");

        jLabelIdioma.setText("Idioma");

        jTextFieldIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdiomaActionPerformed(evt);
            }
        });

        jLabelLegenda.setText("Legenda");

        jTextFieldLegenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLegendaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Fornecedor");

        jLabelNomeFantasia.setText("Nome Fantasia");

        jTextFieldNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFantasiaActionPerformed(evt);
            }
        });

        jLabelCNPJ.setText("CNPJ");

        jTextFieldCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCNPJActionPerformed(evt);
            }
        });

        jLabelEndereco.setText("Endereço");

        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        jLabelCidade.setText("Cidade");

        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jLabelMidia.setText("Midia");

        jTextFieldMidia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMidiaActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelObservacao.setText("Observação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(jLabelVlCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldVlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jCheckBoxInativo)
                                .addGap(10, 10, 10)
                                .addComponent(jCheckBoxAtivo))
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelCodigoLivro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelIdioma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelLegenda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelMidia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldMidia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jButtonMostrar)
                                .addGap(57, 57, 57)
                                .addComponent(jButtonSair))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNomeFantasia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelCNPJ)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelObservacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCheckBoxAtivo, jCheckBoxInativo});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonMostrar, jButtonSair});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxAtivo)
                    .addComponent(jLabelVlCompra)
                    .addComponent(jTextFieldVlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxInativo))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoLivro)
                    .addComponent(jTextFieldCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdioma)
                    .addComponent(jTextFieldIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLegenda)
                    .addComponent(jTextFieldLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMidia)
                    .addComponent(jTextFieldMidia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelObservacao)
                    .addComponent(jTextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFantasia)
                    .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCNPJ)
                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMostrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSair)))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCheckBoxAtivo, jCheckBoxInativo});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonMostrar, jButtonSair});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(744, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jTextFieldVlCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVlCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVlCompraActionPerformed

    private void jTextFieldCodLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodLivroActionPerformed

    private void jTextFieldIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdiomaActionPerformed

    private void jTextFieldLegendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLegendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLegendaActionPerformed

    private void jTextFieldMidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMidiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMidiaActionPerformed

    private void jTextFieldNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeFantasiaActionPerformed

    private void jTextFieldCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCNPJActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
       loc.setCodigoLivro(Integer.parseInt(jTextFieldCodLivro.getText()));
       loc.setDescricao(jTextFieldDescricao.getText());
       loc.setIdioma(jTextFieldIdioma.getText());
       loc.setLegenda(jTextFieldLegenda.getText());
       loc.setObservacao(jTextFieldObservacao.getText());
       loc.setStatus(jCheckBoxAtivo.getActionCommand());
       loc.setStatus(jCheckBoxInativo.getActionCommand());
       Acer.setCnpj(jTextFieldCNPJ.getText());
       Acer.setNomeFantasia(jTextFieldNomeFantasia.getText());
       Acer.setCidade(jTextFieldCidade.getText());
       Acer.setEndereco(jTextFieldEndereco.getText());
      
       
       JOptionPane.showMessageDialog(null, "Código do Livro:" + " " + loc.getCodigoLivro() + "\n" + "Descrição:" + " " + loc.getDescricao() + "\n" + "Idioma:" + " " + loc.getIdioma() + "\n" + "Legenda:" + " " + loc.getLegenda() + "\n" + "Observação:" + " " + loc.getObservacao() + "\n" + "Status:" + " " + loc.getStatus() + "\n" + "CNPJ:" + " " + Acer.getCnpj() +  "\n" + "Cidade:" + " " + Acer.getCidade() + "\n" + "Endereco:" + " " + Acer.getEndereco() + "\n" + "Nome Fantasia:" + " " + Acer.getNomeFantasia());
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JCheckBox jCheckBoxAtivo;
    private javax.swing.JCheckBox jCheckBoxInativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCodigoLivro;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelIdioma;
    private javax.swing.JLabel jLabelLegenda;
    private javax.swing.JLabel jLabelMidia;
    private javax.swing.JLabel jLabelNomeFantasia;
    private javax.swing.JLabel jLabelObservacao;
    private javax.swing.JLabel jLabelVlCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodLivro;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIdioma;
    private javax.swing.JTextField jTextFieldLegenda;
    private javax.swing.JTextField jTextFieldMidia;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldObservacao;
    private javax.swing.JTextField jTextFieldVlCompra;
    // End of variables declaration//GEN-END:variables
}
