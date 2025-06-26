package ExemplosHeranca;

public class PrincipalPessoaAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
            aluno.nome = "Edson";
            aluno.idade = 44;
            aluno.curso = "Developer Java";

            aluno.apresentar();

        System.out.println("==================");

        Professor professor = new Professor();

        professor.nome = "Victor";
        professor.idade = 43;
        professor.diciplina = "Engenharia";

        professor.apresentar();





    }
}
