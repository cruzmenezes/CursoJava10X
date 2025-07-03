package ExemplosPolimorfismo;


// Pessoa.java
public class Pessoa extends Departamento {
    private String nome;
    private String cargo;

    public Pessoa(String nome, String cargo, String nomeDepartamento) {
        super(nomeDepartamento);
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String getDescricao() {
        return "Pessoa do departamento: " + nomeDepartamento;
    }
}
