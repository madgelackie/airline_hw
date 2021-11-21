import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember = new CabinCrewMember("Kate", Ranking.PURSER);
    }

    @Test
    public void checkMessage(){
        assertEquals("Please fasten your seatbelt", cabinCrewMember.relayMessage());
    }

}
