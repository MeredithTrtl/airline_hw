import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private int flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, int flightNo, String destination, String departureAirport, String departureTime) {
        this.bookedPassengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats(){
        return this.plane.getCapacity() - this.bookedPassengers.size();
    }

    public void bookAPassenger(Passenger passenger){
        if (this.getAvailableSeats() > 0){
            this.bookedPassengers.add(passenger);
        }
    }
}
