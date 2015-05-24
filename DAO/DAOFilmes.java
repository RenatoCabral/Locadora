package DAO;

import Classes.Filmes;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DAOFilmes {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    
    
    
    public void insert(Filmes f){
        String comando  = "Insert Into filmes (id_filmes, descricao, valor_compra, idioma, legenda, observacao, quantidade) values (?, ?, ?, ?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, f.getId());
            enviaComando.setString(2, f.getDescricao());
            enviaComando.setDouble(3, f.getVlCompra());
            enviaComando.setString(4, f.getIdioma());
            enviaComando.setString(5, f.getLegenda());
            enviaComando.setString(6, f.getObservacao());
            enviaComando.setInt(7, f.getQuantidade());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado");
            
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + ex.getMessage());
        }
    }
    
    public void atualizar(Filmes f ){
        String query = "update filmes set decricao = ?, valor_compra= ?, idioma= ?, legenda= ?, observacao= ? where id_filmes= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(7, f.getId());
            enviaComando.setString(1, f.getDescricao());
            enviaComando.setString(2, f.getIdioma());
            enviaComando.setString(3, f.getLegenda());
            enviaComando.setString(4, f.getObservacao());
            enviaComando.setDouble(5, f.getVlCompra());
            enviaComando.setInt(6, f.getQuantidade());
            enviaComando.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar filmes:" + ex.getMessage());
        }finally{  
            try{
            enviaComando.close();
            conexao.close();
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados \n ERRO:" + ex.getMessage());
            }
        }
    }
    
    public void atualizaEstoque(Filmes f){
        String query = "update  filmes set quantidade = ? where id_filmes= ?";
         conexao = cSQL.getConnection();
         
         try{
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1,f.getQuantidade());
            enviaComando.setInt(2,f.getId());
            enviaComando.executeUpdate();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao excluir filme"+ e.getMessage());
        }finally{
            try{
                enviaComando.close();
                conexao.close();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null,"Erro ao fechar a comexão com o banco de dados"+ e.getMessage());
            }
        }
    }
    
    public void removerTudo(){ 
        String query = "Delete from filmes";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir filmes:" + ex.getMessage());
        }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fehcar conexão:\n ERRO:" + ex.getMessage());
            }
        
        }
    }
    
    public int geraCodigo(){
        conexao = cSQL.getConnection();
        int codigo = 0;
        String comando = "select max(id_filmes) as codigo from filmes";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery();
            while(resultado.next()){
                codigo = resultado.getInt("codigo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar código:" + ex.getMessage());
        }finally{
            try {
                enviaComando.close();
                resultado.close();
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
                
            }
        }
        return codigo + 1;
    }
    
    public List<Filmes> localizarTipo(String Filmes){
        conexao = cSQL.getConnection();
        List<Filmes> tipos = new ArrayList<>();
        String comando = "select *from filmes where descricao = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, Filmes);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                Filmes filmes = new Filmes();
                filmes.setId(resultado.getInt("id_filmes"));
                filmes.setDescricao(resultado.getString("descricao"));
                filmes.setIdioma(resultado.getString("idioma"));
                filmes.setLegenda(resultado.getString("legenda"));
                filmes.setObservacao(resultado.getString("observacao"));
                filmes.setVlCompra(resultado.getDouble("valor_compra"));
                filmes.setQuantidade(resultado.getInt("quantidade"));
                tipos.add(filmes);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar filmes" + ex.getMessage());
        }finally{
            try {
                
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
    }
    
     public List<Filmes> listarTodos(){
        conexao = cSQL.getConnection();
        List<Filmes> tipos = new ArrayList<>();
        String comando = "select *from filmes";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            //enviaComando.setString();
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                Filmes filmes = new Filmes();
                filmes.setId(resultado.getInt("id_filmes"));
                filmes.setDescricao(resultado.getString("descricao"));
                filmes.setIdioma(resultado.getString("idioma"));
                filmes.setLegenda(resultado.getString("legenda"));
                filmes.setObservacao(resultado.getString("observacao"));
                filmes.setVlCompra(resultado.getDouble("valor_compra"));
                filmes.setQuantidade(resultado.getInt("quantidade"));
                tipos.add(filmes);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar filmes" + ex.getMessage());
        }finally{
            try {
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
    
    public void removerSelecionado(Filmes filmes){
        String query = "Delete from filmes where id_filmes= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, filmes.getId());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir filmes:" + ex.getMessage());
        }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
    }
    
}
