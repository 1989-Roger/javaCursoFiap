package br.com.Aula07.beans;

public class Livro implements Comparable<Livro> {

    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private double preco;

    public Livro() {}

    public Livro(String titulo, String autor, String isbn, int paginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "\n"+ titulo  +
                " - R$" + preco ;

    }
    @Override
    public int compareTo(Livro outroLivro){
        return this.titulo.compareToIgnoreCase(outroLivro.getTitulo());
    }
}
