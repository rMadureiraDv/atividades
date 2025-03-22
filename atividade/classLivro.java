package atividade;

public class classLivro {
    private String nome,autor;
    private int nPag;
    private float Preco;

    public classLivro(String nome, String autor, int nPag, float Preco)
    {
        this.nome = nome;
        this.autor = autor;
        this.nPag = nPag;
        this.Preco = Preco;
    } 

    public String getAutor() {
        return autor;
    }
    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return Preco;
    }
    public int getnPag() {
        return nPag;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(float preco) {
        Preco = preco;
    }
    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

}
