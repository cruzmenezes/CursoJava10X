package ExemploAbstrata;

abstract class Animal {

    String nome;

    //construtor
    public Animal(String nome){
        this.nome = nome;
    }

    // metodo abstrato - obrigatorio ser implementado nas subclasses

    public abstract void emitirSom();

    public  void dormir(){
        System.out.println(nome + " esta dormindo...");
    }
}
