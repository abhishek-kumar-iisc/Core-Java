package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Fashion implements Comparable<Item>{
		private List<Item> items = new ArrayList<Item>();
		private static int fashionItemId=100;
		
		public Fashion(Item items) {
			++fashionItemId;
			this.items.add(items);	
		}

		public List<Item> getItems() {
			return items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}
		
		public static int getFashionItemId() {
			return fashionItemId;
		}

		public static void setFashionItemId(int fashionItemId) {
			Fashion.fashionItemId = fashionItemId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((items == null) ? 0 : items.hashCode());
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
			Fashion other = (Fashion) obj;
			if (items == null) {
				if (other.items != null)
					return false;
			} else if (!items.equals(other.items))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Fashion [items=" + items + "]";
		}

		@Override
		public int compareTo(Item o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
}
class WesternWear extends Fashion{
		private List<Item> items = new ArrayList<Item>();

		public WesternWear(Item items) {
			super(items);
		}
}

class EthnicWear extends Fashion{
	private List<Item> items = new ArrayList<Item>();

		public EthnicWear(Item items) {
			super(items);
		}
}

class PartyWear extends Fashion{
	private List<Item> items = new ArrayList<Item>();
	
		public PartyWear(Item items) {
			super(items);
		}
}
