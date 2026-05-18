package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;
    String entradaOpcao;

    Estacionamento estacionamento = new Estacionamento(10);

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
                int vaga, cont = 1;
                String placa, modelo;

                System.out.println("Digite o numero da placa:");
                modelo = scanner.nextLine();

                System.out.println("Digite a placa do carro:");
                placa = scanner.nextLine();

                switch(cont){
                    case 1:
                        Veiculo c1 = new Veiculo (placa, modelo);
                        System.out.println("Digite o a vaga na qual voce deseja estacionar:");
                        vaga = scanner.nextInt();

                        estacionamento.registrarEntrada(c1, vaga);


                }

                System.out.println("Digite o a vaga na qual voce deseja estacionar:");
                vaga = scanner.nextInt();




            break;

            case 2:

            break;

            case 3:
                estacionamento.exibirVagasLivres();

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
