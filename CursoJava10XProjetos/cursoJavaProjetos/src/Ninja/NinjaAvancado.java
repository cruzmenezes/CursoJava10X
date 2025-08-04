package Ninja;

public class NinjaAvancado implements Ninja {
    private String nome;
    private int idade;
    private String habilidade;
    private String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja Avançado:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executa a habilidade: " + habilidade + " com especialidade: " + especialidade);
    }
}

