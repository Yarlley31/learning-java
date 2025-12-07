package exercicio4.exercicio2.classes;

public class Seller extends Users {
    int salesQuantity;

    public Seller(String name, String email, int password) {
        super(name, email, password, false);
        this.salesQuantity = 0;
    }


    public void sell() {
        this.salesQuantity += 1;
        System.out.println("Venda realizada com sucesso!");
    }

    public void checkSells() {
        System.out.println("Total de suas vendas: " + salesQuantity + " vendas");
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }
}