package exercicio4.exercicio2.classes;

public class Attendant extends Users {
    private double cashValue;

    public Attendant(String name, String email, int password) {
        super(name, email, password, false);
        this.cashValue = 0.0;
    }

    public void reciveCash(double cash) {
        this.cashValue += cash;
        System.out.println("CASH RECEIVED: " + cash);
    }

    public void closeCash() {
        System.out.println("Fechando o caixa com o valor total de; " + this.cashValue);
        this.cashValue = 0.0;
    }

    public double getCashValue() {
        return cashValue;
    }

}
