import java.util.Scanner;

public class arithmeticOperators {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Float num1 = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        Float num2 = sc.nextFloat();

        System.out.printf("%s + %s = %s\n", num1, num2, num1 + num2);
        System.out.printf("%s - %s = %s\n", num1, num2, num1 - num2);
        System.out.printf("%s * %s = %s\n", num1, num2, num1 * num2);
        System.out.printf("%s / %s = %s\n", num1, num2, num1 / num2);
        System.out.printf("%s %% %s = %s\n", num1, num2, num1 % num2);

        System.out.printf("raiz de %s é %s\n", num1, Math.sqrt(num1));
        System.out.printf("%s ao quadrado é %s\n", num1, Math.pow(num1, 2));

        int value = 50;
        System.out.println(++value);
        System.out.println(value);

        int value2 = 40;
        System.out.println(value2++);
        System.out.println(value2);

    }
}
