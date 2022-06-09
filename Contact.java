public class Contact {
//private attributes for the Contact class
    private String name;
    private String phoneNumber;
    private String emailId;

    //constructor for this class
    public Contact(String name, String phoneNumber, String emailId){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    //getter methods for getting the Contact details

    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getEmailId(){
        return this.emailId;
    }
    
    //setter methods for updating the Contact details
    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
    
    
}
