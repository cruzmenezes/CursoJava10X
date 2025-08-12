package ExemploAbstrata;

public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Rex");

        cachorro.emitirSom();
        cachorro.dormir();

        System.out.println("--------------");

        Animal gato = new Gato("gat");
        gato.emitirSom();
        gato.dormir();

        System.out.println("---------------");

        Animal cavalo = new Cavalo("Felix");
        cavalo.emitirSom();
        cavalo.dormir();

        System.out.println("----------------");

        Animal vaca = new Vaca("Mimosa");
        vaca.emitirSom();
        vaca.dormir();
    }
}
