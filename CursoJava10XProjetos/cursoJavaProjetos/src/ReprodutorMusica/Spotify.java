package ReprodutorMusica;

public class Spotify implements Reprodutor {

    @Override
    public void tocar() {
        System.out.println("tocando música no spotify");
    }

    @Override
    public void pausar() {
        System.out.println("pausando a musica...");
    }

    @Override
    public void parar() {
        System.out.println("parando a musica...");
    }
}
