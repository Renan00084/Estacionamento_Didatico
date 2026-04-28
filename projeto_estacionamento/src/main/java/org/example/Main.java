package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    do{
        System.out.println("\n--- MENU ESTACIONAMENTO ---");
        System.out.println("1. Registrar Entrada");
        System.out.println("2. Registrar Saída");
        System.out.println("3. Exibir Vagas Livres");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch(opcao){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:

        }
    }while (opcao != 4);
    System.out.println("O usuário saiu do sistema");

    }
}
