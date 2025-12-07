package exercicio4.exercicio1.classes;

public class ingressos {
    protected String movieName;
    protected boolean isDubbed;
    protected double value;

    public ingressos(String movieName, boolean isDubbed, double value) {
        this.movieName = movieName;
        this.isDubbed = isDubbed;
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

}
