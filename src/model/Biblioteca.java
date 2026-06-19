package model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();


    public Biblioteca() {
        Autor autor1 = new Autor(1, "Machado de Assis", LocalDate.of(1839, 6, 21));
        autores.add(autor1);

        Livro livro1 = new Livro(1, "Dom Casmurro", autor1, true, LocalDate.now(), LocalDate.now());
        livros.add(livro1);

        Autor autor2 = new Autor(2,"Edu Falaschi",  LocalDate.of(2001, 11, 13));
        autores.add(autor2);

        Livro livro2 = new Livro(2,"Rebirth",  autor2, true, LocalDate.now(), LocalDate.now());
        livros.add(livro2);

        Livro livro3 = new Livro(3,"Nova Era",  autor2, true, LocalDate.now(), LocalDate.now());
        livros.add(livro3);
    }

    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro.getId() + " - " + livro.getTitulo() +
                        " | Autor: " + livro.getAutor().getNome());
            }
        }
    }
}