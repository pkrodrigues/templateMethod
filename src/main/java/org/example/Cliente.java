package org.example;

public abstract class Cliente {

    private int id;
    private String nome;
    private boolean status;
    private int avaliacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public abstract String verificarChekin();

    public String getTipo(){
        return "Cliente";
    }

    public String getInfo()
    {
        return getTipo() + "{" + "id=" + this.id + ", nome='" + this.nome + '\'' + ", Status do chekin="+this.verificarChekin() + '}';
    }

}
