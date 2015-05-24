

package Janelas;

import Classes.ApenasLetras;
import Classes.Fornecedor;
import DAO.DAOFornecedor;
import TableModel.TableModelFornecedor;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaFornecedor extends javax.swing.JFrame {

       
         Fornecedor f = new Fornecedor();
         DefaultTableModel dtm = new DefaultTableModel();
         public static List<Fornecedor> fornecedores;
         private DAOFornecedor dFornecedor = new DAOFornecedor();
         private TableModel.TableModelFornecedor tmf = new TableModelFornecedor();
        
    
    public TelaFornecedor() {
        initComponents();
        
        //MASCARA PARA OS CAMPOS
        jTextFieldCidade.setDocument(new ApenasLetras());
        jTextFieldEndereco.setDocument(new ApenasLetras());
        jTextFieldNomeFantasia.setDocument(new ApenasLetras()); 
        jTableTabela.setAutoCreateRowSorter(true);
        
             try {
                 preencheTabela();
             } catch (SQLException ex) {
                 Logger.getLogger(TelaFornecedor.class.getName()).log(Level.SEVERE, null, ex);
             }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelNomeFantasia = new javax.swing.JLabel();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCNPJ = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter CNPJ = new javax.swing.text.MaskFormatter("##.###.###/####-##");

            jTextFieldCNPJ = new javax.swing.JFormattedTextField(CNPJ);
        }catch(Exception e){
        }
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jButtonFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##) ####-####");

            jTextFieldTelefone = new javax.swing.JFormattedTextField(telefone);
        }catch(Exception e){
        }
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabeliD = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jButtonFilrar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));

        jLabelNomeFantasia.setText("Nome Fantasia");

        jTextFieldNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFantasiaActionPerformed(evt);
            }
        });

        jLabel2.setText("CNPJ");

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

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabelTelefone.setText("Telefone");

        jLabelEmail.setText("E-mail");

        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabeliD.setText("Id");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableTabela.setToolTipText("Lista de Fornecedores");
        jTableTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableTabelaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabela);

        jButtonFilrar.setText("Filrar");
        jButtonFilrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilrarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonFilrar)
                .addGap(20, 255, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabeliD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabelNomeFantasia)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabelTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabelCidade)
                                        .addGap(39, 39, 39)
                                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonFilrar, jButtonLimpar, jButtonNovo, jButtonSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeFantasia)
                    .addComponent(jLabeliD)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFilrar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFechar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonFilrar, jButtonLimpar, jButtonNovo, jButtonSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

        setSize(new java.awt.Dimension(953, 553));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFantasiaActionPerformed
        
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

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
      
        try {
            f = new Fornecedor();
            f.setIdFornecedor(Integer.parseInt(jTextFieldId.getText()));
            f.setNomeFantasia(jTextFieldNomeFantasia.getText());
            f.setCnpj(jTextFieldCNPJ.getText());
            f.setTelefone(jTextFieldTelefone.getText());
            f.setCidade(jTextFieldCidade.getText());
            f.setEmail(jTextFieldEmail.getText());
            f.setEndereco(jTextFieldEndereco.getText());
            dFornecedor.insert(f);
            preencheTabela();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
           
        }    
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldCNPJ.setText(null);
        jTextFieldCidade.setText(null);
        jTextFieldEndereco.setText(null);
        jTextFieldNomeFantasia.setText(null);
        jTextFieldEmail.setText(null);
        jTextFieldTelefone.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost
       
    }//GEN-LAST:event_jTextFieldEmailFocusLost

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
     
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldId.setText(String.valueOf(dFornecedor.geraCodigo()));
        jTextFieldNomeFantasia.setText("");
        jTextFieldCNPJ.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEmail.setText("");
        jTextFieldNomeFantasia.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void listaFornecedores() {
        fornecedores = dFornecedor.listarTodos();
        Fornecedor f;
        dtm.setNumRows(0);
        dtm.setRowCount(0);

        for (int i = 0; i < fornecedores.size(); i++) {
            f = fornecedores.get(i);
            dtm.addRow(new String[]{String.valueOf(f.getIdFornecedor()),
                f.getNomeFantasia(),
                f.getEndereco(),
                f.getCidade(),
                f.getTelefone(),
                f.getCnpj(),
                f.getEmail()});
        }
        jTableTabela.setModel(dtm);
    }
    
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFilrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilrarActionPerformed
         fornecedores = dFornecedor.localizarFornecedor(jTextFieldFiltrar.getText());
       listarFornecedoresSelecionados();
    }//GEN-LAST:event_jButtonFilrarActionPerformed

    private void listarFornecedoresSelecionados(){
        dtm.setNumRows(0);
        Fornecedor f;
        if (fornecedores.isEmpty()){
            listaFornecedores();
            return;
        }
        for (int i = 0; i < fornecedores.size(); i++){
            f = fornecedores.get(i);
            dtm.addRow(new String []{String.valueOf(f.getIdFornecedor()),
                f.getNomeFantasia(),
                f.getEndereco(),
                f.getCidade(), 
                f.getTelefone(), 
                f.getEmail(), 
                String.valueOf(f.getCnpj())});
        }
        jTableTabela.setModel(dtm);
    }
    
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            f.setIdFornecedor(Integer.parseInt(jTextFieldId.getText()));
            f.setNomeFantasia(jTextFieldNomeFantasia.getText());
            f.setEndereco(jTextFieldEndereco.getText());
            f.setCidade(jTextFieldCidade.getText());
            f.setTelefone(jTextFieldTelefone.getText());
            f.setCnpj(jTextFieldCNPJ.getText());
            f.setEmail(jTextFieldEmail.getText());
            dFornecedor.atualizar(f);
            JOptionPane.showMessageDialog(this,"Alteração realizada!");
            listaFornecedores();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Erro ao alterar Fornecedor:" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTableTabelaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMousePressed
       
    }//GEN-LAST:event_jTableTabelaMousePressed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        int linha = jTableTabela.getSelectedRow();
        f = tmf.getFornecedor(linha);
        
        jTextFieldId.setText(String.valueOf(f.getIdFornecedor()));
        jTextFieldCNPJ.setText(String.valueOf(f.getCnpj()));
        jTextFieldCidade.setText(String.valueOf(f.getCidade()));
        jTextFieldEmail.setText(String.valueOf(f.getEmail()));
        jTextFieldEndereco.setText(String.valueOf(f.getEndereco()));
        jTextFieldNomeFantasia.setText(String.valueOf(f.getNomeFantasia()));
        jTextFieldTelefone.setText(String.valueOf(f.getTelefone()));
    }//GEN-LAST:event_jTableTabelaMouseClicked
    
       
   
    private void preencheTabela() throws SQLException{
        List<Fornecedor> tipos = dFornecedor.listarTodos();
        tmf = new TableModelFornecedor(tipos);
        jTableTabela.setModel(tmf);
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
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonFilrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNomeFantasia;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabeliD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldFiltrar;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
