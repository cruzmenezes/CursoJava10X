package ExemploAbstrata;

public class Cachorro extends Animal{
    public  Cachorro(String nome){
        super(nome);

    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " diz: au au....");
    }

    @Override
    public void dormir() {
        super.dormir();
    }
}
