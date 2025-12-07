package exercicio4.exercicio1.classes;

public class familia extends ingressos {
    private final int familyNumber;

    public familia(String movieName, boolean isDubbed, double value, int  familyNumber) {
        super(movieName, isDubbed, value);
        this.familyNumber = familyNumber;
    }

    @Override
    public double getValue() {
        double motherValue = super.getValue();
        double familyPrice = motherValue * familyNumber;
        if (familyNumber > 3) {
            return familyPrice - (familyPrice * .05);
        } else {
            return familyPrice;
        }
    }
}
