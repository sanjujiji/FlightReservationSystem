import java.util.Date;
public class Passenger {
    public Address address;
    public Contact contact;
    private int passengerId;
    public Tickets ticket;
    public RegularTicket regularTicket;
    public TouristTicket touristticket;
    

    //Constructor for class Passenger
    Passenger(String name, String phoneNumber, String emailId, String streetAddress, String city, String state ){
        contact  = new Contact(name, phoneNumber, emailId);
        address = new Address(streetAddress, city, state);
    }
    
    //methods for Passenger class
    //Get contact and address details
    public String getContactDetails(){
        return "Name : " + contact.getName() + ", Phone :" +contact.getPhoneNumber() + ", Email id : " + contact.getEmailId();
    }

    public String getAddressDetails(){
        return "Street : " + address.getStreetAddress() + ", City :" +address.getCity() + ", State : " + address.getState();

    }

    //update Contact and AddressDetails
    public void setContactDetails(String name, String phoneNumber, String emailId){
        if (name!=""){
            contact.setName(name);
        }
        if (phoneNumber != ""){
            contact.setPhoneNumber(phoneNumber);
        }
        if (emailId != ""){
            contact.setEmailId(emailId);
        }
    }

    public void setAddressDetails(String streetAddress, String city, String state){
        if (streetAddress != ""){
            address.setStreetAddress(streetAddress);
        }
        if (city != ""){
            address.setCity(city);
        }
        if (state != ""){
            address.setState(state);
        }
    }


    // public int ticketId;
    // public String ticketType;
    // public int pnrNumber;
    // public Flights flight;
    // public float ticketPrice;
    // public String seatNumber;
    // public String ticketStatus;
    //book ticket method

    public void bookTicket(Flights flight, char ticketType)
    {
        //check for seat availability
        int seatsAvailable;
        ticket = new Tickets();
        seatsAvailable = ticket.checkSeatAvailability(flight);

        if (seatsAvailable>0){
           
            ticket.bookTicket(ticketType);
        }
        else System.out.println("Tickets are not available");



        if (ticketType == 'R'){
            regularTicket = new RegularTicket('Regular',)


        }


    }


   
    
}
