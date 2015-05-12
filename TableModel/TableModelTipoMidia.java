package TableModel;

import Classes.TipoMidia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelTipoMidia extends  AbstractTableModel{
    
    private static final int Col_Id = 0;
    private static final int Col_TipoMidia = 1;
    
    private List<TipoMidia> tipos;
    
    public TableModelTipoMidia(){
    
    }
    
    public TableModelTipoMidia(List<TipoMidia> tipos){
        this.tipos = new ArrayList<>(tipos);
    }

    @Override
    public int getRowCount() {
       return tipos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TipoMidia t = tipos.get(rowIndex);
        if(columnIndex == Col_Id){
            return t.getIdTipo();
        }else if(columnIndex == Col_TipoMidia){
            return t.getTipoMidia();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if(column == Col_Id)
            return "Id";
        if(column == Col_TipoMidia)
            return "Tipo Midia";
        return "";             
    }
    
    public TipoMidia getTipoMidia(int linha){
        return tipos.get(linha);
    }
    
}
