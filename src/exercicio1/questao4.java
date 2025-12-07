package exercicio1;

import java.util.Scanner;

public class questao4 {
     public static void main(String[] args) {
         var sc = new Scanner(System.in);

         System.out.println("Digite o seu nome: ");
         String nome = sc.nextLine();
         System.out.println("Digite a sua idade: ");
         int idade = Integer.parseInt(sc.nextLine());

         System.out.println("Digite o seu nome: ");
         String nome2 = sc.nextLine();
         System.out.println("Digite a sua idade: ");
         int idade2 = sc.nextInt();

         System.out.printf("A diferença entre as idades entre %s e %s é: %s", nome, nome2, idade - idade2);
     }
}
