import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane;
    Pilot pilot;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;

    @Before
    public void setUp() {
        plane = new Plane("Airbus 319-100", 144, 30000.0);
        flight = new Flight("FX543", "LIS", "0930", plane);
        passenger1 = new Passenger("James", 1);
        passenger2 = new Passenger("Stephanie", 1);
        pilot = new Pilot("Janey Jeffrey", Ranking.CAPTAIN, "102938");
        pilot2 = new Pilot ("Daniel Day", Ranking.FirstOfficer, null);
        cabinCrewMember1 = new CabinCrewMember("Lesley", Ranking.FlightAttendant);
        cabinCrewMember2 = new CabinCrewMember("Liz", Ranking.PURSER);

    }

    @Test
    public void numberOfPassengers() {
        assertEquals(0, flight.numberOfPassengersBooked());
    }

    @Test
    public void checkPlaneDetails(){
        assertEquals("Airbus 319-100", flight.getPlane().getModel());
    }

    @Test
    public void checkAvailableSeats(){
        assertEquals(144, flight.availableSeats());
    }

    @Test
    public void pilotAddedIfHasLicence(){
        flight.addPilot(pilot);
        assertEquals(1, flight.getPilots().size());
    }

    @Test
    public void pilotNotAddedNoLicence(){
        flight.addPilot(pilot2);
        assertEquals(0, flight.getPilots().size());
    }

    @Test
    public void checkPilotPresent(){
        flight.addPilot(pilot);
        assertEquals(true, flight.checkPlaneHasPilot());
    }

    @Test
    public void noPilotPresent(){
        assertEquals(false, flight.checkPlaneHasPilot());
    }

    @Test
    public void addPassengerToFlight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.numberOfPassengersBooked());
    }

    @Test
    public void checkCabinCrew(){
        flight.addCabinCrew(cabinCrewMember1);
        flight.addCabinCrew(cabinCrewMember2);
        assertEquals(2, flight.getCabinCrewMembers().size());
    }

    @Test
    public void checkMessageToPassengers(){
       assertEquals("Please fasten your seatbelt", cabinCrewMember1.relayMessage());
    }

    @Test
    public void crewOnPlaneGiveMessage(){
        flight.addCabinCrew(cabinCrewMember1);
        assertEquals("Please fasten your seatbelt", flight.crewGiveMessage(cabinCrewMember1));
    }

    @Test
    public void crewNotOnBoardToGiveMessage(){
        assertEquals(null, flight.crewGiveMessage(cabinCrewMember1));
    }
}

