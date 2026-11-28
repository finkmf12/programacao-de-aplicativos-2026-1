public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private String numero;

    public Endereco(String uf, String cidade, String cep, String logradouro, String numero) {
        setUf(uf);
        setCidade(cidade);
        setCep(cep);
        setLogradouro(logradouro);
        setNumero(numero);
    }

    public String getUf() { return uf; }
    public void setUf(String uf) {
        if (uf == null || !uf.matches("[A-Za-z]{2}")) throw new IllegalArgumentException("UF inválida.");
        this.uf = uf.toUpperCase();
    }
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) {
        if (cidade == null || cidade.isBlank()) throw new IllegalArgumentException("Cidade inválida.");
        this.cidade = cidade;
    }
    public String getCep() { return cep; }
    public void setCep(String cep) {
        if (cep == null || cep.isBlank()) throw new IllegalArgumentException("CEP inválido.");
        this.cep = cep;
    }
    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) {
        if (logradouro == null || logradouro.isBlank()) throw new IllegalArgumentException("Logradouro inválido.");
        this.logradouro = logradouro;
    }
    public String getNumero() { return numero; }
    public void setNumero(String numero) {
        if (numero == null || numero.isBlank()) throw new IllegalArgumentException("Número inválido.");
        this.numero = numero;
    }

    @Override
    public String toString() {
        return logradouro + ", " + numero + ", " + cidade + " - " + uf + ", CEP " + cep;
    }
}
