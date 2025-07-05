package ExemplosPolimorfismo;

public class PrincipalFuncionario {

    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[]{
                new Gerente("Edson", 8000),
                new Analista("Maria", 5000),
                new Estagiario("João", 2000)
        };
        for (Funcionario f: funcionario){
            System.out.println("Nome: " + f.getNome());
            System.out.println("Bonus: " + f.calcularBonus());
            System.out.println("----------------------------");
        }
    }
}
