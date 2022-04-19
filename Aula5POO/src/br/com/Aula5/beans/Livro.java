package br.com.Aula5.beans;

import br.com.Aula5.interfaces.PadraoImposto;

public class Livro extends Produto  {

    private String isbn;
    private String autor;

    public Livro(int codigo, double preco, String descricao, String isbn, String autor) {
        super(codigo, preco, descricao);
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String detalhes() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                "} " + super.detalhes();
    }

}
