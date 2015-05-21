package Classes;

public class TipoMidia {
   
    private int id;
    private String TipoMidia;

    public TipoMidia(int id, String TipoMidia) {
        this.id = id;
        this.TipoMidia = TipoMidia;
    }

    public TipoMidia() {
        
    }

    public int getIdTipo() {
        return id;
    }

    public void setIdTipo(int IdTipo) {
        this.id = IdTipo;
    }

    public String getTipoMidia() {
        return TipoMidia;
    }

    public void setTipoDeMidia(String TipoMidia) {
        this.TipoMidia = TipoMidia;
    }

    @Override
    public String toString() {
        return TipoMidia;
    }
    
    
    
    
    
    
    
}
