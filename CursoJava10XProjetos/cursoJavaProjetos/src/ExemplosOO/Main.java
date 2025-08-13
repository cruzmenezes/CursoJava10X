package ExemplosOO;

public class Main {
    public static void main(String[] args) {

        Carro fusca = new Carro();
        fusca.marca = "vw";
        fusca.modelo = "fusca";
        fusca.ano = 1982;

        fusca.acelerar();
        fusca.exibirInf();

        System.out.println("-------------");

        Carro fiesta = new Carro();
        fiesta.marca = "fiat";
        fiesta.modelo = "fiesta";
        fiesta.ano = 2000;

        fiesta.acelerar();
        fiesta.exibirInf();
    }
}
