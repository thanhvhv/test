package hust.soict.globalict.aims.Aims;

import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class DiskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Fast and Furious 8", "Action", "Vin Diesel", 1, 67.5f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Harry Potter", "Fantasy", "J. K. Rowling", 7, 120f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Tay Du Ky", "Fantasy", "Tang Tam Anh", 25, 32f);
		anOrder.addDigitalVideoDisc(dvd3);

		anOrder.searchForDvds();
	}

}
