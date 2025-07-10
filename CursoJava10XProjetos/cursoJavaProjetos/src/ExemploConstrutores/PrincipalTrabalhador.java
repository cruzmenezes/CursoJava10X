package ExemploConstrutores;

public class PrincipalTrabalhador {
    public static void main(String[] args) {

        NomeTrabalhador trabalhador = new NomeTrabalhador("Edson", "Desenvolvedor");
        System.out.println("Nome: " + trabalhador.nome);
        System.out.println("Departamento: " + trabalhador.departamento);

        System.out.println("--------------");

        NomeTrabalhador trabalhador1 = new NomeTrabalhador("Victor", "Projetos");
        System.out.println("Nome: " + trabalhador1.nome);
        System.out.println("Departamento: " + trabalhador1.departamento);


    }
}
