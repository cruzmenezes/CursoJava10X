package ExemplosClass;

public class PlantaCasa {
    int metragem;
    int numeroQuarto;
    int numeroBanheiro;
    String corCasa;
    String material;

    public void construir(){
        System.out.println("metragem: " + metragem);
        System.out.println("Numero de quartos: " + numeroQuarto);
        System.out.println("Numero de banheiro: " + numeroBanheiro);
        System.out.println("Material utilizado: " + material);
    }


    public void pintar(){
        System.out.println("Cor da casa: " + corCasa);

    }

    public  int somarMetragem(){
        return metragem * numeroBanheiro + numeroBanheiro;
    }
}

//teste