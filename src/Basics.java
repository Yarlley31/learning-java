import java.util.Scanner;

public class Basics {

    // exemplo de constante
    private final static String WELCOME_MSG = "Seja bem-vindo: ";

    public static void main(String[] args) {
        // comentários
        /*
        * comentário também
        * */

        // podemos indicar o tipo da variável antes ou apenas escrever var e passar o valor da variável
        var sc = new Scanner(System.in);
//        System.out.print("Digite o seu nome: ");
//        String name = sc.next();
//        System.out.println(WELCOME_MSG + name + "!");
//
//        System.out.print("Informe sua idade: ");
//        int age = sc.nextInt();
//
//        if (age < 18) {
//            System.out.println("você é menor!");
//        } else {
//            System.out.println("Você já é maior!");
//       }
        int result = 1;
        while (result != 0) {
            System.out.print("Quanto é 2 + 2: ");
            result = sc.nextInt();
            if (result == 4) {
                System.out.println("VC acertou!\n");
            } else {
                System.out.println("VC errou!\n");
            }
        }

    }
}
