package ExemplosPolimorfismo;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        //this.nome = nome;
        //this.salarioBase = salarioBase;
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.05;
    }
}
