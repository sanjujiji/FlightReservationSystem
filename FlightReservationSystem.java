import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FlightReservationSystem {
    


    public static void main(String args[]){

        Flights flight1 = new Flights();
        Flights flight2 = new Flights();
    
        System.out.println("Do you want to book a ticket? Please register yourself (Yes/No) : ");
        Scanner input = new Scanner(System.in);
        String response = input.next();
        //flight details
        String flightNumber, airline,departureLocation, destinationLocation,departureDateTime, arrivalDateTime;
        

        //add flights
        flight1.addFlights("6E122", "Indigo", 100,  0, "Mumbai", "Bangalore", "06/23/2022 16:30:00", "06/23/2022 18:30:00", 4500.50f);

        flight2.addFlights("6E134", "Indigo", 150,  0, "Mumbai", "Ahmedabad", "06/24/2022 16:30:00", "06/24/2022 17:30:00", 3000.00f);



        if (response.equals("Yes"))
        {

            //registering a new Passenger
            Passenger passenger = new Passenger("Sanju","+91-9999999999","x@gmail.com","Borivali East","Mumbai","Maharashtra");
            //System.out.println(passenger.getContactDetails());
            //book Ticket
            System.out.println("Do you want to book Regular ticket or Tourist ticket (R/T) :");
            char ticketType = input.next().charAt(0);
            if (ticketType == 'R'){
                //Get the details of the flight from the user
                System.out.print("Please provide the Flight Number :");
                flightNumber = input.nextLine();
                System.out.println();
                System.out.print("By which airline do you want to fly :");
                airline = input.nextLine();
                System.out.println();
                System.out.print("Departure Location :");
                departureLocation = input.nextLine();
                System.out.println();
                System.out.print("Destination Location :");
                destinationLocation = input.nextLine();
                System.out.println();
                System.out.print("Departure Date & Time :");
                departureDateTime = input.nextLine();
                System.out.println();
                System.out.println("Arrival Date & Time : ");
                arrivalDateTime = input.nextLine();

                //convert the strings containing date fields to date fields
                DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
                LocalDate departureDate = LocalDate.parse(departureDateTime, inputFormat);
                LocalDate arrivalDate = LocalDate.parse(arrivalDateTime, inputFormat);

                if ((flightNumber == flight1.flightNumber) && (airline == flight1.airline) && (departureLocation == flight1.departureLocation) 
                && (departureLocation == flight1.departureLocation) && (departureDateTime == flight1.departureDateTime))
                passenger.bookTicket(flight1,ticketType);
                else if ((flightNumber == flight2.flightNumber) && (airline == flight2.airline) && (departureLocation == flight2.departureLocation) 
                && (departureLocation == flight2.departureLocation) && (departureDateTime == flight2.departureDateTime)){
                    passenger.bookTicket(flight2,ticketType);
                }
            }
        }
        else{
            System.out.println("To be written further");
        }


    }
    
}
