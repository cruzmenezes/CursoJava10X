package MaquinaDeCafe;

public class PrincipalCafe {
    public static void main(String[] args) {

        MaquinaCafe cafe = new Nespresso();
        MaquinaCafe cafe1 = new CafeteiraTradicional();


        System.out.println("===== Nespresso ======");
        cafe.preparaCafe();
        cafe.limpar();

        System.out.println("===== Tradicional =====");
        cafe1.preparaCafe();
        cafe1.limpar();
    }
}
