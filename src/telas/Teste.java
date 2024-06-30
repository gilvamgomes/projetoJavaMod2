package telas;
import modelo.Aluno;
import modelo.Funcionario;

import util.Tela;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome(Tela.nextString("Digite o nome:"));
        aluno.setDataNascimento(Tela.nextDate("Digite a data de nascimento"));
        aluno.setEndereco(Tela.nextString("Digite o endereço:"));
        aluno.setNota1(Tela.nextDouble("Digite a nota 1"));
        aluno.setNota2(Tela.nextDouble("Digite a nota 2"));
        System.out.println(aluno);

        Funcionario f = new Funcionario();
        f.setNome(Tela.nextString("Digite o nome:"));
        f.setEndereco(Tela.nextString("Digite o endereço:"));
        f.setDataNascimento(Tela.nextDate("Digite a data de nascimento"));
        f.setSalarioBase(Tela.nextDouble("Digite o salário"));
        f.setImposto(Tela.nextDouble("Digite o imposto"));
        System.out.println(f);
        
        
    }
}
