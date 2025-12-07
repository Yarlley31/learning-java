package exercicio1;
import java.util.Scanner;


public class questao2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        int side = sc.nextInt();
        System.out.printf("A área do quadrado é %s\n", side*side);
    }
}
