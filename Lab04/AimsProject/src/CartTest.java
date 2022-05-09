
public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Fast and Furious 8", "Action", "Vin Diesel", 1, 67.5f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Harry Potter", "Fantasy", "J. K. Rowling", 7, 120f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Tay Du Ky", "Fantasy", "Tang Tam Anh", 25, 32f);
		cart.addDigitalVideoDisc(dvd3);
		
		cart.sortByCost();
		
		cart.sortByTitle();
		
		cart.searchID();
	}

}
