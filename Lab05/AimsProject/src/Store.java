import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBER_DVDS = 1000;
	private int qtyDvds = 0;
	DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[MAX_NUMBER_DVDS];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyDvds > MAX_NUMBER_DVDS) {
			System.out.println("The store is almost full.");
		}
		else {
			itemInStore[qtyDvds++] = disc;
			System.out.println("The disc has been added.");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int temp = 0;
		for(int i = 0; i <= qtyDvds; i++) {
			if(disc.equals(itemInStore[i])) {
				temp = 1;
				for(int j = i; j <= qtyDvds; j++) {
					itemInStore[j] = itemInStore[j+1];
				}
				qtyDvds--;
				break;
			}
		}
		if(temp == 1) {
			System.out.println("Remove successfull.");
		} else {
			System.out.println("Not found item.");
		}
	}

}
