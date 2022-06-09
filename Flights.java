import java.util.*;
import java.util.concurrent.TimeUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Flights {
    private int flightId;
    private String flightNumber;
    private String airline;
    private static int flightCapacity;
    private static int noOfSeatsBooked;
    private String departureLocation;
    private String destinationLocation;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private long journeyDuration;
    private float ticketPrice;
    public TimeUnit timeUnit;

    

    //Constructor class for Flights
    Flights(String flightNumber, String airline, int flightCapacity, int noOfSeatsBooked, String departureLocation, String destinationLocation,
    LocalDateTime departureDateTime, LocalDateTime arrivalDateTime,float ticketPrice){
       

        this.flightId = flightNumber.hashCode();
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.flightCapacity = flightCapacity;
        this.noOfSeatsBooked = noOfSeatsBooked;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.journeyDuration = ChronoUnit.HOURS.between(departureDateTime, arrivalDateTime);
    }
   
    public String getFlightDetails(String flightNumber, String airline, String destinationLocation, Date departureDateTime){
        return "Flight Number : " + this.flightNumber +" Airline : "+this.airline +" From : "+this.departureLocation + " To :" + this.destinationLocation+ " For Date :" +this.departureDateTime;
    }

    public int checkSeatAvailability(){
        return this.flightCapacity - noOfSeatsBooked;
    }

    public void updateNoOfSeats(){
        this.noOfSeatsBooked++;
    }

    public float getTicketPrice(){
            return this.ticketPrice;
    }

    public int getNoOfSeatsBooked(){
        return this.noOfSeatsBooked;
    }
    //getter methods
    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getAirline(){
        return this.airline;
    }

    public String getDepartureLocation(){
        return this.departureLocation;
    }

    public LocalDate getDeparturDateTime(){
        return this.departureDateTime;
    }
    
}
