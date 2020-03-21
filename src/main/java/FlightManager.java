public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }
/*   calculate how much baggage weight should be reserved
      FOR EACH passenger on a flight
      & calculate how much baggage weight is booked by passengers of a flight
 */
    public int checkRequiredBaggageWeight(){
        int baggageWeight = 0;
        for (Passenger passenger: this.flight.getBookedPassengers()){
            baggageWeight += (passenger.getBags() * 5);
        }
        return baggageWeight;
    }

//    calculate how much overall weight reserved for baggage remains for a flight
    public int checkRemainingBaggageWeight(){
        return this.flight.getPlane().getWeight() - this.checkRequiredBaggageWeight();
    }
}
