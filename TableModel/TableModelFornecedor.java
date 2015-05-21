package TableModel;

import Classes.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TableModelFornecedor extends AbstractTableModel{
    
    private static final int Col_Id = 0;
    private static final int Col_NomeFantasia = 1;
    private static final int Col_Cnpj = 2;
    private static final int Col_Telefone = 3;
    private static final int Col_Email = 4;
    private static final int Col_Endereco = 5;
    private static final int Col_Cidade = 6;
    
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
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor f = tipos.get(rowIndex);
        if(columnIndex == Col_Id){
            return f.getIdFornecedor();
        }if(columnIndex == Col_NomeFantasia){
            return f.getNomeFantasia();
        }if(columnIndex == Col_Endereco){
            return f.getEndereco();
        }if(columnIndex == Col_Cnpj){
            return f.getCnpj();
        }if(columnIndex == Col_Telefone){
            return f.getTelefone();
        }if(columnIndex == Col_Email){
            return f.getEmail();
        }
        return "";
    }
            
    @Override
    public String getColumnName(int column){
        if(column == Col_Id)
            return "Id";
        if(column == Col_NomeFantasia)
            return "Nome Fantasia";
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
