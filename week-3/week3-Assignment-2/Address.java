public class Address{
    private int flatNumber;
    private String street;
    private String city;
    private String State;
    private int pinCode;

    public Address(int flatNumber,String street, String city, String state, int pinCode){
        this.flatNumber = flatNumber;
        this.street     = street;
        this.city       = city;
        this.State      = state;
        this.pinCode    = pinCode;
    }
}