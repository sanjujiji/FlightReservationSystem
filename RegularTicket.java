public class RegularTicket extends Tickets {
  private boolean foodRequested;
  private boolean waterRequested;
  private boolean snacksRequested;
    
  //Constructor
    RegularTicket(char ticketType, Flights flight, String ticketStatus,boolean foodRequested, boolean waterRequested, boolean snacksRequested){
        super(ticketType, flight, ticketStatus);
        this.foodRequested = foodRequested;
        this.waterRequested = waterRequested;
        this.snacksRequested = snacksRequested;
    }

    //method for special services retrieval
    public String checkSpecialServicesFood(){
        if (this.foodRequested){
            return "Yes";
        }
        else return "No";
    }

    public String checkSpecialServicesWater(){
        if (this.waterRequested){
            return "Yes";
        }
        else return "No";
    }

    public String checkSpecialServicesSnacks(){
        if (this.snacksRequested){
            return "Yes";
        }
        else return "No";
    }

  //setter methods for special services
    public void setSpecialServicesFood(boolean foodRequested){
        this.foodRequested = foodRequested;
    }

    public void setSpecialServicesWater(boolean waterRequested){
        this.waterRequested = waterRequested;
    }

    public void setSpecialServicesSnacks(boolean snacksRequested){
        this.snacksRequested = snacksRequested;
    }
}
