
public class FlightManager {

    public FlightManager (){
    }

    // calculate how much baggage weight should be reserved for each passenger for a flight
    public int getBagAllowancePerPassenger(Plane plane){
        return plane.getBaggageCapacity() / plane.getPlaneCapacity();
    }

    //calculate how much weight in baggage is booked by passengers for a flight
    public int getBookedBaggageWeight(Flight flight, Plane plane){
        return this.getBagAllowancePerPassenger(plane) * flight.getNoOfPassengers();
    }

    //calculate how much overall weight reserved for baggage remains for a flight
    public int getRemainingReservedBaggage(Flight flight, Plane plane) {
        return plane.getBaggageCapacity() - this.getBookedBaggageWeight(flight, plane);
    }



}
