package exercicio2;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        while(true){
            System.out.print("Digite o segundo número: ");
            int numInformado = sc.nextInt();
            if(numInformado < num){
                System.out.printf("Informe um número maior que %s\n", num);
            } else if (numInformado % num == 0){
                System.out.printf("%s %% %s = %s\n", numInformado, num, numInformado % num);
            } else {
                System.out.printf("%s %% %s = %s\n", numInformado, num, numInformado % num);
                break;
            }
        }
    }
}
