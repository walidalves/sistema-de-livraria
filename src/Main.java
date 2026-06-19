import model.Biblioteca;
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
            }

        } while (resposta.equalsIgnoreCase("SIM"));
            System.out.println("Valeu! Obrigado");

        scanner.close();
    }
}