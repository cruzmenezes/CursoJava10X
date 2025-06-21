package ControleRemoto;

public class TvLG implements ControleRemoto{

    @Override
    public void ligar() {
        System.out.println("Ligando TV LG...");
    }

    @Override
    public void mudarCanal(int canal) {
        System.out.println(" Mudando o canal " + canal + " TV LG");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume da TV LG...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV LG");
    }
}
