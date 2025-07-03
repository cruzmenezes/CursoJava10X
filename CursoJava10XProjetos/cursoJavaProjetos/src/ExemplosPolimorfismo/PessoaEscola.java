package ExemplosPolimorfismo;

public class PessoaEscola {

    protected  String nome;
    protected String cpf;

    public void PessoaEscola(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String exibirInformacoes(){
        return "pessoa comum" + nome;
    }


}
