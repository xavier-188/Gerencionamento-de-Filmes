package br.com.filmes.model;

public class Filme {
    private String nome;
    private String genero;
    private Status status;
    private boolean favorito;

    public Filme(String nome, Status status, String genero) {
        this.nome = nome;
        this.status = status;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return "\n\nFilme: " + nome +
                "\nGênero: " + genero +
                "\nStatus: " + status;
    }
}
