package estudos;

import java.util.List;
import javax.swing.JOptionPane;

public class Locadora {
    private int CodigoLivro;
    private String descricao;
    private double vlCompra;
    private String idioma;
    private String legenda;
    private Fornecedor fornecedor;
    private List<TipoDeMidia> TipoDeMidia;
    private String observacao;
    private String status;
    
    public Locadora(){
    
    }

    public Locadora(int CodigoLivro, String descricao, double vlCompra, String idioma, String legenda, Fornecedor fornecedor, List<TipoDeMidia> TipoDeMidia, String observacao, String status) {
        this.CodigoLivro = CodigoLivro;
        this.descricao = descricao;
        this.vlCompra = vlCompra;
        this.idioma = idioma;
        this.legenda = legenda;
        this.fornecedor = fornecedor;
        this.TipoDeMidia = TipoDeMidia;
        this.observacao = observacao;
        this.status = status;
        this.fornecedor.getCidade();
        this.fornecedor.getCnpj();
        this.fornecedor.getEndereco();
        this.fornecedor.getNomeFantasia();
    }

    public int getCodigoLivro() {
        return CodigoLivro;
    }

    public void setCodigoLivro(int CodigoLivro) {
        this.CodigoLivro = CodigoLivro;
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

    public List<TipoDeMidia> getTipoDeMidia() {
        return TipoDeMidia;
    }

    public void setTipoDeMidia(List<TipoDeMidia> TipoDeMidia) {
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
    
    public void MostrarDados(){
        JOptionPane.showMessageDialog(null, "Código do livro: " + getCodigoLivro());
        JOptionPane.showMessageDialog(null, "Descrição:" + getDescricao());
        JOptionPane.showMessageDialog(null, "Valor da Compra:" + getVlCompra());
        JOptionPane.showMessageDialog(null, "Idioma:" + getIdioma());
        JOptionPane.showMessageDialog(null, "Legenda:" + getLegenda());
        JOptionPane.showMessageDialog(null, "Fornecedor:" + getFornecedor() );
        
        
    }
}
