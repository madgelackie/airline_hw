public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getFlightPlaneWeight(){
        return flight.getPlane().getWeight();
    }

    public double baggageAllowancePerPassenger(){
        double totalBaggageWeight = getFlightPlaneWeight() / 2;
        return totalBaggageWeight / flight.getPlane().getCapacity();
    }


}


