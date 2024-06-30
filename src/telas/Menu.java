package telas;
import util.Tela;
import modelo.Aluno;
import modelo.Funcionario;
import util.BancoDeDados;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        String opcoes = "Selecione uma das op��es abaixo: \n\n"
               + "1 - Cadastrar Funcion�rio\n"
               + "2 - Listar Funcion�rios\n"
               + "3 - Excluir Funcion�rio\n"
               + "4 - Cadastrar Aluno\n"
               + "5 - Listar Alunos\n"
               + "6 - Excluir Aluno\n"
               + "7 - Sair"; 
        int opcaoSelecionada;
        do {
            opcaoSelecionada = Tela.nextInt(opcoes);
            switch (opcaoSelecionada){
                case 1: cadastrarFuncionarios(); break;
                case 2: listarFuncionario(); break;
                case 3: excluirFuncionario(); break;
                case 4: cadastrarAluno(); break;
                case 5: listarAlunos(); break;
                case 6: excluirAluno(); break;
                case 0: case 7: Tela.exibirMensagem("Volte Sempre!"); break;
                default: Tela.exibirMensagem("Op��o inv�lida!");
            }
        } while (opcaoSelecionada != 0 && opcaoSelecionada != 7);      
    }

    public static void cadastrarFuncionarios(){
        //Tela.exibirMensagem("Cadastro de Funcion�rio");
        Funcionario f = new Funcionario();
        f.setNome(Tela.nextString("Digite o nome do funcion�rio"));
        f.setEndereco(Tela.nextString("Digite o endere�o"));
        f.setDataNascimento(Tela.nextDate("Digite a data de nascimento"));
        f.setSalarioBase(Tela.nextDouble("Digite o sal�rio"));
        f.setImposto(Tela.nextDouble("Digite o percentual de imposto"));
        BancoDeDados.adicionar(f);
        Tela.exibirMensagem("Funcin�rio inserido!");   
    }
    public static void listarFuncionario(){
        if (BancoDeDados.getFuncionarios().isEmpty()){
            Tela.exibirMensagem("Nenhum funcion�rio cadastrado!");
        } else {
            //Tela.exibirMensagem("Listar Funcion�rios");
            String lista = "";
            for (Funcionario f : BancoDeDados.getFuncionarios()){
                lista += f.toString() + "\n";
            }
            Tela.exibirMensagem(lista);
        }    
    }
    public static void excluirFuncionario(){
        ArrayList<Funcionario> funcionarios = BancoDeDados.getFuncionarios();
        if (funcionarios.isEmpty()){
            Tela.exibirMensagem("Nenhum funcion�rio cadastrado");
        } else {
            String lista = "Informe o c�digo do funcion�rio para excluir: \n";
            for (int i = 0; i < funcionarios.size(); i++){
                lista += (i+1) + " - " + funcionarios.get(i).getNome() + "\n";
            }
            
            int codigo = Tela.nextInt(lista);
            if (BancoDeDados.excluirFuncionario(codigo-1)){
                Tela.exibirMensagem("Funcion�rio exclu�do com sucesso!");
            } else if (codigo != 0){
                Tela.exibirMensagem("C�digo inv�lido!");
                excluirFuncionario();
                
            }
        }
    }
    
    public static void cadastrarAluno(){
        Aluno a = new Aluno();
        a.setNome(Tela.nextString("Digite o nome do aluno"));
        a.setEndereco(Tela.nextString("Digite o endere�o"));
        a.setDataNascimento(Tela.nextDate("Digite a data de nascimento"));
        a.setNota1(Tela.nextDouble("Nota 1"));
        a.setNota2(Tela.nextDouble("Nota 2"));
        BancoDeDados.adicionar(a);
        Tela.exibirMensagem("Aluno inserido com sucesso!");
    }
    public static void listarAlunos(){
        if (BancoDeDados.getAlunos().isEmpty()){
            Tela.exibirMensagem("Nenhum aluno cadastrado!");
        } else {
            String lista = "";
            for (Aluno a : BancoDeDados.getAlunos()){
                lista += a.toString() + "\n";
            }
            Tela.exibirMensagem(lista);
        }
    }
    public static void excluirAluno(){
        ArrayList<Aluno> alunos = BancoDeDados.getAlunos();
        if (alunos.isEmpty()){
            Tela.exibirMensagem("Nenhum aluno cadastrado!");
        } else {
            String lista = "Informe o c�digo do aluno para excluir: \n";
            for (int i = 0; i < alunos.size(); i++){
                lista += (i+1) + " - " + alunos.get(i).getNome() + "\n";
            }
            
            int codigo = Tela.nextInt(lista);
            if (BancoDeDados.excluirAluno(codigo-1)){
                Tela.exibirMensagem("Aluno exclu�do com sucesso!");
            } else if (codigo != 0){
                Tela.exibirMensagem("C�digo inv�lido!");
                excluirAluno();
            }
        }
   
    }
}


