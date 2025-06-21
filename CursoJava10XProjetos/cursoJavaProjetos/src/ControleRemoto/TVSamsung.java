package ControleRemoto;

public class TVSamsung implements ControleRemoto {

    @Override
    public void ligar(){
        System.out.println("Ligando a Tv Samgung.....");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume de TV Samsung.....");
    }

    @Override
    public void mudarCanal(int canal) {
        System.out.println("Mudando para o canal " + canal + "na tv Samsung");

    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV Samsung");
    }
}