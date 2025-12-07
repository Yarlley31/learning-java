package exercicio1;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da base do retângulo: ");
        int base = sc.nextInt();
        System.out.print("Digite o tamanho da altura do retângulo: ");
        int altura = sc.nextInt();

        System.out.printf("A área do retângulo de base %s cm e altura %s cm é: %s cm^2", base, altura, base*altura);
    }
}
