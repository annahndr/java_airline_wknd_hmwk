import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Passenger passenger1;
    Passenger passenger2;
    Flight flight;
    Plane plane;
    FlightManager flightmanager;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747); // capacity 3, weight 300
        flight = new Flight("BA123", "London", "GLA", LocalDate.parse("2018-11-15"));
        passenger1 = new Passenger("Harry");
        passenger2 = new Passenger("Mara");
        flightmanager = new FlightManager();
    }

    // calculate how much baggage weight should be reserved for each passenger for a flight
    // baggage weight allocated / capacity of flight
    @Test
    public void canCalculateBagAllowancePerPassenger(){
        assertEquals(75, flightmanager.getBagAllowancePerPassenger(plane));
    }

    //calculate how much weight in baggage is booked by passengers for a flight
    @Test
    public void canCalculateBookedBaggageWeight() {
        flight.addPassenger(passenger1, plane);
        assertEquals(50, flightmanager.getBookedBaggageWeight(flight, plane));
    }

    //calculate how much overall weight reserved for baggage remains for a flight
    @Test
    public void canCalculateRemainingReservedBaggageWeight() {
        flight.addPassenger(passenger1, plane);
        assertEquals(100, flightmanager.getRemainingReservedBaggage(flight, plane));
    }
}
