package ExemploConstrutores;

public class PrincipalApostolo {
    public static void main(String[] args) {

        NomeApostolo apostolo = new NomeApostolo("Pedro");
        NomeApostolo apostoloIdade = new NomeApostolo(44);
        NomeApostolo apostoloVivoOuMorto = new NomeApostolo(true);

        NomeApostolo apostoloTodosArgumentos = new NomeApostolo("Andre", 56, true);

        System.out.println(apostolo.nome);
        System.out.println("Idade: " + apostoloIdade.idade);
        System.out.println("O Apostolo Pedro foi martirizado: " + apostoloVivoOuMorto.foiMatirizado);

        System.out.println("------------");
        System.out.println(apostoloTodosArgumentos.nome);



    }
}
