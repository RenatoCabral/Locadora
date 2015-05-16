package TableModel;

import Classes.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TableModelFornecedor extends AbstractTableModel{
    
    private static final int Col_Id = 0;
    private static final int Col_NomeFanstasia = 1;
    private static final int Col_Cnpj = 2;
    private static final int Col_Telefone = 3;
    private static final int Col_Endereco = 4;
    private static final int Col_Cidade = 5;
    private static final int Col_Email = 6;
    
     private List<Fornecedor> tipos;
     
     public TableModelFornecedor(){
    
    }
     
     public TableModelFornecedor(List<Fornecedor> tipos){
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
        Fornecedor f = tipos.get(rowIndex);
        if(columnIndex == Col_Id){
            return f.getIdFornecedor();
        }else if(columnIndex == Col_NomeFanstasia){
            return f.getNomeFantasia();
        }else if(columnIndex == Col_Endereco){
            return f.getEndereco();
        }else if(columnIndex == Col_Cnpj){
            return f.getEndereco();
        }else if(columnIndex == Col_Telefone){
            return f.getTelefone();
        }else if(columnIndex == Col_Email){
            return f.getEmail();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if(column == Col_Id)
            return "Id";
        if(column == Col_NomeFanstasia)
            return "Nome Fanstasia";
        if(column == Col_Cidade)
            return "Cidade";
        if(column == Col_Cnpj)
            return "CNPJ";
        if(column == Col_Email)
            return "Email";
        if(column == Col_Endereco)
            return "Endereco";
        if(column == Col_Telefone)
            return "Telefone";
        return "";             
    }
    
    public Fornecedor getFornecedor(int linha){
        return tipos.get(linha);
    }
    
    
    
}
