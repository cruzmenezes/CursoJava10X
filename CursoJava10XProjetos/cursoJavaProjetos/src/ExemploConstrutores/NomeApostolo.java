package ExemploConstrutores;

public class NomeApostolo {
        String nome;
        int idade;
        boolean foiMatirizado;

        public NomeApostolo(String nome){
                this.nome = nome;
        }

        public NomeApostolo(int idade){
                this.idade = idade;
        }

        public NomeApostolo(boolean foiMatirizado){
                this.foiMatirizado = foiMatirizado;
        }

        public NomeApostolo(String nome, int idade, boolean foiMatirizado){
                this.nome = nome;
                this.idade = idade;
                this.foiMatirizado = foiMatirizado;
        }

}
