import java.util.Scanner;

public class LogicaOperators {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite quantos anos voce tem: ");
        int age = sc.nextInt();
        System.out.print("Voce é emancipado?: ");
        boolean isEmancipated = sc.nextBoolean();

        // atribuição direta de uma expressão booleana
        boolean canDrive = age > 17 || (isEmancipated && age >= 16);

        System.out.printf("\nVoce pode dirigir? (%s)", canDrive ? "Sim" : "Nao");
    }
}
