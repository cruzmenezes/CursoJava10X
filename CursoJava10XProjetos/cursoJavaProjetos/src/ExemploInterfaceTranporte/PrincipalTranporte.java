package ExemploInterfaceTranporte;

public class PrincipalTranporte {
    public static void main(String[] args) {


        Transporte t = new Onibus();

        System.out.println("===== Iniciando =====");

        t.ligar();
        t.percorrerTrajeto();
        t.parada();
        t.iniciaTrajeto();
        t.fimDoTrajeto();
        t.desligar();
    }
}
