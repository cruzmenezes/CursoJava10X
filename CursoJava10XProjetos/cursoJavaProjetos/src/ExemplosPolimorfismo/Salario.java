package ExemplosPolimorfismo;

// Salario.java
public class Salario {
    private Pessoa pessoa;
    private double valorBase;

    public Salario(Pessoa pessoa, double valorBase) {
        this.pessoa = pessoa;
        this.valorBase = valorBase;
    }

    public double calcularSalario() {
        if (pessoa.getCargo().equalsIgnoreCase("Gerente")) {
            return valorBase + 2000;
        } else if (pessoa.getCargo().equalsIgnoreCase("Analista")) {
            return valorBase + 1000;
        } else {
            return valorBase;
        }
    }

    public void imprimirResumo() {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Cargo: " + pessoa.getCargo());
        System.out.println("Departamento: " + pessoa.getDescricao());
        System.out.println("Salário: R$ " + calcularSalario());
        System.out.println("----------------------------");
    }
}
