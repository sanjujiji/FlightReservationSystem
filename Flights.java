import java.util.*;
import java.util.concurrent.TimeUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;


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
        this.ticketPrice = ticketPrice;
        this.journeyDuration = ChronoUnit.HOURS.between(departureDateTime, arrivalDateTime);
    }
   
    //method to print the flight details
    public String getFlightDetails(){
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        return "\tFlight Number : " + this.flightNumber +"\tAirline : "+this.airline +"\tFrom : "+this.departureLocation + "\tTo :" + this.destinationLocation+ "\tFor Date :" +this.departureDateTime.format(outputFormat)+"\tJourney Duration :"+journeyDuration+" hours";
    }

    //method to check the seats availability
    public int checkSeatAvailability(){
        return this.flightCapacity - noOfSeatsBooked;
    }

    //method to update the seats booked attribute whenever a ticket is being created
    public void updateNoOfSeats(){
        this.noOfSeatsBooked++;
    }
    
    //method for ticket cancellation
    public void cancelSeats(){
        this.noOfSeatsBooked = this.noOfSeatsBooked - 1;
    }

    //getter methods
    public int getNoOfSeatsBooked(){
        return this.noOfSeatsBooked;
    }
    public float getTicketPrice(){
        return this.ticketPrice;
}
    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getAirline(){
        return this.airline;
    }

    public String getDepartureLocation(){
        return this.departureLocation;
    }

    public LocalDateTime getDeparturDateTime(){
        return this.departureDateTime;
    }
    
}
