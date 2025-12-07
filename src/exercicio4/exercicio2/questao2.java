package exercicio4.exercicio2;

import exercicio4.exercicio2.classes.Adm;
import exercicio4.exercicio2.classes.Attendant;
import exercicio4.exercicio2.classes.Seller;

public class questao2 {
    static void main() {
        Adm adm = new Adm("Yarlley F.", "yarlleyfernandes9@gmail.com", 2456);

        adm.login();
        adm.generateFinancialReport();
        adm.checkSales();
        adm.logout();

        Seller seller1 = new Seller("Iago S.", "iago89@gmail.com", 6595);
        seller1.login();
        seller1.sell();
        seller1.sell();
        seller1.sell();
        seller1.checkSells();
        int sellQuantity = seller1.getSalesQuantity();
        System.out.println("Sales quantity: " + sellQuantity);
        seller1.logout();

        Attendant atte1 = new Attendant("Joély G.", "joelyburra3@gmail.com", 4321);
        atte1.login();
        atte1.reciveCash(42);
        atte1.reciveCash(15);
        atte1.reciveCash(39);
        double caixa1 = atte1.getCashValue();
        atte1.closeCash();
        atte1.reciveCash(18);
        atte1.reciveCash(25);
        atte1.reciveCash(35);
        double caixa2 = atte1.getCashValue();
        atte1.closeCash();

        System.out.println("Valores do caixa de hoje: caixa 1 = " + caixa1 + "; caixa2 = " + caixa2);
        System.out.println("Valor total dos caixas: " + (caixa1 + caixa2));
        System.out.println("Testando commit do Intellij");
    }
}
