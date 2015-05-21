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
       Filmes cf = new Filmes();
       if(columnIndex == Col_Id){
           return cf.getId();
       }else if(columnIndex == Col_Descricao){
           return cf.getDescricao();
       }else if(columnIndex == Col_Idioma){
           return cf.getIdioma();
       }else if(columnIndex == Col_Legenda){
           return cf.getLegenda();
       }else if(columnIndex == Col_Observacao){
           return cf.getObservacao();
       }else if(columnIndex == Col_ValorCompra){
           return cf.getVlCompra();
       }else if(columnIndex == Col_Quantidade){
           
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

    
}
