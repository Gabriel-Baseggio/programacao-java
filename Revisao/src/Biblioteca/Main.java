package Biblioteca;

import Biblioteca.Usuarios.Cliente;
import Biblioteca.Usuarios.Usuario;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static Usuario usuarioLogado;

    public static void main(String[] args) {

        System.out.println("Bem-vindo à Biblioteca");

        System.out.print("""
                1 - Cadastro de Usuário
                2 - Login
                3 - Sair
                Escolha sua opção: 
                """);

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1 -> cadastroUsuario();
            case 2 -> login();
            case 3 -> System.exit(0);
            default -> System.out.println("Opção inválida!");
        }


    }

    private static void cadastroUsuario() {
        System.out.println("");
        Usuario usuario = new Cliente("", "", "");
        Usuario.addUsuario(usuario);

    }

    private static void login() {
        do{
            System.out.println("");
            usuarioLogado = Usuario.login("", "");
        }while (usuarioLogado == null);
        menuUsuario();
    }

}
