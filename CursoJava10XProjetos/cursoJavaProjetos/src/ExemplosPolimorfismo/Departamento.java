package ExemplosPolimorfismo;

// Departamento.java
public class Departamento {
    protected String nomeDepartamento;

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getDescricao() {
        return "Departamento genérico";
    }
}
