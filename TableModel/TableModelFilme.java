package TableModel;

import Classes.Filmes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;



public class TableModelFilme extends AbstractTableModel{
    
    private static final int Col_Id = 0;
    private static final int Col_Descricao = 1;
    private static final int Col_Idioma = 2;
    private static final int Col_Legenda = 3;
    private static final int Col_Observacao = 4;
    private static final int Col_ValorCompra = 5;
    private static final int Col_Quantidade = 6;
    
    private List<Filmes> tipos;
    
    public TableModelFilme(){
    
    }
    
    public TableModelFilme(List<Filmes> tipos){
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
       Filmes f = tipos.get(rowIndex);
       if(columnIndex == Col_Id){
           return f.getId();
       }else if(columnIndex == Col_Descricao){
           return f.getDescricao();
       }else if(columnIndex == Col_Idioma){
           return f.getIdioma();
       }else if(columnIndex == Col_Legenda){
           return f.getLegenda();
       }else if(columnIndex == Col_Observacao){
           return f.getObservacao();
       }else if(columnIndex == Col_ValorCompra){
           return f.getVlCompra();
       }else if(columnIndex == Col_Quantidade){
           return f.getQuantidade();
           
       }
       return "";
    }
    
    @Override
    public String getColumnName(int column){
        if(column == Col_Id)
            return "Id";
        if(column == Col_Descricao)
            return "Descricao";
        if(column == Col_Idioma)
            return "Idioma";
        if(column == Col_Legenda)
            return "Legenda";
        if(column == Col_Observacao)
            return "Observação";
        if(column == Col_ValorCompra)
            return "Valor Compra";
        if(column == Col_Quantidade)
            return "Quantidade";
        return "";
    }
    
    public Filmes getFilmes(int linha){
        return tipos.get(linha);
    }

    public void removeRow(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeTableModelListener(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
