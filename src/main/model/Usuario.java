package model;

public class Usuario {

    private String nome;
    private boolean assinante;

    public Usuario(
            String nome,
            boolean assinante
    ) {
        this.nome = nome;
        this.assinante = assinante;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAssinante() {
        return assinante;
    }
}