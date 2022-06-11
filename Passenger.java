import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;

public class Passenger {
    private Address address;
    private Contact contact;
    private int passengerId;
    private static int idCounter;

    // nested class Address
    private static class Address {

        // class variables for Address
        private String streetAddress;
        private String city;
        private String state;

        // constructor
        public Address(String streetAddress, String city, String state) {
            this.streetAddress = streetAddress;
            this.city = city;
            this.state = state;
        }

        // getter methods for getting the values of the address
        public String getStreetAddress() {
            return this.streetAddress;
        }

        public String getCity() {
            return this.city;
        }

        public String getState() {
            return this.state;
        }

        // setter methods for updating the address
        public void setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }

    }

    // nested class Contact
    private static class Contact {
        // private attributes for the Contact class
        private String name;
        private String phoneNumber;
        private String emailId;

        // constructor for this class
        public Contact(String name, String phoneNumber, String emailId) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
        }

        // getter methods for getting the Contact details
        public String getName() {
            return this.name;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getEmailId() {
            return this.emailId;
        }

        // setter methods for updating the Contact details
        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }

    // Constructor for class Passenger
    Passenger(String name, String phoneNumber, String emailId, String streetAddress, String city, String state) {
        contact = new Contact(name, phoneNumber, emailId);
        address = new Address(streetAddress, city, state);
        this.passengerId = idCounter;
        idCounter++;
    }

    // methods for Passenger class
    // Get contact and address details
    public String getContactDetails() {
        return "Name : " + contact.getName() + ", Phone :" + contact.getPhoneNumber() + ", Email id : "+ contact.getEmailId();
    }

    public String getAddressDetails() {
        return "Street : " + address.getStreetAddress() + ", City :" + address.getCity() + ", State : "+ address.getState();
    }

    // Get the count of Passenger objects
    public int getPassengerCount() {
        return Passenger.idCounter;
    }

    public void bookTicket(Flights flight, char ticketType) {
        
        int seatsAvailable;
        String response, foodRequested, waterRequested, snacksRequested;
        boolean foodRequestedIn = false, waterRequestedIn = false, snacksRequestedIn = false;
        Scanner input = new Scanner(System.in);

        // check for seat availability
        seatsAvailable = flight.checkSeatAvailability();
        //if seats are available create the ticket objects based on Regular / Tourist
        if (seatsAvailable > 0) {
            if (ticketType == 'R') {
                System.out.print("Do you want Special Services (Yes/No) :");
                response = input.next();
                if (response.equals("Yes")) {
                    System.out.print("Food Requested (Yes/No) :");
                    foodRequested = input.next();
                    System.out.print("Water Requested (Yes/No) :");
                    waterRequested = input.next();
                    System.out.print("Snacks Requested (Yes/No) :");
                    snacksRequested = input.next();
                    foodRequestedIn = (foodRequested.equals("Yes") ? true : false);
                    waterRequestedIn = (waterRequested.equals("Yes") ? true : false);
                    snacksRequestedIn = (snacksRequested.equals("Yes") ? true : false);
                }

                RegularTicket regularTicket = new RegularTicket('R', flight, "Confirmed", foodRequestedIn,
                        waterRequestedIn, snacksRequestedIn);
                flight.updateNoOfSeats();
                regularTicket.getTicketDetails(flight);
               
            }

            if (ticketType == 'T') {
                String hotelName, hotelStreet, hotelCity, hotelState;
                System.out.println("Please provide the hotel details:");
                System.out.print("Hotel Name :");
                hotelName = input.nextLine();
                System.out.print("Hotel Street :");
                hotelStreet = input.nextLine();
                System.out.print("Hotel city:");
                hotelCity = input.nextLine();
                System.out.print("Hotel State:");
                hotelState = input.nextLine();
                TouristTicket touristTicket = new TouristTicket('T', flight, "Confirmed", hotelName, hotelStreet,
                        hotelCity, hotelState);
                flight.updateNoOfSeats();
                touristTicket.addTouristLocation();
                touristTicket.getTicketDetails(flight);
            }
        }
        else System.out.println("Seats are not available");
        input.close();
    }
}
