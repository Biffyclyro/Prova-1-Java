package model;

public class Professor {
    private String nome;
    private int siape;

    public Professor(String nome, int siape) {
        this.nome = nome;
        this.siape = siape;
    }

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }
    
    
}
