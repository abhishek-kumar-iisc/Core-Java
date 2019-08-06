public class Mobiles extends DataModel{

    public Mobiles(int id, String name, String desription, int price){
        super(id, name, desription, price);
    }
}

class AppleMobile extends Mobiles{
    private int price = 750000;
    public AppleMobile(int id, String name, String description, int price){
        super(id, name, description, price);
    }

    public int checkCost(){
        System.out.println("The price of Samsung is" + this.price);
        return this.price;
    }
    
}

class Samsung extends Mobiles{
        private int price = 50000;
        
        public Samsung(int id, String name, String description , int price){
            super(id, name, description, price);
        }

        public int checkCost(){
            System.out.println("The price of Samsung is" + this.price);
            return this.price;
        }
        
    }