import model.Biblioteca;
import model.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Deseja ver a lista de livros disponíveis? (SIM/NÃO)");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("SIM")) {
                biblioteca.listarLivrosDisponiveis();

                System.out.println("Digite o id do livro que deseja emprestar:");

                if (scanner.hasNextInt()) {
                    int idEscolhido = scanner.nextInt();
                    scanner.nextLine();

                    Livro livroEscolhido = biblioteca.buscarLivroPorId(idEscolhido);

                    if (livroEscolhido == null) {
                        System.out.println("Código identificador não encontrado.");
                    } else if (!livroEscolhido.isDisponivel()) {
                        System.out.println("Livro já está emprestado.");
                    } else {
                        System.out.println("Digite seu nome:");
                        String nomeCliente = scanner.nextLine();
                        biblioteca.realizarEmprestimo(idEscolhido, nomeCliente);
                    }

                } else {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    scanner.nextLine();
                }
            }

        } while (resposta.equalsIgnoreCase("SIM"));

        System.out.println("Valeu! Obrigado e volte sempre!");
        scanner.close();
    }
}