import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger1;
    Passenger passenger2;
    Flight flight;
    Plane plane;

    @Before
    public void before(){
        passenger1 = new Passenger("Jane");
        passenger2 = new Passenger("Al");
        flight = new Flight("BA132", "Paris","LHR", LocalDate.parse("2018-10-03"));
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
