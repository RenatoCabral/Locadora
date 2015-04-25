package DAO;

import conexao.Conexao;
import estudos.TipoMidia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DAOTipoMidia {
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    private DAOTipoMidia dTipoMidia = new DAOTipoMidia();
    
    public void insert(TipoMidia a ){
        String comando  = "Insert Into TipoDeMidia (id, tipoDeMidia) values (?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, a.getIdTipo());
            enviaComando.setString(2, a.getTipoMidia());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado");
            
            enviaComando.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Abobrinha" + e.getMessage());
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
            JOptionPane.showMessageDialog(null, "Registro Atualizado");
            
            enviaComando.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não atualizado" + e.getMessage());
        }
        
    }
    
}
