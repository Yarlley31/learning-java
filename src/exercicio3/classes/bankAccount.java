package exercicio3.classes;

public class bankAccount {
    private int id;
    private double balance;
    private boolean overdraft;


    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOverdraft() {
        return this.overdraft;
    }
    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }


    public bankAccount(int id) {
        this.id = id;
        this.balance = 0;
        this.overdraft = false;
    }
}
