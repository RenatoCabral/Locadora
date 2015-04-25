package estudos;

import java.util.List;
import javax.swing.JOptionPane;

public class CadastroProdutos {
    private int Codigo;
    private String descricao;
    private double vlCompra;
    private String idioma;
    private String legenda;
    private Fornecedor fornecedor;
    private List<TipoMidia> TipoDeMidia;
    private String observacao;
    private String status;
    
    public CadastroProdutos(){
    
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getVlCompra() {
        return vlCompra;
    }

    public void setVlCompra(double vlCompra) {
        this.vlCompra = vlCompra;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<TipoMidia> getTipoDeMidia() {
        return TipoDeMidia;
    }

    public void setTipoDeMidia(List<TipoMidia> TipoDeMidia) {
        this.TipoDeMidia = TipoDeMidia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    //METODOS
    
    public void ExibeCadastroProdutos(){
        JOptionPane.showMessageDialog(null, "Código: " + getCodigo() + 
                                            "\n" + "Descrição:" +getDescricao()+
                                            "\n" + "Valor da Compra:" + getVlCompra()+
                                            "\n" +  "Idioma:" + getIdioma()+
                                            "\n" + "Legenda:" + getLegenda()+
                                            "\n" + "Observacao:" + getObservacao()+
                                            "\n" + "Status:" + getStatus());
    }
    
    public void ExibeCadastroFornecedor(){
    }
}
