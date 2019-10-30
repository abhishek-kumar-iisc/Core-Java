public class Fashion extends DataModel{

    public Fashion(int id, String name, String desciption ,int price){
        super(id,name,desciption, price);
    }

}


class cloths extends Fashion{
    int price = 2000;
    public cloths(int id, String name, String desciption, int price){
        super(id,name,desciption, price);
    }

    public int checkCost(){
        System.out.println("The price of Samsung is" + this.price);
        return this.price;
    }
    
}

class cosmetics extends Fashion{
    int price = 500;
    public cosmetics(int id,String name, String desciption, int price){
        super(id, name, desciption, price);
    }

    public int checkCost(){
        System.out.println("The price of Samsung is" + this.price);
        return this.price;
    }
    
}