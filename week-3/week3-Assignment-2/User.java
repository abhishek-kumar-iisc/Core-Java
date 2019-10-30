public class User {
    private int id;
    private String name;
    private Address address;
    private String contactDetails;
    private Cart cart = new Cart();

    public User(int id, String name, Address address, String contactDetails) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    public void addItem(String item, int quantites, Seller seller) {
        this.cart.addToCart(item, quantites, seller);
    }

    public void removeItem(String item, int quantites) {
        this.cart.removeFromCart(item, quantites);
    }

    public void checkUserDetails() {
        System.out.println("User Id is" + this.id);
        System.out.println("Name is " + this.name);
    }

    public void checkcart() {
        this.cart.cartDisplay();

    }

    public void payment(int amount) {

    }

    public void checkOut() {
        // Total Balance
        // Ask for Payment
        // OrderId and Print Screen
        // Update the repestive count in the seller
    }

}

class Cart {
    private int numItems;
    private int quantites[] = new int[10];
    private String items[] = new String[10];
    private int itemIndex;
    private Seller seller;

    public void addToCart(String item, int quantites, Seller seller) {
        this.items[itemIndex] = item;
        System.out.println("Added the item to your cart " + item);
        this.quantites[itemIndex] = quantites;
        System.out.println("Added the quantites to your cart " + quantites);
        this.itemIndex++;
        this.numItems = this.numItems + quantites;
        this.seller = seller;
    }

    public void removeFromCart(String item, int quantites) {
        // Searching the item in my cart
        for (int index = 0; index < this.items.length; index++) {

            if (items[index] == item) {
                // Item was found in the
                if (this.quantites[index] >= quantites) {
                    this.quantites[index] = this.quantites[index] - quantites;
                    this.numItems = this.numItems - quantites;
                    System.out.println("Deleted the item : New quantities is " + this.quantites[index]);

                } else if (this.quantites[index] == 0) {
                    System.out.print("Can not delete the item");
                }
            } else {
                System.out.println("Item not found");
            }

        }
    }

    public void cartDisplay() {
        System.out.println("Total Number of items in the cart is " + this.numItems);
    }
}