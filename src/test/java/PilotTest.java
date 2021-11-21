import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;
    Pilot pilot2;


    @Before
    public void setUp(){
        pilot = new Pilot ("Joan Jet", Ranking.FirstOfficer, "WR233456432");
        pilot2 = new Pilot ("Daniel Day", Ranking.FirstOfficer, null);
    }

    @Test
    public void hasLicence(){
        assertEquals(true, pilot.readyToFly());
    }

    @Test
    public void noLicence(){
        assertEquals(false, pilot2.readyToFly());
    }

}
