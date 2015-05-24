package Janelas;

import Classes.ApenasLetras;
import Classes.ApenasNumeros;
import Classes.Filmes;
import DAO.DAOFornecedor;
import DAO.DAOFilmes;
import DAO.DAOTipoMidia;
import TableModel.TableModelFilme;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class TelaFilmes extends javax.swing.JFrame {
    
   
   Filmes f = new Filmes();
   private DAOFilmes dFilme = new DAOFilmes();
   private DAOFornecedor dFornecedor = new DAOFornecedor();
   private DAOTipoMidia dTipoMidia = new DAOTipoMidia();
   public  DefaultComboBoxModel dcbmFornecedor = null;
   public DefaultComboBoxModel dcbmFilme = null;
   public DefaultComboBoxModel dcbmTipoMidia = null;
   private TableModel.TableModelFilme tmfilme = new TableModelFilme();
   private DefaultTableModel dtmfilme = new DefaultTableModel();
 
   
    public TelaFilmes() {
        initComponents();
        
        
        //MASCARA PARA OS CAMPOS
        jTextFieldDescricao.setDocument(new ApenasLetras());
        jTextFieldLegenda.setDocument(new ApenasLetras());
        jTextFieldId.setDocument(new ApenasNumeros());
        jTextFieldObservacao.setDocument(new ApenasLetras());
        jTextFieldVlCompra.setDocument(new ApenasNumeros());
        jTextFieldIdioma.setDocument(new ApenasLetras());
        jTextFieldQuantidade.setDocument(new ApenasNumeros());
        jTableTabela.setAutoCreateRowSorter(true);
        
         preencherCombo();
        try {
                 preencheTabela();
                
             } catch (SQLException ex) {
                 Logger.getLogger(TelaFornecedor.class.getName()).log(Level.SEVERE, null, ex);
             }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelCodigoLivro = new javax.swing.JLabel();
        jTextFieldIdioma = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelVlCompra = new javax.swing.JLabel();
        jTextFieldVlCompra = new javax.swing.JTextField();
        jLabelIdioma = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelLegenda = new javax.swing.JLabel();
        jTextFieldLegenda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonFechar = new javax.swing.JButton();
        jLabelObservacao = new javax.swing.JLabel();
        jTextFieldObservacao = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxFornecedor = new javax.swing.JComboBox();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelTipoMidia = new javax.swing.JLabel();
        jComboBoxTipoMidia = new javax.swing.JComboBox();
        jLabelQuantidade = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Livros"));

        jLabelDescricao.setText("Descrição");

        jLabelCodigoLivro.setText("Código Livro");

        jTextFieldIdioma.setToolTipText("Idioma");
        jTextFieldIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdiomaActionPerformed(evt);
            }
        });

        jTextFieldDescricao.setToolTipText("Descrição");
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        jLabelVlCompra.setText("Valor da Compra");

        jTextFieldVlCompra.setToolTipText("Valor da Compra");
        jTextFieldVlCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVlCompraActionPerformed(evt);
            }
        });

        jLabelIdioma.setText("Idioma");

        jTextFieldId.setToolTipText("Código do Livro");
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jLabelLegenda.setText("Legenda");

        jTextFieldLegenda.setToolTipText("Legenda");
        jTextFieldLegenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLegendaActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabelObservacao.setText("Observação");

        jTextFieldObservacao.setToolTipText("Observação");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Fornecedores");

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setToolTipText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setToolTipText("Alterar");

        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabelTipoMidia.setText("Tipo Midia");

        jLabelQuantidade.setText("Quantidade");

        jTextFieldQuantidade.setToolTipText("Quantidade");

        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabelTipoMidia)
                        .addGap(27, 27, 27)
                        .addComponent(jComboBoxTipoMidia, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFechar)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonLimpar)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonNovo)
                            .addComponent(jButtonExcluir)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelObservacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(jLabelQuantidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldQuantidade))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCodigoLivro)
                                .addComponent(jLabelLegenda))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabelIdioma)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelVlCompra)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldVlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabelDescricao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAlterar, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoLivro)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdioma)
                    .addComponent(jLabelVlCompra)
                    .addComponent(jTextFieldVlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLegenda)
                            .addComponent(jTextFieldLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescricao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelObservacao)
                    .addComponent(jTextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoMidia)
                    .addComponent(jComboBoxTipoMidia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonSalvar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldId, jTextFieldIdioma, jTextFieldLegenda});

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

        setSize(new java.awt.Dimension(879, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jTextFieldLegendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLegendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLegendaActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldVlCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVlCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVlCompraActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jTextFieldIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdiomaActionPerformed
        
    }//GEN-LAST:event_jTextFieldIdiomaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            f = new Filmes();
            f.setId(Integer.parseInt(jTextFieldId.getText()));
            f.setDescricao(jTextFieldDescricao.getText());
            f.setIdioma(jTextFieldIdioma.getText());
            f.setLegenda(jTextFieldLegenda.getText());
            f.setObservacao(jTextFieldObservacao.getText());
            f.setVlCompra(Double.parseDouble(jTextFieldVlCompra.getText()));
            f.setQuantidade(Integer.parseInt(jTextFieldQuantidade.getText()));
            dFilme.insert(f);
            preencheTabela();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
       jTextFieldDescricao.setText(null);
       jTextFieldIdioma.setText(null);
       jTextFieldLegenda.setText(null);
       jTextFieldObservacao.setText(null);
       jTextFieldVlCompra.setText(null);
       jTextFieldQuantidade.setText(null);
       
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldId.setText(String.valueOf(dFilme.geraCodigo()));
        jTextFieldDescricao.setText("");
        jTextFieldIdioma.setText("");
        jTextFieldLegenda.setText("");
        jTextFieldLegenda.setText("");
        jTextFieldObservacao.setText("");
        jTextFieldVlCompra.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldDescricao.requestFocus();
       
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

            int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION );
            if(resultado == JOptionPane.YES_OPTION){
                try {
                    dFilme.removerSelecionado(f);
                    preencheTabela();
                    jTextFieldId.setText("");
                    jTextFieldDescricao.setText("");
                    jTextFieldIdioma.setText("");
                    jTextFieldLegenda.setText("");
                    jTextFieldObservacao.setText("");
                    jTextFieldVlCompra.setText("");
                    jTextFieldQuantidade.setText("");
                    JOptionPane.showMessageDialog(null, "Filme removido com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover filme:" + e.getMessage());
                }
            
            }   
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
       int linha = jTableTabela.getSelectedRow();
       f = tmfilme.getFilmes(linha);
       
       jTextFieldId.setText((String.valueOf(f.getId())));
       jTextFieldDescricao.setText(String.valueOf(f.getDescricao()));
       jTextFieldIdioma.setText(String.valueOf(f.getIdioma()));
       jTextFieldLegenda.setText(String.valueOf(f.getLegenda()));
       jTextFieldObservacao.setText(String.valueOf(f.getObservacao()));
       jTextFieldQuantidade.setText(String.valueOf(f.getQuantidade()));
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void preencherCombo(){
        jComboBoxFornecedor.removeAll();
        jComboBoxTipoMidia.removeAll();
        dcbmFornecedor = new DefaultComboBoxModel(dFornecedor.listarTodos().toArray());
        dcbmTipoMidia = new DefaultComboBoxModel(dTipoMidia.listarTodos().toArray());
        jComboBoxFornecedor.setModel(dcbmFornecedor);
        jComboBoxTipoMidia.setModel(dcbmTipoMidia);
    }
    
    
    
    private void preencheTabela() throws SQLException{
        List<Filmes> tipos = dFilme.listarTodos();
        tmfilme = new TableModelFilme(tipos);
        jTableTabela.setModel(tmfilme);
    }
    
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
            java.util.logging.Logger.getLogger(TelaFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFilmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxFornecedor;
    private javax.swing.JComboBox jComboBoxTipoMidia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigoLivro;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelIdioma;
    private javax.swing.JLabel jLabelLegenda;
    private javax.swing.JLabel jLabelObservacao;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelTipoMidia;
    private javax.swing.JLabel jLabelVlCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdioma;
    private javax.swing.JTextField jTextFieldLegenda;
    private javax.swing.JTextField jTextFieldObservacao;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldVlCompra;
    // End of variables declaration//GEN-END:variables
}
