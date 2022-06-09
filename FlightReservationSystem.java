import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FlightReservationSystem {
    


    public static void main(String args[]){

        
    
        System.out.println("Do you want to book a ticket? Please register yourself (Yes/No) : ");
        Scanner input = new Scanner(System.in);
        String response = input.next();
        //flight input variables
        String flightNumberIn, airlineIn,departureLocationIn, destinationLocationIn,departureDateTimeIn, arrivalDateTimeIn;
        

        //add flights
        //convert the strings containing date fields to date fields
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        LocalDateTime departureDate = LocalDateTime.parse("06/23/2022 16:30", inputFormat);
        LocalDateTime arrivalDate = LocalDateTime.parse("06/23/2022 18:30", inputFormat);

        Flights flight1=new Flights("6E122", "Indigo", 100,  0, "Mumbai", "Bangalore", departureDate, arrivalDate, 4500.50f);
        
        LocalDateTime departureDate1 = LocalDateTime.parse("06/24/2022 16:30", inputFormat);
        LocalDateTime arrivalDate1 = LocalDateTime.parse("06/23/2022 17:30", inputFormat);

        Flights flight2 = new Flights("6E134", "Indigo", 150,  0, "Mumbai", "Ahmedabad", departureDate1,arrivalDate1, 3000.00f);



        if (response.equals("Yes"))
        {

            //registering a new Passenger
            Passenger passenger = new Passenger("Sanju","+91-9999999999","x@gmail.com","Borivali East","Mumbai","Maharashtra");
            //System.out.println(passenger.getContactDetails());
            //book Ticket
            System.out.println("Do you want to book Regular ticket or Tourist ticket (R/T) :");
            char ticketType = input.next().charAt(0);
            
                //Get the details of the flight from the user
                System.out.print("Please provide the Flight Number :");
                System.out.println();
                flightNumberIn = input.nextLine();
                System.out.println();
                System.out.print("By which airline do you want to fly :");
                airlineIn = input.nextLine();
                System.out.println();
                System.out.print("Departure Location :");
                departureLocationIn = input.nextLine();
                System.out.println();
                System.out.print("Destination Location :");
                destinationLocationIn = input.nextLine();
                System.out.println();
                System.out.print("Departure Date & Time :");
                departureDateTimeIn = input.nextLine();
                System.out.println();
                System.out.println("Arrival Date & Time : ");
                arrivalDateTimeIn = input.nextLine();

                

                if ((flightNumberIn == flight1.getFlightNumber()) && (airlineIn == flight1.getAirline()) && (departureLocationIn == flight1.getDepartureLocation()) && (LocalDate.parse(departureDateTimeIn,inputFormat) == flight1.getDeparturDateTime())){

                    passenger.bookTicket(flight1,ticketType);
                }    
                else if ((flightNumberIn == flight2.getFlightNumber()) && (airlineIn == flight2.getAirline()) && (departureLocationIn == flight2.getDepartureLocation()) && (LocalDate.parse(departureDateTimeIn,inputFormat) == flight2.getDeparturDateTime())){
                    passenger.bookTicket(flight2,ticketType);
                }
            }
               


    }
    
}
