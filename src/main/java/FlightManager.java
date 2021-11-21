public class FlightManager {
    private Plane plane;

    public FlightManager(Plane plane) {
        this.plane = plane;
    }

    public Plane getPlane() {
        return plane;
    }

    public double getWeightAllowance(){
        return getPlane().getWeight();
    }

    public int getCapacity(){
        return getPlane().getCapacity();
    }

    public double baggageAllowancePerPassenger(){
        double totalBaggageWeight = getWeightAllowance() / 2;
        return totalBaggageWeight / getCapacity();

    }
}


