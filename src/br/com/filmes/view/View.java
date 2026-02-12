package br.com.filmes.view;

import br.com.filmes.controller.ControleDeFilmes;
import br.com.filmes.model.Filme;
import br.com.filmes.model.Status;

import java.util.Scanner;

public class View {

    Scanner leitor = new Scanner(System.in);
    ControleDeFilmes controle = new ControleDeFilmes();

    public void menu() {
        int op = 0;
        do {
            System.out.println("\n----LISTA DE FILMES-----\n");
            System.out.println("1)Adicionar Filme");
            System.out.println("2)Alterar Status");
            System.out.println("3)Listar Meus Filmes");
            System.out.println("4)Listar por Gênero");
            System.out.println("5)Listar Assistidos");
            System.out.println("6)Listar Não Concluídos");
            System.out.println("7)Marcar como Favorito");
            System.out.println("8)Listar Favoritos");
            System.out.println("0)Sair");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Nome do Filme: ");
                    String nome = leitor.nextLine();
                    System.out.print("Gênero: ");
                    String genero = leitor.nextLine();
                    System.out.println();
                    System.out.println("Escolha o Status Atual:");
                    System.out.println("""
                            1)ASSISTIDO
                            2)ASSISTINDO
                            3)NÃO COMECEI
                            """);
                    int statusOpcao = leitor.nextInt();
                    leitor.nextLine();
                    Status statusFilme = Status.escolherStatus(statusOpcao);
                    Filme filme = new Filme(nome, statusFilme, genero);
                    controle.adicionarFilme(filme);
                    System.out.println("Filme Adicionado!");
                    break;

                case 2:
                    System.out.println("De que filme deseja alterar o status?");
                    String nomeAlterar = leitor.nextLine();
                    System.out.println("""
                            1)ASSISTIDO
                            2)ASSISTINDO
                            3)NÃO COMECEI
                            """);
                    int statusAlterar = leitor.nextInt();
                    leitor.nextLine();
                    Status novoStatus = Status.escolherStatus(statusAlterar);
                    break;

                case 3:
                    System.out.println("Minha Lista de Filmes");
                    controle.listarFilmes();
                    break;

                case 4:
                    System.out.print("Informe o Gênero: ");
                    String generoBuscado = leitor.nextLine();
                    controle.listarPorGenero(generoBuscado);
                    break;

                case 5:
                    System.out.println("Filmes Assistidos");
                    controle.listarConcluidos();
                    break;

                case 6:
                    System.out.println("Filmes Não Concluídos");
                    controle.listarNaoConcluidos();
                    break;

                case 7:
                    System.out.print("Informe o Filme que deseja favoritar: ");
                    String filmeFavoritar = leitor.nextLine();
                    controle.marcarComoFavorito(filmeFavoritar);
                    break;

                case 8:
                    System.out.println("Filmes Favoritos");
                    controle.listarFavoritos();
                    break;

                default:
                    System.out.println("Opção inválida!");




            }


        } while (op != 0);
    }


}
