package br.com.filmes.model;

public enum Status {
    NAOCOMECEI,
    ASSISTINDO,
    ASSISTIDO;

    public static Status escolherStatus(int op){
        switch (op){
            case 1:
                return Status.ASSISTIDO;
            case 2:
                return Status.ASSISTINDO;
            case 3:
                return Status.NAOCOMECEI;
            default:
                throw new IllegalArgumentException("Opção Inválida!");
        }

    }

}
