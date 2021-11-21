public class Plane {
    private String model;
    private int capacity;
    private double weight;

    public Plane(String model, int capacity, double weight) {
        this.model = model;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
