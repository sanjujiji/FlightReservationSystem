import java.util.*;
import java.util.concurrent.TimeUnit;

public class Flights {
    private int flightId;
    public String flightNumber;
    public String airline;
    public static int flightCapacity = 100;
    public static int noOfSeatsBooked = 0;
    public String departureLocation;
    public String destinationLocation;
    public String departureDateTime;
    public Date arrivalDateTime;
    public long journeyDuration;
    public float ticketPrice;
    public TimeUnit timeUnit;

    
    public void Flights(){

    }
    public void addFlights(String flightNumber, String airline, int flightCapacity, int noOfSeatsBooked, String departureLocation, String destinationLocation, String departureDateTime, String arrivalDateTime, float ticketPrice){
        this.flightId = flightNumber.hashCode();
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.flightCapacity = flightCapacity;
        this.noOfSeatsBooked = noOfSeatsBooked;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.ticketPrice = ticketPrice;
        this.journeyDuration = timeUnit.convert(arrivalDateTime.getTime() - departureDateTime.getTime(),TimeUnit.HOURS);
    }

    public String getFlightDetails(String flightNumber, String airline, String destinationLocation, Date departureDateTime){
        return "Flight Number : " + this.flightNumber +" Airline : "+this.airline +" From : "+this.departureLocation + " To :" + this.destinationLocation+ " For Date :" +this.departureDateTime;
    }

    public int checkSeatAvailability(Flights flight){
        return this.flightCapacity - noOfSeatsBooked;
    }

    public void updateNoOfSeats(){
        this.noOfSeatsBooked++;
    }

    
}
