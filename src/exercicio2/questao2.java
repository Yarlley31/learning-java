package exercicio2;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite sua peso: ");
        double peso = sc.nextDouble();

        var imc = peso/(altura*altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc > 18.5 && imc < 25) {
            System.out.println("Peso ideal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Levemente acima do peso");
        }  else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II (severa).");
        } else {
            System.out.println("Obesidade grau III (mó.");
        }
    }
}
