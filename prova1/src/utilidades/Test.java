package utilidades;

import model.Aluno;
import model.Disciplina;
import model.Professor;
import model.Turma;

public class Test {
    public static void main(String args[]){
        Professor p1 = new Professor("Alencar", 1234567);
        Aluno a1 = new Aluno(201810333, "João Senna");
        Aluno a2 = new Aluno(201815222, "Ewerton");
        Aluno a3 = new Aluno(201712233, "Iris Balk");
        Aluno a4 = new Aluno(201810433, "William Trindade");
        Aluno a5 = new Aluno(201812833, "Arthur Manfra");
        
        Aluno b1 = new Aluno(201810222, "Fulano da silva");
        Aluno b2 = new Aluno(201815542, "Ciclano");
        Aluno b3 = new Aluno(201712276, "Beltrano");
        Aluno b4 = new Aluno(201810873, "Mariano");
        Aluno b5 = new Aluno(201812998, "Geminiano");
        
        
        Turma t1 = new Turma("2018/2", p1);
        t1.addAluno(a1);
        t1.addAluno(a2);
        t1.addAluno(a3);
        t1.addAluno(a4);
        t1.addAluno(a5);
        
        Turma t2 = new Turma("2019/2", p1);
        t2.addAluno(b1);
        t2.addAluno(b2);
        t2.addAluno(b3);
        t2.addAluno(b4);
        t2.addAluno(b5);
        
        
        Disciplina d1 = new Disciplina("Programção Orientada a Objetos", "Sistemas para internet");
        d1.addTurma(t1);
        d1.addTurma(t2);
        
        
       imprimeDisciplina(d1);
        
        
    }
    private static void imprimeAlunos(Turma x){
        System.out.println("Turma edicão: " + x.getEdicao()); 
        System.out.println("Professor: "+x.getProfessor().getNome()); 
        System.out.println("Alunos");        
        x.getAlunos().forEach(alunos->System.out.println(alunos.getNome()+ " Matricula: "+ alunos.getMatricula()));
        System.out.println("");
        
        
    }
    
    private static void imprimeDisciplina(Disciplina x){
        System.out.println("Disciplina: "+x.getNome());
        System.out.println("Curso: "+ x.getCurso());
        System.out.println("");
        for(Turma turmas : x.getTurmas()){            
                       
            imprimeAlunos(turmas);
            
        }
        System.out.println("");
        
    }
}
