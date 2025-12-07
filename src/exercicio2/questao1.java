package exercicio2;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s * %s = %s\n", num, i, num * i);
        }
    }
}
