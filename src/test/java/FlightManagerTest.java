import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Date date;

    @Before
    public void setUp() {
        date = new Date (2022, 01, 01, 23, 30);
        plane = new Plane("Boeing 747", 366, 70000);
        flight = new Flight("BA345", "LAX", date , plane);
        passenger1 = new Passenger("Anna", 1);
        passenger2 = new Passenger("Bert", 1);
        passenger3 = new Passenger("Cathy", 1);
        passenger4 = new Passenger("David", 1);
        passenger5 = new Passenger("Edna", 1);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void checkPlaneWeightLimit() {
        assertEquals(70000, flightManager.getFlightPlaneWeight(), 0.1);
    }

    @Test
    public void checkTotalBaggageWeightAllowance(){
        assertEquals(35000, flightManager.totalBaggageWeightAllowance(), 0.1);
    }

    @Test
    public void checkPassengerBaggageWeightLimit(){
        assertEquals(95.628, flightManager.baggageAllowancePerPassenger(), 0.1);
    }

    @Test
    public void checkBookedBaggageWeight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        assertEquals(478.14, flightManager.bookedBaggageWeight(), 0.1);
    }

    @Test
    public void checkRemainingAvailableBaggageWeight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        assertEquals(34521.86, flightManager.remainingAvailableBaggageWeight(), 0.1);
    }
}


