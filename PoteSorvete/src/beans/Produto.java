package beans;

public class Produto {

    private String nome;
    private String marca;
    private Double valor;
    private boolean promocao;

    // construtores
    public Produto() {
    }

    public Produto(String nome, double Valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Produto(String nome, double Valor, String marca){
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
    }

    public Produto(String nome, double Valor, String marca, boolean promocao) {
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
        this.promocao=promocao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public String detalhes() {
        return "Produto{" +
                "nome='" + this.nome + '\'' +
                ", marca='" + this.marca + '\'' +
                ", valor=" + this.valor +
                ", promocao=" + this.promocao +
                '}';
    }


}
