# 📚 Sistema de Empréstimo de Livros

![Java](https://img.shields.io/badge/Java-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen)

Sistema de console desenvolvido em Java para gerenciar o empréstimo de livros de uma biblioteca. Projeto criado como parte de um desafio de curso, com foco em prática de orientação a objetos: classes, objetos, listas e interação com o usuário via terminal.

## 📖 Sobre o projeto

O programa permite consultar os livros disponíveis para empréstimo e registrar o empréstimo de um livro escolhido pelo usuário. Este é um projeto de aprendizado, desenvolvido de forma incremental enquanto estudo conceitos de Java na prática.

## ✅ Funcionalidades

- [x] Modelagem das classes principais (`Autor`, `Livro`, `Emprestimo`, `Biblioteca`)
- [x] Listagem dos livros disponíveis no console
- [x] Registro de empréstimo de um livro
- [x] Loop interativo com o usuário (menu inicial)
- [x] Mensagem de despedida ao final da execução
- [x] Validação de entrada (id inválido, não numérico, livro já emprestado)

> **Nota de design:** segundo a especificação original, o programa deveria encerrar após a conclusão de um empréstimo. Optei por manter o loop ativo após o empréstimo, permitindo múltiplos empréstimos na mesma execução — uma decisão consciente de UX, divergindo levemente do enunciado original.

### 🚀 Próximos passos (evoluções futuras)

- [ ] Menu interativo com mais opções
- [ ] Cadastro de novos livros em tempo real
- [ ] Cadastro e gerenciamento de clientes
- [ ] Histórico de empréstimos por cliente
- [ ] Busca e filtro de livros por título, autor ou gênero

## 🛠 Tecnologias utilizadas

- Java (sem frameworks ou bibliotecas externas)
- IntelliJ IDEA

## ⚙️ Pré-requisitos

- JDK instalado (a versão configurada no projeto pode ser consultada em **File > Project Structure** no IntelliJ).

## ▶️ Como executar

Este é um projeto Java simples, sem gerenciador de dependências (Maven/Gradle), criado direto no IntelliJ IDEA.

1. Clone o repositório:
   ```sh
   git clone [link-do-repositorio]
   ```
2. Abra a pasta do projeto no IntelliJ IDEA.
3. Localize a classe `Main` e execute-a (botão ▶️ ao lado do método `main`, ou `Shift + F10`).

> Caso prefira rodar via terminal, é possível compilar e executar manualmente com `javac` e `java`, ajustando os caminhos dos pacotes — já que o projeto não usa build tool.

## 📂 Estrutura do projeto

```
src/
 ├─ model/
 │   ├─ Autor.java
 │   ├─ Livro.java
 │   ├─ Emprestimo.java
 │   └─ Biblioteca.java
 └─ Main.java
```

## 📄 Licença

Este projeto está sob a licença MIT — veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👤 Autor

Desenvolvido por Walid Arnous Alves como parte de um desafio de curso de Java.

[LinkedIn](https://www.linkedin.com/in/walid-arnous-alves-b5128927/) • [GitHub](#)
