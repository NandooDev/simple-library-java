package entrega1.poo.test;

import entrega1.poo.domain.Livro;
import entrega1.poo.domain.Metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class LivroTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

        Metodos metodos = new Metodos();

        int opcao = 0;

        System.out.println("-----BEM VINDO À LIVRARIA JAVINHA-----\n");

        while (opcao != 5) {
            System.out.println("1 - Adicionar novo livro");
            System.out.println("2 - Pesquisar livro pelo nome");
            System.out.println("3 - Excluir livro pelo nome");
            System.out.println("4 - Exibir todos os livros");
            System.out.println("5 - Sair do sistema\n");
            System.out.println("Qual opção você deseja? ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro:");
                    String nome = sc.nextLine();

                    System.out.println("Digite o autor do livro:");
                    String autor = sc.nextLine();

                    livros.add(metodos.addLivro(nome, autor));
                    break;
                case 2:
                    System.out.println("Digite o nome do livro a ser buscado:");
                    String buscarLivroNome = sc.nextLine();

                    metodos.buscarLivroPorNome(buscarLivroNome, livros);
                    break;
                case 3:
                    System.out.println("Digite o nome do livro a ser excluído:");
                    String excluirLivroNome = sc.nextLine();

                    livros = metodos.excluirLivroPorNome(excluirLivroNome, livros);
                    break;
                case 4:
                    metodos.exibirLivros(livros);
                    break;
            }
        }

        System.out.println("\n-----VOLTE SEMPRE À JAVINHA LIVRARIA-----");

    }
}
