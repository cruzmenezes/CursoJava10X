package ExemplosHeranca;

public class Professor extends Pessoa {

    String diciplina;

    @Override
    public void apresentar() {
        System.out.println("Olá eu sou o Professor dessa escola, meu nome é: " + nome);
        System.out.println("Tenho: " + idade + " idade.");

    }
}
