import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FlightReservationSystem {
    public static void main(String args[]) {

        System.out.print("Do you want to book a ticket? Please register yourself (Yes/No) : ");
        Scanner input = new Scanner(System.in);
        String response = input.next();
        // flight object variables
        String flightNumberIn, airlineIn, departureLocationIn, destinationLocationIn, departureDateTimeIn;

        // convert the strings containing date fields to date fields
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        LocalDateTime departureDate = LocalDateTime.parse("06/23/2022 16:30", inputFormat);
        LocalDateTime arrivalDate = LocalDateTime.parse("06/23/2022 18:30", inputFormat);

        Flights flight1 = new Flights("6E122", "Indigo", 100, 0, "Mumbai", "Bangalore", departureDate, arrivalDate, 4500.50f);

        LocalDateTime departureDate1 = LocalDateTime.parse("06/24/2022 16:30", inputFormat);
        LocalDateTime arrivalDate1 = LocalDateTime.parse("06/24/2022 18:00", inputFormat);

        Flights flight2 = new Flights("6E134", "Indigo", 150, 0, "Mumbai", "Ahmedabad", departureDate1, arrivalDate1,3000.00f);

        if (response.equals("Yes")) {
            // registering a new Passenger
            Passenger passenger = new Passenger("Charlie", "+91-9999999999", "charlie@gmail.com", "Vooburg","The Hague", "Den Haag");

            // book Ticket
            System.out.print("Do you want to book Regular ticket or Tourist ticket (R/T) :");
            char ticketType = input.next().charAt(0);

            // Get the details of the flight from the user
            System.out.print("Please provide the Flight Number :");
            input.nextLine();
            flightNumberIn = input.nextLine();
            System.out.print("By which airline do you want to fly :");
            airlineIn = input.nextLine();
            System.out.print("Departure Location :");
            departureLocationIn = input.nextLine();
            System.out.print("Destination Location :");
            destinationLocationIn = input.nextLine();
            System.out.print("Departure Date & Time :");
            departureDateTimeIn = input.nextLine();

            // check if the flight attributes matches the user attributes
            try{
            if ((flightNumberIn.equals(flight1.getFlightNumber())) && (airlineIn.equals(flight1.getAirline()))
                    && (departureLocationIn.equals(flight1.getDepartureLocation()))
                    && (LocalDateTime.parse(departureDateTimeIn, inputFormat).equals(flight1.getDeparturDateTime()))) {
                        passenger.bookTicket(flight1, ticketType);
            } else if ((flightNumberIn.equals(flight2.getFlightNumber())) && (airlineIn.equals(flight2.getAirline()))
                    && (departureLocationIn.equals(flight2.getDepartureLocation()))
                    && (LocalDateTime.parse(departureDateTimeIn, inputFormat).equals(flight2.getDeparturDateTime()))) {
                        passenger.bookTicket(flight2, ticketType);
            } else
                System.out.println("No matching flights");
        }catch(Exception e){
            System.out.println("Something went wrong!");
        } 
        }

        // initiate 2 ticket objects
        RegularTicket regTicket = new RegularTicket('R', flight1, "Confirmed", true, true, true);
        TouristTicket tourTicket = new TouristTicket('T', flight2, "Confirmed", "Hotel Oberoi", "Borivali East","Mumbai", "Maharashtra");

        System.out.println("This is for Checkpoint-5");
        printTicketDetails(regTicket);
        printTicketDetails(tourTicket);

        //close the input stream
        input.close();

    }

    public static void printTicketDetails(Tickets ticket) {
        ticket.printTicket(ticket);
    }

}
