package exercicio3;

import exercicio3.classes.bankAccount;
import javax.swing.*;
import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Digite o seu Id: ");
        int id = sc.nextInt();

        var bankAccount = new bankAccount(id);


        int continuar = 1;
        while (continuar != 0) {
            System.out.println("Opções do banco: ");
            System.out.print(
                    "1. Consultar saldo; \n" +
                    "2. Consultar cheque especial\n" +
                    "3. Depositar; \n" +
                    "4. Sacar; \n" +
                    "5. Pagar um boleto \n" +
                    "6. Verificar se cheque especial ativado; \n" +
                    "7. Sair; \n" );

            // uma interface de input
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção"));
            switch (opcao) {
                case 1:
                    System.out.println("R$ " + bankAccount.getBalance());
                    bankAccount.setOverdraft(bankAccount.getBalance() < 0);
                    break;
                case 2:
                    System.out.println(bankAccount.isOverdraft());
                    break;
                case 3:
                    System.out.print("Digite qual o valor a ser depositado: ");
                    var addBalance = sc.nextDouble();
                    bankAccount.setBalance(addBalance);
                    break;
                case 4:
                    System.out.print("Digite qual o valor a ser sacado: ");
                    var saque = sc.nextDouble();
                    bankAccount.setBalance(bankAccount.getBalance() - saque);
                    break;
                case 5:
                    System.out.print("Digite qual o valor do boleto: ");
                    var boletoValue = sc.nextDouble();
                    bankAccount.setBalance(bankAccount.getBalance() - boletoValue);
                    break;
                case 6:
                    System.out.println("Aqui está a situação do cheque especial");
                    System.out.println(bankAccount.isOverdraft());
                    break;
                case 7:
                    continuar = 0;
                    break;
                default:
                    System.out.println("Opção inválida: ");
                    break;
            }

        }

    }
}
