import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(String flightNo, String destination, String departureAirport, String departureTime) {
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public int getNoOfPassengers(){
        return this.passengers.size();
    }


    public void addPassenger(Passenger passenger, Plane plane) {
        if (plane.getPlaneCapacity() - this.getNoOfPassengers() >= 1) {
            this.passengers.add(passenger);
        }
    }

    public int availableSeats(Plane plane) {
        return plane.getPlaneCapacity() - this.getNoOfPassengers();
    }
}
