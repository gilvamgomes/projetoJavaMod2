package util;
import java.util.ArrayList;
import modelo.Aluno;
import modelo.Funcionario;

public class BancoDeDados {
    private static final ArrayList<Aluno> alunos = new ArrayList();
    private static final ArrayList<Funcionario> funcionarios = new ArrayList();
    
    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public static void adicionar (Aluno aluno) {
        alunos.add(aluno);
    }
    
    public static void adicionar (Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public static boolean excluirAluno(int indice) {
        if (indice < 0 || indice >= alunos.size()){
            return false;
        }
        alunos.remove(indice);
        return true;
    }
    
    public static boolean excluirFuncionario(int indice) {
        if (indice < 0 || indice >= funcionarios.size()){
            return false;
        }
        funcionarios.remove(indice);
        return true;
    }
    
}
