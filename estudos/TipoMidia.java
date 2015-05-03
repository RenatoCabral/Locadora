package estudos;

public class TipoMidia {
   
    private int IdTipo;
    private String TipoMidia;

    public TipoMidia(int Id, String TipoMidia) {
        this.IdTipo = IdTipo;
        this.TipoMidia = TipoMidia;
    }

    public TipoMidia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(int IdTipo) {
        this.IdTipo = IdTipo;
    }

    public String getTipoMidia() {
        return TipoMidia;
    }

    public void setTipoDeMidia(String TipoMidia) {
        this.TipoMidia = TipoMidia;
    }
    
    
    
    
    
}
