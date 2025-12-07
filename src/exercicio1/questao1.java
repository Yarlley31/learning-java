package exercicio1;
import java.time.OffsetDateTime;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var baseYear = OffsetDateTime.now().getYear();
        System.out.print("Digite o seu nome: ");
        String name = sc.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        int birthYear = sc.nextInt();

        System.out.printf("Olá %s, você tem %s anos!", name, baseYear - birthYear);
    }
}
