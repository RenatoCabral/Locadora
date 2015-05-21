package Classes;

import java.util.List;

public class Filmes {
    private int id;
    protected int quantidade;
    private String descricao;
    private double vlCompra;
    private String idioma;
    private String legenda;
    private Fornecedor fornecedor;
    private TipoMidia TipoDeMidia;
    private String observacao;
    
    public Filmes(){
    
    }

    public Filmes(int id, int Quantidade, String descricao, double vlCompra, String idioma, String legenda, Fornecedor fornecedor, TipoMidia TipoDeMidia, String observacao) {
        this.id = id;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.vlCompra = vlCompra;
        this.idioma = idioma;
        this.legenda = legenda;
        this.fornecedor = fornecedor;
        this.TipoDeMidia = TipoDeMidia;
        this.observacao = observacao;
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

    public TipoMidia getTipoMidia() {
        return TipoDeMidia;
    }

    public void setTipoDeMidia( TipoMidia TipoDeMidia) {
        this.TipoDeMidia = TipoDeMidia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return descricao;
    }
       
}
