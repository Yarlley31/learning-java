package exercicio4.exercicio2.classes;

public class Adm extends Users {
    public Adm(String name, String email, int password) {
        super(name, email, password, true);
    }


    public void generateFinancialReport() {
        System.out.println("Generating Financial Report...");
        System.out.println("Financial Report by adm: " + this.name);
    }

    public void checkSales() {
        System.out.println("adm: " + this.name + " checking sales");
    }
}
