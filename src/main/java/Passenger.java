import java.util.Random;

public class Passenger {

    private String name;
    private int bag;
    private String passengerFlightNo;
    private int seatNumber;

    public Passenger(String name){
        this.name = name;
        this.bag = 1;
        this.passengerFlightNo = "not assigned";
        this.seatNumber = 0;
    }

    public String getPassengerFlightNo() {
        return passengerFlightNo;
    }

    public void setPassengerFlightNo(Flight flight){
        this.passengerFlightNo = flight.getFlightNo();
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    //how to make sure it doesn't double book the same seat number??
//    public void setSeatNumber() {
//        Random randNumber = new Random();
//        int newSeat = randNumber.nextInt(6);
//        this.seatNumber = newSeat;
//    }

}
