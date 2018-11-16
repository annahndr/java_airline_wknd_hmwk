import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger1;
    Passenger passenger2;
    Flight flight;
    Plane plane;

    @Before
    public void before(){
        passenger1 = new Passenger("Jane", 2);
        passenger2 = new Passenger("Al", 1);
        flight = new Flight("BA132", "Paris","LHR", "1pm" );
        plane = new Plane(PlaneType.AIRBUSA300); // capacity 1
    }

    @Test
    public void canCountPassengers() {
        assertEquals(0, flight.getNoOfPassengers());
    }

    @Test
    public void canReturnAvailableSeats() {
        flight.addPassenger(passenger1, plane);
        assertEquals(1, flight.availableSeats(plane));
    }

    @Test
    public void canBookAPassenger__withSpace() {
        flight.addPassenger(passenger1, plane);
        assertEquals(1, flight.getNoOfPassengers());
    }

    @Test
    public void cantBookAPassenger_noSpace() {
        flight.addPassenger(passenger1, plane);
        flight.addPassenger(passenger2, plane);
        assertEquals(1, flight.getNoOfPassengers());

    }
}
