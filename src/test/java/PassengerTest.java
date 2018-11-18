import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flight;
    Plane plane;

    @Before
    public void setUp() {
        passenger = new Passenger("Joe");
        flight = new Flight("BA21", "Singapore", "LHR", LocalDate.parse("2018-11-30"));
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetFlightNo__notAssigned() {
        assertEquals("not assigned", passenger.getPassengerFlightNo());
    }

    //should these tests be here in PassengerTest or in FlightTest(the methods are called in Flight - addPassenger method)
    @Test
    public void canSetPassengerFlightNo() {
        flight.addPassenger(passenger, plane);
        assertEquals("BA21", passenger.getPassengerFlightNo());
    }

//    how to test for random number? Test if numbner is within a range?
//    @Test
//    public void canSetPassengerSeatNo(){
//        flight.addPassenger(passenger, plane);
//    }

//    @Test
//    public void doesntDoubleBookSeatNumber() {
//    }
}
