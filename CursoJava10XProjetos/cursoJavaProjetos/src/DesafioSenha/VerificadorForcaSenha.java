package DesafioSenha;

import java.util.Scanner;

public class VerificadorForcaSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pegar a senha do usuário
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        // Verificar a força
        int forca = verificarForcaSenha(senha);

        if (forca <= 2) {
            System.out.println("Sua senha é fraca");
        } else {
            System.out.println("Sua senha é forte");
        }

        scanner.close();
    }

    public static int verificarForcaSenha(String senha) {
        int forca = 0;

        if (senha.length() >= 8) forca++;
        if (senha.matches(".*[A-Z].*")) forca++;
        if (senha.matches(".*[0-9].*")) forca++;
        if (senha.matches(".*[!@#$%^&*()_+=<>?{}\\[\\]-].*")) forca++;

        return forca;
    }
}
