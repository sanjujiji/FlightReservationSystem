public class TouristTicket {
    private String[] touristLocations = new String[5];
    private String hotelName;
    
    //Constructor
    TouristTicket(String touristLocation, String hotelName){
        this.touristLocations[0] = touristLocation;
        this.hotelName = hotelName;
    }

    public void addTouristLocation(String touristLocation){
        for (int i =0; i< touristLocations.length;i++){
            if (touristLocations[i] == null){
                touristLocations[i] = touristLocation;
            }
        }
    }

    public void deleteTouristLocation(String touristLocation){
        for (int i =0; i< touristLocations.length;i++){
            if (touristLocations[i] == touristLocation){
                touristLocations[i] = "";
            }
        }
    }

}
