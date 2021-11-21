import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane("Boeing 747", 366, 70000);
        flight = new Flight("BA345", "LAX", "1130", plane);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void checkPlaneWeightLimit() {
        assertEquals(70000, flightManager.getFlightPlaneWeight(), 0.1);
    }

    @Test
    public void checkPassangerBaggageLimit(){
        assertEquals(95.6, flightManager.baggageAllowancePerPassenger(), 0.1);
    }

}


