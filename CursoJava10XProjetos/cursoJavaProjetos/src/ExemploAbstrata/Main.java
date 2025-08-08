package ExemploAbstrata;

public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Rex");

        cachorro.emitirSom();

        Animal gato = new Gato("gat");
        gato.emitirSom();
    }
}
