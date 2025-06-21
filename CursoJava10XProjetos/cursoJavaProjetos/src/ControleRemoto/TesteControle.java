package ControleRemoto;

public class TesteControle {
    public static void main(String[] args) {
        ControleRemoto controle1 = new TVSamsung();
        ControleRemoto controle2 = new TvLG();


        System.out.println("=== Controle Samsung ===");
        controle1.ligar();
        controle1.aumentarVolume();
        controle1.mudarCanal(59);
        controle1.desligar();
        System.out.println("---------");

        System.out.println("=== Controle LG ===");
        controle2.ligar();
        controle2.mudarCanal(21);
        controle2.aumentarVolume();
        controle2.desligar();
    }
}