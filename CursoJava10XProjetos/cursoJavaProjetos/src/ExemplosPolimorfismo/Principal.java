package ExemplosPolimorfismo;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", "Gerente", "Financeiro");
        Pessoa p2 = new Pessoa("João", "Analista", "TI");
        Pessoa p3 = new Pessoa("Ana", "Assistente", "RH");

        Salario s1 = new Salario(p1, 5000);
        Salario s2 = new Salario(p2, 4000);
        Salario s3 = new Salario(p3, 3000);

        s1.imprimirResumo();
        s2.imprimirResumo();
        s3.imprimirResumo();
    }
}