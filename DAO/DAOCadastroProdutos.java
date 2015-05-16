package DAO;

import Classes.CadastroProdutos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DAOCadastroProdutos {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    
    
    
    public void insert(CadastroProdutos cp){
        String comando  = "Insert Into TipoDeMidia (id, descricao, vlcompra, idioma, legenda, fornecedor, obsevacao) values (?, ?, ?, ?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, cp.getId());
            enviaComando.setString(2, cp.getDescricao());
            enviaComando.setString(3, cp.getIdioma());
            enviaComando.setString(4, cp.getLegenda());
            enviaComando.setString(5, cp.getObservacao());
            enviaComando.setDouble(7, cp.getVlCompra());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado");
            
            enviaComando.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + e.getMessage());
        }
    }
    
    public void atualizar(CadastroProdutos cp ){
        String query = "update produtos set decricao = ?, valor_compra= ?, idioma= ?, legenda= ?, observacao= ? where idTipo = ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(5, cp.getId());
            enviaComando.setString(1, cp.getDescricao());
            enviaComando.setString(2, cp.getIdioma());
            enviaComando.setString(3, cp.getLegenda());
            enviaComando.setString(4, cp.getObservacao());
            enviaComando.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar produtos:" + ex.getMessage());
        }finally{  
            try{
            enviaComando.close();
            conexao.close();
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados \n ERRO:" + ex.getMessage());
            }
        }
    }
    
    public void removerTudo(){ 
        String query = "Delete from produtos";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produtos:" + ex.getMessage());
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
        String comando = "select max(id) as codigo from produtos";
        
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
    
    public List<CadastroProdutos> localizarTipo(String CadastroProdutos){
        conexao = cSQL.getConnection();
        List<CadastroProdutos> tipos = new ArrayList<>();
        String comando = "select *from produtos whre descricao = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, CadastroProdutos);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                CadastroProdutos cp = new CadastroProdutos();
                cp.setId(resultado.getInt("id"));
                cp.setTipoDeMidia(resultado.getString("TipoMidia"));
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
