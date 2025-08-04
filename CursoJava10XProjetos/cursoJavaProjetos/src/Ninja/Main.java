package Ninja;

public class Main {
    public static void main(String[] args) {
        Ninja ninja1 = new NinjaBasico("Naruto", 15, "Clones das Sombras");
        Ninja ninja2 = new NinjaAvancado("Kakashi", 30, "Sharingan", "Chidori");

        ninja1.mostrarInformacoes();
        ninja1.executarHabilidade();

        System.out.println();

        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();
    }
}
