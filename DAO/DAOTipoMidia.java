package DAO;

import conexao.Conexao;
import Classes.TipoMidia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOTipoMidia {
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
   // private DAOTipoMidia dTipoMidia = new DAOTipoMidia();
    
    
    public void insert(TipoMidia a ){
        String comando  = "Insert Into tipomidia (id_tipomidia, tipomidia) values (?, ?)";
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
        String query = "update tipomidia set tipomidia = ? where id_tipomidia = ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(2, a.getIdTipo());
            enviaComando.setString(1, a.getTipoMidia());
            enviaComando.executeUpdate();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar tipomidia:" + e.getMessage());
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
        String query = "Delete from tipomidia";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir tipomidia:" + e.getMessage());
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
        String comando = "select max(id) as codigo from tipomidia";
        
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
        String comando = "select *from tipomidia whre tipomidia = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, TipoMidia);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                TipoMidia a = new TipoMidia();
                a.setIdTipo(resultado.getInt("id_tipomidia"));
                a.setTipoDeMidia(resultado.getString("tipomidia"));
                tipos.add(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar tipomidia:" + e.getMessage());
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
        String comando = "select * from tipomidia";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            //enviaComando.setString();
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                TipoMidia a = new TipoMidia();
                a.setIdTipo(resultado.getInt("id_tipomidia"));
                a.setTipoDeMidia(resultado.getString("tipomidia"));
                tipos.add(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar tipomidia:" + e.getMessage());
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
        String query = "Delete from tipomidia where id_tipomidia = ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, a.getIdTipo());
            enviaComando.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir tipomidia:" + e.getMessage());
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
