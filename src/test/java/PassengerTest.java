import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Meredith", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Meredith", passenger.getName());
    }

    @Test
    public void canGetBags(){
        assertEquals(2, passenger.getBags());
    }
}
