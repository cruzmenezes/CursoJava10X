package Ninja;
public class NinjaBasico implements Ninja {
        private String nome;
        private int idade;
        private String habilidade;

        public NinjaBasico(String nome, int idade, String habilidade) {
            this.nome = nome;
            this.idade = idade;
            this.habilidade = habilidade;
        }

        @Override
        public void mostrarInformacoes() {
            System.out.println("Ninja Básico:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Habilidade: " + habilidade);
        }

        @Override
        public void executarHabilidade() {
            System.out.println(nome + " executa a habilidade: " + habilidade);
        }
}


