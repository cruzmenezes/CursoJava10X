package ExemploAbstrata;

public class Cavalo extends Animal{

    public Cavalo(String nome){
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " rim rim....");

    }





}
