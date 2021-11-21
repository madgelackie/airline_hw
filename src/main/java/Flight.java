import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureTime;
    private Plane plane;

    public Flight(String flightNumber, String destination, String departureTime, Plane plane) {
        this.plane = plane;
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int numberOfPassengersBooked(){
        return passengers.size();
    }

    public int availableSeats(){
        return plane.getCapacity() - numberOfPassengersBooked();
    }

    public void addPilot(Pilot pilot) {
        if (pilot.readyToFly() == true){
        this.pilots.add(pilot);}
    }

    public boolean checkPlaneHasPilot() {
        if (pilots.size() > 0){
            return true;
        } else {
            return false;
        }
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addCabinCrew(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public String crewGiveMessage(CabinCrewMember cabinCrewMember) {
        if (cabinCrewMembers.contains(cabinCrewMember)) {
            return cabinCrewMember.relayMessage();
        } else return null;
    }
}