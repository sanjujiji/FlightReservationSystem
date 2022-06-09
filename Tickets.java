import java.util.Random;
import java.util.Date;

public class Tickets {
    public int ticketId;
    public String ticketType;
    public int pnrNumber;
    public float ticketPrice;
    public String seatNumber;
    public String ticketStatus;

    Random rand = new Random();

    Tickets(){

    }
   

    //constructor for Class Tickets
    Tickets(String ticketType, float ticketPrice, String seatNumber, String ticketStatus){

        this.ticketId = seatNumber.hashCode();
        this.ticketType = ticketType;
        this.pnrNumber = rand.nextInt();
        this.flight  = flight;
        this.ticketPrice = flight.ticketPrice;
        this.seatNumber = seatNumber;
        this.ticketStatus = ticketStatus;
    }

    //check for seat availability

        public int checkSeatAvailability(Flights flight){
            return flight.checkSeatAvailability(flight);
        }

    public void bookTicket(char ticketType){
        this(ticketType,flight.ticketPrice,
    }

    

    
}
