import java.util.Scanner;
public class TouristTicket extends Tickets{
    private String[] touristLocations = new String[5];
    private String hotelName,hotelStreet, hotelCity, hotelState;
    
    //Constructor
    TouristTicket(char ticketType, Flights flight, String ticketStatus,String hotelName,String hotelStreet,String hotelCity, String hotelState){
        super(ticketType, flight, ticketStatus);
        this.hotelName = hotelName;
        this.hotelStreet = hotelStreet;
        this.hotelCity = hotelCity;
        this.hotelState = hotelState;
    }

    //method to add tourist locations. Only a maximum of 5 are allowed
    public void addTouristLocation(){
        Scanner input = new Scanner(System.in);
        String response, touristLocation;
        System.out.print("Do you want to add Tourist Locations (Yes/No) :");
        response = input.next();

        if (response.equals("Yes")){
            for (int i =0; i< touristLocations.length;i++){
                int j=i+1;
                System.out.print("Enter tourist location "+j+": ");
                if(i==0){
                    input.nextLine();
                }
                touristLocation = input.nextLine();
                if (touristLocations[i] == null){
                    touristLocations[i] = touristLocation;
                }
                if (i<5){
                System.out.print("Do you want to add another(Yes/No)(Only 5 allowed):");
                response = input.nextLine();
                if(response.equals("Yes")){
                    continue;
                }
                else {
                    break;
                }
            }
            }
        }
        input.close();
    }

    //method to delete touristLocations
    public void deleteTouristLocation(){
        Scanner input = new Scanner(System.in);
        String response, touristLocation;

        System.out.println("Do you want to delete Tourist Locations (Yes/No) :");
        response = input.next();

        if (response.equals("Yes")){
            for (int counter=1; counter<=5;counter++){
                System.out.print("Please provide the tourist location to be deleted:");
                touristLocation = input.nextLine();
                for (int i =0; i< touristLocations.length;i++){
                    if (touristLocations[i].equals(touristLocation)){
                        touristLocations[i] = "";
                    }
                
                }
                System.out.println();
                System.out.print("Do you want to delete another(Yes/No):");
                response = input.nextLine();
                if(response.equals("Yes")){
                    continue;
                }
                    else break;              
            }

        }
        input.close();
    }
}
