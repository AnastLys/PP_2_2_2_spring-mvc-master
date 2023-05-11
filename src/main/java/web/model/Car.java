package web.model;

public class Car {
    private String model;
    private String brand;
    private String color;

    public Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
