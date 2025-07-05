package ExemplosPolimorfismo;

public class Analista extends Funcionario {

    public Analista(String nome, double salarioBase) {
        //this.nome = nome;
        //this.salarioBase = salarioBase;
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }
}
