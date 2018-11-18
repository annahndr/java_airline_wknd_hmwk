import java.time.LocalDate;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private LocalDate departureTime;

    public Flight(String flightNo, String destination, String departureAirport, LocalDate departureTime) {
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public int getNoOfPassengers(){
        return this.passengers.size();
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void addPassenger(Passenger passenger, Plane plane) {
        if (plane.getPlaneCapacity() - this.getNoOfPassengers() >= 1) {
            this.passengers.add(passenger);
            passenger.setPassengerFlightNo(this);
//            passenger.setSeatNumber();
        }
    }

    public int availableSeats(Plane plane) {
        return plane.getPlaneCapacity() - this.getNoOfPassengers();
    }
}
