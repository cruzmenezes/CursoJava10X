package ExemplosPolimorfismo;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase){
        //this.nome = nome;
        //this.salarioBase = salarioBase;
        super(nome, salarioBase);
    }

    @Override
    public  double calcularBonus(){
        return salarioBase * 0.20;

    }



}
