package IMS;

public class Contact {
    private String name;
    private long phone;
    private String email;

    Contact(String name, long phone, String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }


    private String getContact(){
        return "Name: "+name+"\nPhone Number: "+phone+"\nEmail Address :"+email;
    }
    private void setContact(String name, long phone, String email){

    }

}
