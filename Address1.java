public class Address1 {
    
    //class variables for Address
    private String streetAddress;
    private String city;
    private String state;

    //constructor
    public Address1(String streetAddress, String city, String state){
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    //getter methods for getting the values of the address
    public String getStreetAddress(){
        return this.streetAddress;
    }

    public String getCity(){
        return this.city;
    }

    public String getState(){
        return this.state;
    }

    //setter methods for updating the address

    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }
    
    public void setCity(String city){
        this.city = city;
    }

    public void setState(String state){
        this.state = state;
    }
    
}
