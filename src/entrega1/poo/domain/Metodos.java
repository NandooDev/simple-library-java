package entrega1.poo.domain;

import java.util.ArrayList;

public class Metodos {

    public void exibirLivros(ArrayList<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("\nNenhum livro cadastrado\n");
        } else {
            for (Livro livro : livros) {
                System.out.println("----------------------------");
                System.out.printf("Nome: %s\nAutor: %s\n", livro.nome, livro.autor);
                System.out.println("----------------------------");
            }
        }
    }

    public Livro addLivro(String nome, String autor) {
        System.out.println("\nLivro adicionado com sucesso!\n");
        return new Livro(nome, autor);
    }

    public void buscarLivroPorNome(String nome, ArrayList<Livro> livros) {
        Boolean yesOrNot = false;

        for (Livro livro : livros) {
            if (nome.equalsIgnoreCase(livro.nome)) {
                System.out.println("----------------------------");
                System.out.printf("Nome: %s\nAutor: %s\n", livro.nome, livro.autor);
                System.out.println("----------------------------");

                yesOrNot = true;
            }

            if (yesOrNot) return;
        }

        System.out.println("\nLivro não encontrado!\n");
    }

    public ArrayList<Livro> excluirLivroPorNome(String nome, ArrayList<Livro> livros) {
        Boolean yesOrNot = false;

        for (Livro livro : livros) {
            if (nome.equalsIgnoreCase(livro.nome)) {
                System.out.println("\nLivro excluído com sucesso!\n");

                livros.remove(livro);

                yesOrNot = true;
            }

            if (yesOrNot) return livros;
        }

        System.out.println("\nLivro não encontrado!\n");

        return livros;
    }

}
