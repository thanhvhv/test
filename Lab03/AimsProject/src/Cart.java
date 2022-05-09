
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered > 18) {
			System.out.println("The cart is almost full.");
		}
		else {
			itemOrdered[qtyOrdered++] = disc;
			System.out.println("The disc has been added.");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int temp = 0;
		for(int i = 0; i <= qtyOrdered; i++) {
			if(disc.equals(itemOrdered[i])) {
				temp = 1;
				for(int j = i; j <= qtyOrdered; j++) {
					itemOrdered[j] = itemOrdered[j+1];
				}
				qtyOrdered--;
				break;
			}
		}
		if(temp == 1) {
			System.out.println("Remove successfull.");
		} else {
			System.out.println("Not found item.");
		}
	}
	
	public float totalCost() {
		float sum = 0f;
		for(int i = 0; i < qtyOrdered; i++) {
			sum += itemOrdered[i].getCost();
		}
		return sum;
	}
}
