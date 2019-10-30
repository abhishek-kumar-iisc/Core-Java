public class Seller{
    private int id;
    private String name;
    private Address address;
    private String contactDetails;

    public Seller(int id, String name, Address address, String contactDetails){
        this.id   = id;
        this.name = name;
        this.address = address;
        this.contactDetails = contactDetails;
    }
    
}

class Flipkart extends Seller{
    private int numItems=4; //Item count
    private AppleMobile applemobile1 = new AppleMobile(1, "Apple-1", "64GB", 50000);
    private AppleMobile applemobile2 = new AppleMobile(1, "Apple-2", "128GB", 50000);

    public Flipkart(int id, String name, Address address, String contactDetails){
        super(id,name,address,contactDetails);
    }

    public void itemCount(){
        System.out.println("Number of Item available");
        System.out.println(this.numItems);
    }

    public int getNumItems(){
        return this.numItems;
    }
}

class Amazon extends Seller{
    private int numItems=4; //Item count
    private Samsung samsungmobile1 = new Samsung(1, "Samsung-1", "64GB", 50000);
    private Samsung samsungmobile2 = new Samsung(1, "Apple-2", "128GB", 50000);
    public Amazon(int id, String name, Address address, String contactDetails){
        super(id,name,address,contactDetails);
    }
    public void itemCount(){
        System.out.println("Number of Item available");
        System.out.println(this.numItems);
    }

}