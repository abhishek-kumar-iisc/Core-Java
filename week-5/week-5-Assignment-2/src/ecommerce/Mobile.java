package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Mobile  implements Comparable<Item>{
	private List<Item> items = new ArrayList<Item>();
	int mobileItemId=0;

	public Mobile(Item items) {
		++this.mobileItemId;
		this.items.add(items);	
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getMobileItemId() {
		return mobileItemId;
	}

	public void setMobileItemId(int mobileItemId) {
		this.mobileItemId = mobileItemId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + mobileItemId;
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
		Mobile other = (Mobile) obj;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (mobileItemId != other.mobileItemId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mobile [items=" + items + ", mobileItemId=" + mobileItemId + "]";
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class SmartPhones extends Mobile{
	private List<Item> items = new ArrayList<Item>();

	public SmartPhones(Item items) {
		super(items);
	}
}

class Tablets extends Mobile{
	private List<Item> items = new ArrayList<Item>();
	public Tablets(Item items) {
		super(items);
	}
}

class BasicModel extends Mobile{
	private List<Item> items = new ArrayList<Item>();

	public BasicModel(Item items) {
		super(items);
	}
}