package IMS;

public class Address {
    private String street;
    private  String city;
    private String state;

    Address(String street, String city, String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }

    private String getAddress(){
        return "Street: "+street+"\nCity: "+city+"\nState: "+state;
    }

    private void setAddress(String street, String city, String state){

    }
}
