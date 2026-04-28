package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;
    String entradaOpcao;

    do{
        System.out.println("\n--- MENU ESTACIONAMENTO ---");
        System.out.println("1. Registrar Entrada");
        System.out.println("2. Registrar Saída");
        System.out.println("3. Exibir Vagas Livres");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");

        entradaOpcao = scanner.nextLine().trim(); //.trim = limpa espaços em branco no começo ou no fim
        try{
            opcao = Integer.parseInt(entradaOpcao);

        }catch (NumberFormatException e){
            System.out.println("Erro : " + e.getMessage());
            System.out.println("Entrada Invalida, Digite numeros entre 1 e 4");
            System.out.println("Tente novamemte");
            continue;

        }

        switch(opcao){
            case 1:

            break;
            case 2:

            break;
            case 3:

            break;
            case 4:
                System.out.println("Saindo...");
            break;
            default:
                System.out.println("Comando nao identificado, tente novamente");
            break;

        }
    }while (opcao != 4);
    System.out.println("O usuário saiu do sistema");

    }
}
