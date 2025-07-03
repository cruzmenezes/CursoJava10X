package ExemplosPolimorfismo;

public class AlunoEscola extends PessoaEscola{

    private String matricula;

    public AlunoEscola(String nome, String cpf, String matricula){
        //super(nome, cpf);
        this.nome = nome;
        this.cpf = cpf;
        this.matricula =matricula;

    }
    @Override
    public  String exibirInformacoes(){
        return  "Aluno: " + nome + "Matricula: " + matricula;
    }
}
