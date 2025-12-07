package uso_interface;

import java.util.ArrayList;
import java.util.List;


public class Loja {
    static void main() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook Gamer", 4500.00, false));
        produtos.add(new Produto("Mouse Quebrado", 15.00, true));
        produtos.add(new Produto("Cabo HDMI", 25.00, false));
        produtos.add(new Produto("Monitor 4k", 1200.00, false));
        produtos.add(new Produto("Teclado Velho", 50.00, true));

        System.out.println("Lista de produtos:");
        produtos.forEach(System.out::println);

        produtos.removeIf(Produto::isInactive);

        System.out.println("\nApós remover produtos inativos: ");
        produtos.forEach(System.out::println);

        produtos.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));

        System.out.println("\nApós order produtos por preço: ");
        produtos.forEach(System.out::println);

        System.out.println("\nFiltrando os baratos (< 100): ");

        produtos.stream()
                .filter(p -> p.getPrice() < 100)
                .forEach(p -> System.out.println("Promoção: " + p.getName()));


    }
}
