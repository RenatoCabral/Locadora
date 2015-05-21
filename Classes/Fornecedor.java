package Classes;

public class Fornecedor {
    
    private int idFornecedor;
    private String nomeFantasia;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String telefone;
    private String email;

    public Fornecedor(int idFornecedor, String nomeFantasia, String cnpj, String endereco, String cidade, String telefone,String email) {
        this.idFornecedor = idFornecedor;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.cidade = cidade;
        this.telefone = telefone;
        this.email = email;
    }

    public Fornecedor() {
        
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nomeFantasia;
    }

    
    
}
