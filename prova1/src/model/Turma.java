package model;

import java.util.ArrayList;

public class Turma {
    private String edicao;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList();

    public Turma(String edicao, Professor professor) {
        this.edicao = edicao;
        this.professor = professor;
    }

    public Turma() {
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
    public void addAluno(Aluno alunos){
        this.alunos.add(alunos);
    }
    
    
}
