package ecommerce;

public class Item implements Comparable<Item>{

	private static int id=1000;
    private String name;
    private String description;
    private double price;
    
	public Item() {}
	public Item(String name, String description, double price){
		++this.id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Item.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
