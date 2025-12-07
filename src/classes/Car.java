package classes;

public record Car(String brand, String model, String color) {
    public String getInfo(){
        return "Brand: "+ this.brand + "; Model: " + this.model + "; Color:  " + this.color;
    }
}
