package atividade;

public class mainLivro {
    public static void main(String[] args) {
        classLivro Livro = new classLivro("null", "null", 123, 45.6);
        classLivro livros2 = new classLivro("nome", "editora", 123, 125.50);

        System.out.println(Livro.getNome());
        System.out.println(Livro.getAutor());
        System.out.println(Livro.getPreco());
        System.out.println(Livro.getnPag());
        System.out.println("----------------");
    }
}
