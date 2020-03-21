import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    public Flight flight1;
    public Flight flight2;
    public Plane plane1;
    public Plane plane2;
    public Passenger passenger1;
    public Passenger passenger2;
    public Passenger passenger3;
    public Passenger passenger4;


    @Before
    public void before(){
        passenger1 = new Passenger("Meredith",2);
        passenger2 = new Passenger("Barry",4);
        passenger3 = new Passenger("Chip",400);
        passenger4 = new Passenger("Dale",100);
        plane1 = new Plane (PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.PRIVATEPLANE);
        flight1 = new Flight(plane1, 456, "HNL", "GLA", "20.00");
        flight2 = new Flight(plane2, 777, "LHR", "GLA", "21.45");
    }

    @Test
    public void flightCanReturnSeats(){
        assertEquals(5, flight2.getAvailableSeats());
    }

    @Test
    public void bookAPassenger(){
        flight1.bookAPassenger(passenger1);
        assertEquals(1, flight1.getBookedPassengers().size());
    }

    @Test
    public void dontBookPassengerIfNoSeats(){
        flight2.bookAPassenger(passenger1);
        flight2.bookAPassenger(passenger2);
        flight2.bookAPassenger(passenger2);
        flight2.bookAPassenger(passenger3);
        flight2.bookAPassenger(passenger4);
        flight2.bookAPassenger(passenger4);
        assertEquals(5, flight2.getBookedPassengers().size());
    }
}
