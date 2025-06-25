package ReprodutorMusica;

public class PrincipalReprodutor {

    public static void main(String[] args) {

        Reprodutor m = new Spotify();

        m.tocar();
        m.pausar();
        m.parar();
    }
}
