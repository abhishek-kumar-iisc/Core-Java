public class Client{
    public static void main(String args[]){
        /* Client details */
        Address address = new Address(102, "NN-Street", "Banglore", "Karnataka", 560012);
        User user1 = new User(007, "Abhishek", address, "99999999999");
        user1.checkUserDetails();
        
        
        //Seller Details
        Address sellerFlipkartAddress = new Address(100, "flipkart ", "Banglore", "Karnataka", 560012);
        Flipkart flipkart = new Flipkart(0, "flipkart", sellerFlipkartAddress, "wwww.flip.com");

        AppleMobile apple = new AppleMobile(1, "iPhone", "64GN", 100000);

        user1.addItem("ABHC", 100, flipkart);
        user1.checkcart();


        /*Address sellerAmazonAddress = new Address(100, "flipkart ", "Banglore", "Karnataka", 560012);
        Amazon amazon = new Amazon(1, "amazon", sellerAmazonAddress, "www.amazon.com");*/


    }
}