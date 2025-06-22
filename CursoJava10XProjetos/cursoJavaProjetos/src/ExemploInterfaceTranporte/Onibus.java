package ExemploInterfaceTranporte;

public class Onibus implements Transporte {

    @Override
    public void ligar() {
        System.out.println("Motorista ligando o Onibus!! ");
    }

    @Override
    public void percorrerTrajeto() {
        System.out.println("Motorista inicia o trajeto....");
    }

    @Override
    public void parada() {
        System.out.println("Motorista apos duas horas de viagem faz uma parada obrigatoria...");

    }

    @Override
    public void iniciaTrajeto() {
        System.out.println("Iniciando viagem...");
    }

    @Override
    public void fimDoTrajeto() {
        System.out.println("Chegada...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando onibus...");
    }
}
