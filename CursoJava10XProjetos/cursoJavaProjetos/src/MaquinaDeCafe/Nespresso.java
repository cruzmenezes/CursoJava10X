package MaquinaDeCafe;

public class Nespresso implements MaquinaCafe{

    @Override
    public void preparaCafe() {
        System.out.println(" preparando café...");
    }

    @Override
    public void limpar() {
        System.out.println("limpando maquina de café");
    }
}
