public class RegularTicket {
  public boolean foodRequested;
  public boolean waterRequested;
  public boolean snacksRequested;
    
  //Constructor
    RegularTicket(boolean foodRequested, boolean waterRequested, boolean snacksRequested){
        this.foodRequested = foodRequested;
        this.waterRequested = waterRequested;
        this.snacksRequested = snacksRequested;
    }

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

    public void setSpecialServicesFood(boolean foodRequested){
        this.foodRequested = foodRequested;
    }

    public void setSpecialServicesWater(boolean waterRequested){
        this.waterRequested = waterRequested;
    }

    public void setSpecialServicesSnacks(boolean snacksRequested){
        this.snacksRequested = snacksRequested;
    }

    public void bookTicket(Flights flight){
        //to add code

    }

}
