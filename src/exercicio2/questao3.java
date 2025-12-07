package exercicio2;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite num1: ");
        int num1 = sc.nextInt();
        int num2 = 0;
        while (!(num2 > num1)){
            System.out.print("Digite num2 : ");
            num2 = sc.nextInt();
        }

        System.out.print("Escolha entre ímpar ou par (1: impar; 2: par): ");
        var option = sc.nextInt();
        switch (option){
            case 1:
                int inicio_impar = num1 % 2 == 0 ? num1 + 1 : num1;
                for (int i = inicio_impar; i < num2; i += 2) {
                    System.out.println(i);
                }
                break;
            case 2:
                int inicio_par = num1 % 2 != 0 ? num1 + 1 : num1;
                for (int i = inicio_par; i < num2; i += 2) {
                    System.out.println(i);
                }
                break;
        }


    }
}
