package exercicio4.exercicio1.classes;

public class meia extends ingressos{

    public meia(String movieName, boolean isDubbed, double value) {
        super(movieName, isDubbed, value);
    }

    @Override
    public double getValue() {
        double motherValue = super.getValue();
        double discount = 0.5;
        return motherValue - (motherValue * discount);
    }
}
