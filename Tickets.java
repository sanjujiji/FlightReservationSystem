import java.util.Random;
import java.util.Date;
import java.lang.Math;

public abstract class Tickets {
    private int ticketId;
    private char ticketType;
    private int pnrNumber;
    private float ticketPrice;
    private String seatNumber;
    private String ticketStatus;
    private Flights flight;

    //Random number being generated for PNR assignment
    Random rand = new Random();
    private final String alphabet="ABCDEF";
    char randomChar = alphabet.charAt(rand.nextInt(6));

    //constructor for Class Tickets
    Tickets(char ticketType, Flights flight, String ticketStatus){
        this.ticketId = alphabet.hashCode();
        this.ticketType = ticketType;
        this.pnrNumber = rand.nextInt();
        this.flight  = flight;
        this.ticketPrice = flight.getTicketPrice();
        this.seatNumber = flight.getNoOfSeatsBooked()+1+"-"+randomChar;
        this.ticketStatus = ticketStatus;
    }

    public void cancelTicket(){
        this.ticketStatus = "Cancelled";
        flight.cancelSeats();
    }
       
    public void printTicket(Tickets ticket){
        if (ticket instanceof RegularTicket){
            System.out.println("PNR number : "+Math.abs(ticket.pnrNumber)+" for Regular ticket");
        }
        if (ticket instanceof TouristTicket){
            System.out.println("PNR number : "+Math.abs(ticket.pnrNumber)+" for Tourist ticket");
        }
    }    
}
