package uso_interface;

public class Produto {
    private final String name;
    private final double price;
    private final boolean inactive;

    public Produto(String name, double price, boolean inactive) {
        this.name = name;
        this.price = price;
        this.inactive = inactive;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isInactive() { return inactive; }

    @Override
    public String toString() {
        return name + " | RS " +  price;
    }
}
