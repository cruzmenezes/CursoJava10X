package MaquinaDeCafe;

public class CafeteiraTradicional implements MaquinaCafe{
    @Override
    public void preparaCafe() {
        System.out.println("fazendo café coado...");
    }

    @Override
    public void limpar() {
        System.out.println("lavando coador da cafeteira");
    }
}
