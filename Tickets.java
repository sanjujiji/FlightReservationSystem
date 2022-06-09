import java.util.Random;
import java.util.Date;

public class Tickets {
    private int ticketId;
    private char ticketType;
    private int pnrNumber;
    private float ticketPrice;
    private String seatNumber;
    private String ticketStatus;
    private Flights flight;

    Random rand = new Random();
    private final String alphabet="ABCDEF";
    char randomChar = alphabet.charAt(rand.nextInt(6));



    //constructor for Class Tickets
    Tickets(char ticketType, Flights flight, String ticketStatus){

        this.ticketId = seatNumber.hashCode();
        this.ticketType = ticketType;
        this.pnrNumber = rand.nextInt();
        this.flight  = flight;
        this.ticketPrice = flight.getTicketPrice();
        this.seatNumber = flight.getNoOfSeatsBooked()+1+"-"+randomChar;
        this.ticketStatus = ticketStatus;
    }
       

    

    
}
