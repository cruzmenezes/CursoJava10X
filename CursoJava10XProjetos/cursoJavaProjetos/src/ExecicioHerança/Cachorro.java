package ExecicioHerança;

public class Cachorro extends Animal{

    String nome;
    @Override
    public void emitirSom() {
        System.out.println("qual som que o cachorro " + nome);
    }

}

