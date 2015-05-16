package DAO;

import Classes.CadastroLivros;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DAOLivros {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    
    
    
    public void insert(CadastroLivros cl){
        String comando  = "Insert Into TipoDeMidia (id, descricao, vlcompra, idioma, legenda, fornecedor) values (?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, a.getIdTipo());
            enviaComando.setString(2, a.getTipoMidia());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado");
            
            enviaComando.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + e.getMessage());
        }
    }
    
    public void atualizar(TipoMidia a ){
        String query = "update TipoMidia set tipoMidia = ? where idTipo = ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(2, a.getIdTipo());
            enviaComando.setString(1, a.getTipoMidia());
            enviaComando.executeUpdate();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar TipoMidia:" + e.getMessage());
        }finally{  
            try{
            enviaComando.close();
            conexao.close();
            }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados \n ERRO:" + e.getMessage());
            }
        }
    }
    
    public void removerTudo(){ 
        String query = "Delete from TipoMidia";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir TipoMdia:" + e.getMessage());
        }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fehcar conexão:\n ERRO:" + e.getMessage());
            }
        
        }
    }
    
    public int geraCodigo(){
        conexao = cSQL.getConnection();
        int codigo = 0;
        String comando = "select max(idTipo) as codigo from TipoMidia";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery();
            while(resultado.next()){
                codigo = resultado.getInt("codigo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar código:" + e.getMessage());
        }finally{
            try {
                enviaComando.close();
                resultado.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
                
            }
        }
        return codigo + 1;
    }
    
    public List<TipoMidia> localizarTipo(String TipoMidia){
        conexao = cSQL.getConnection();
        List<TipoMidia> tipos = new ArrayList<>();
        String comando = "select *from TipoMidia whre tipoMidia = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, TipoMidia);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                TipoMidia a = new TipoMidia();
                a.setIdTipo(resultado.getInt("IdTipo"));
                a.setTipoDeMidia(resultado.getString("TipoMidia"));
                tipos.add(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar TipoMidia:" + e.getMessage());
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
    
     public List<TipoMidia> listarTodos(){
        conexao = cSQL.getConnection();
        List<TipoMidia> tipos = new ArrayList<>();
        String comando = "select *from TipoMidia whre tipoMidia = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            //enviaComando.setString();
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                TipoMidia a = new TipoMidia();
                a.setIdTipo(resultado.getInt("IdTipo"));
                a.setTipoDeMidia(resultado.getString("TipoMidia"));
                tipos.add(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar TipoMidia:" + e.getMessage());
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
    
    public void removerSelecionado(TipoMidia a){
        String query = "Delete from TipoMidia where idTipo = ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, a.getIdTipo());
            enviaComando.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir TipoMidia:" + e.getMessage());
        }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
    }
    
}
