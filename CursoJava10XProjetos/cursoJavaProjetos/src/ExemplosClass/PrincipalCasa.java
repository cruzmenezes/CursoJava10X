package ExemplosClass;

public class PrincipalCasa {
    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();

        System.out.println("== as caracterisca da sua casa ==");
        casa.metragem = 1000;
        casa.numeroQuarto = 4;
        casa.numeroBanheiro = 4;
        casa.material = "tijolo ecologico";
        casa.corCasa = "branco";

        casa.construir();
        casa.pintar();

        int resultado = casa.somarMetragem();
        System.out.println("O resultado: " + resultado);




    }
}
