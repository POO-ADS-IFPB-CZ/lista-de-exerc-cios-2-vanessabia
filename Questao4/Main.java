package Questao4;

import java.util.Scanner;
/**
 *
 * @author vanessa
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Informe o nome do titular: ");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;
        do {
            System.out.println("\n---------- Menu ---------------");
            System.out.println("1. Saque");
            System.out.println("2. Depósito");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");
            System.out.println("-------------------------------");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a sacar: ");
                    float valorSaque = scanner.nextFloat();
                    conta.sacar(valorSaque);
                    break;
                case 2:
                    System.out.print("Digite o valor a depositar: ");
                    float valorDeposito = scanner.nextFloat();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
