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

    public double totalBaggageWeightAllowance(){
        return getFlightPlaneWeight() / 2;
    }

    public double baggageAllowancePerPassenger(){
        return totalBaggageWeightAllowance() / flight.getPlane().getCapacity();
    }

    public double bookedBaggageWeight() {
        return flight.numberOfPassengersBooked() * baggageAllowancePerPassenger();
    }

    public double remainingAvailableBaggageWeight() {
        return totalBaggageWeightAllowance() - bookedBaggageWeight();
    }

}


