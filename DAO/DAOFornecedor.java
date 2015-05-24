package DAO;

import Classes.Fornecedor;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOFornecedor {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviacomando;
    //private DAOFornecedor dFornecedor = new DAOFornecedor();
    
    public void insert(Fornecedor f){
        String comando  = "insert into fornecedor( id_fornecedor, nomefantasia, cnpj, endereco, cidade, telefone, email) values (?, ?, ?, ?, ?, ?, ?)";
        conexao = cSQL.getConnection();
        
        try {
            enviacomando = conexao.prepareStatement(comando);
            enviacomando.setInt(1, f.getIdFornecedor());
            enviacomando.setString(2, f.getNomeFantasia());
            enviacomando.setString(3, f.getCnpj());
            enviacomando.setString(4, f.getEndereco());
            enviacomando.setString(5, f.getCidade());
            enviacomando.setString(6, f.getTelefone());
            enviacomando.setString(7, f.getEmail());
            enviacomando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado!");
            
            enviacomando.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Registro não efetuado. \n ERRO:" + e.getMessage());
        }
    }
    
    public void atualizar(Fornecedor f){
        String query = "update fornecedor set nomefantasia= ?, cnpj= ?, endereco= ?, cidade= ?, telefone= ?, email= ? where id_fornecedor= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviacomando = conexao.prepareStatement(query);
            
            enviacomando.setString(1, f.getNomeFantasia());
            enviacomando.setString(2, f.getCnpj());
            enviacomando.setString(3, f.getEndereco());
            enviacomando.setString(4, f.getCidade());
            enviacomando.setString(5, f.getTelefone());
            enviacomando.setString(6, f.getEmail());
            enviacomando.setInt(7, f.getIdFornecedor());
            enviacomando.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar fornecedor \n Erro:" + e.getMessage());
        }finally{
            try {
                enviacomando.close();
                conexao.close();
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados \n ERRO:" + e.getMessage());
            }
        }
    }
    
    public void removerTudo(){
        String query = "Delete from fornecedor";
        conexao = cSQL.getConnection();
        
        try {
            enviacomando = conexao.prepareStatement(query);
            enviacomando.executeUpdate();    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor.\n ERRO:" + e.getMessage());
        }finally{
            try {
                enviacomando.close();
                conexao.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão:\n ERRO:" + e.getMessage());
            }
        }
    }
    
    public int geraCodigo(){
        conexao = cSQL.getConnection();
        int codigo = 0;
        String comando = "select max(id_fornecedor) as codigo from fornecedor";
        
        try {
            enviacomando = conexao.prepareStatement(comando);
            resultado = enviacomando.executeQuery();
            while(resultado.next()){
                codigo = resultado.getInt("codigo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar código\n ERRO:" + e.getMessage());
        }finally{
            try {
                enviacomando.close();
                resultado.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return codigo + 1;
    }
    
    public List<Fornecedor> localizarFornecedor(String Fornecedor){
        conexao = cSQL.getConnection();
        List<Fornecedor> tipos = new ArrayList<>();
        String comando = "select *from fornecedor where nomefantasia = ?";
        
        try {
            enviacomando = conexao.prepareStatement(comando);
            enviacomando.setString(1, Fornecedor);
            resultado = enviacomando.executeQuery();
            
            while(resultado.next()){
                Fornecedor f = new Fornecedor();
                f.setIdFornecedor(resultado.getInt("id"));
                f.setNomeFantasia(resultado.getString("nomefantasia"));
                f.setCnpj(resultado.getString("cnpj"));
                f.setEndereco(resultado.getString("endereco"));
                f.setCidade(resultado.getString("cidade"));
                f.setTelefone(resultado.getString("telefone"));
                f.setEmail(resultado.getString("email"));
                tipos.add(f);        
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar fornecedor:" + e.getMessage());
        }finally{
            try {
                //consulta.close();
                //resultado.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
    
     public List<Fornecedor> listarTodos(){
        conexao = cSQL.getConnection();
        List<Fornecedor> tipos = new ArrayList<>();
        String comando = "select *from fornecedor";
        
        try {
            enviacomando = conexao.prepareStatement(comando);
            //enviaComando.setString();
            resultado = enviacomando.executeQuery() ;
            
            while(resultado.next()){ 
                Fornecedor f = new Fornecedor();
                f.setIdFornecedor(resultado.getInt("id_fornecedor"));
                f.setNomeFantasia(resultado.getString("nomefantasia"));
                f.setEndereco(resultado.getString("endereco"));
                f.setCidade(resultado.getString("cidade"));
                f.setCnpj(resultado.getString("cnpj"));
                f.setTelefone(resultado.getString("telefone"));
                f.setEmail(resultado.getString("email"));
                tipos.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar fornecedor:" + e.getMessage());
        }finally{
            try {
                //consulta.close();
                //resultado.close();
                
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
    
    public void removerSelecionado(Fornecedor f){
        String query = "Delete from fornecedor where id_fornecedor = ?";
        conexao = cSQL.getConnection();
        
        try {
            enviacomando= conexao.prepareStatement(query);
            enviacomando.setInt(1, f.getIdFornecedor());
            enviacomando.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor:" + e.getMessage());
        }finally{
            try {
                enviacomando.close();
                conexao.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        
    }

    }
    

