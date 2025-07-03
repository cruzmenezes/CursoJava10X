package ExemplosPolimorfismo;

public class PrincipalEscola {
    public static void main(String[] args) {
        PessoaEscola[] pessoas = new  PessoaEscola[3];
        pessoas[0] = new AlunoEscola("Edson victor ", "111.222.333-44 ", "A123");
        pessoas[1] = new AlunoEscola("Victor cruz ", "222.222.333-44 ", "A234");
        pessoas[2] = new AlunoEscola("Edson victor ", "333.111.333-44 ", "A345");


        for(PessoaEscola p: pessoas){
            System.out.println(p.exibirInformacoes());
        }
    }


}
