package br.com.filmes.controller;

import br.com.filmes.model.Filme;
import br.com.filmes.model.Status;

import java.util.ArrayList;

public class ControleDeFilmes {

    ArrayList<Filme> listaDeFilmes = new ArrayList<>();

    public void adicionarFilme(Filme filme){
        listaDeFilmes.add(filme);
    }

    public String alterarStatus(String nome, Status novoStatus){
        for (Filme f: listaDeFilmes){
            if (f.getNome().equalsIgnoreCase(nome)){
                f.setStatus(novoStatus);
                return "br.com.filmes.model.Status Atualizado!";
            }
        }
        return "br.com.filmes.model.Filme não Encontrado!";
    }

    public void listarFilmes(){

            System.out.println(listaDeFilmes.toString());

    }
    public void listarPorGenero(String genero){
        for (Filme f: listaDeFilmes){
            if (f.getGenero().equalsIgnoreCase(genero)){
                System.out.println(f);
            } else {
                System.out.println("Nenhum filme com este gênero!");
            }
        }
    }
    public void listarConcluidos(){
        for (Filme f: listaDeFilmes){
            if (f.getStatus() == Status.ASSISTIDO){
                System.out.println(f);
            }
        }
    }
    public void listarNaoConcluidos(){
        for (Filme f: listaDeFilmes){
            if (f.getStatus() == Status.ASSISTINDO || f.getStatus() == Status.NAOCOMECEI){
                System.out.println(f);
            }
        }
    }

    public String marcarComoFavorito(String nome){
        for (Filme f: listaDeFilmes){
            if (f.getNome().equalsIgnoreCase(nome)){
                f.setFavorito(true);
                return "Marcado como Favorito!";
            }
        }
        return "br.com.filmes.model.Filme Não Encontrado!";
    }

   public void listarFavoritos(){
        for (Filme f: listaDeFilmes){
            if (f.isFavorito() == true){
                System.out.println(f);
            }
        }

   }

}
