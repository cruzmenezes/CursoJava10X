package ExemplosHeranca;

public class Aluno extends Pessoa {

    String curso;

    @Override
    public void apresentar() {
        System.out.println("Olá eu sou um aluno, meu nome é: " + nome);
        System.out.println("Tenho: " + idade + " idade.");
    }
}
