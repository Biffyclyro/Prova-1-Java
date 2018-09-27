package model;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String curso;
    private ArrayList<Turma> turmas= new ArrayList();

    public Disciplina(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public void addTurma(Turma turmas){
        this.turmas.add(turmas);
    }
}
