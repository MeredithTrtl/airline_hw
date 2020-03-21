import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    public FlightManager flightmanager;
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
        passenger3 = new Passenger("Chip",4);
        passenger4 = new Passenger("Dale",1);
        plane2 = new Plane(PlaneType.PRIVATEPLANE);
        flight2 = new Flight(plane2, 777, "LHR", "GLA", "21.45");
        flight2.bookAPassenger(passenger1);
        flight2.bookAPassenger(passenger2);
        flight2.bookAPassenger(passenger3);
        flight2.bookAPassenger(passenger4);
        flightmanager = new FlightManager(flight2);
    }

//    calculate how much baggage weight should be reserved for each passenger for a flight
//calculate how much baggage weight is booked by passengers of a flight
//calculate how much overall weight reserved for baggage remains for a flight

    @Test
    public void checkRequiredBaggageWeight(){
        assertEquals(55, flightmanager.checkRequiredBaggageWeight());
    }

    @Test
    public void checkRemainingBaggageWeight(){
        assertEquals(145, flightmanager.checkRemainingBaggageWeight());
    }
}
