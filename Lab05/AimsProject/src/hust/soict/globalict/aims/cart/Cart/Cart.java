package hust.soict.globalict.aims.cart.Cart;
import java.util.Scanner;

import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc; 
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered > 19) {
			System.out.println("The cart is almost full.");
		}
		else {
			itemOrdered[qtyOrdered++] = disc;
			System.out.println("The disc has been added.");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		int i = 0, DiscAdded = 0, DiscNotAdded = 0;
		while (dvdList[i] != null) {
			addDigitalVideoDisc(dvdList[i]);
			i++;
			if(qtyOrdered > 19) {
				DiscNotAdded++;
			} else {
				DiscAdded++;
			}
		}
		System.out.printf("Have %d have been added.\n", DiscAdded);
		System.out.printf("Have %d have not been added.", DiscNotAdded);
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(qtyOrdered > 19) {
			System.out.println("The cart is almost full. So no discs added.");
		} 
		else if(qtyOrdered > 18) {
			System.out.println("The cart is only 1 space left. So only disc 1 added.");
			itemOrdered[qtyOrdered++] = dvd1;
		}
		else {
			System.out.println("Both discs have been added.");
			itemOrdered[qtyOrdered++] = dvd1;
			itemOrdered[qtyOrdered++] = dvd2;
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
	
	public  void sortByCost() {
		int count = 1;
		float sum = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			for(int j = i + 1; j < qtyOrdered; j++) {
				if(itemOrdered[i].getCost() > itemOrdered[j].getCost()) {
					DigitalVideoDisc tmp = itemOrdered[i];
					itemOrdered[i] = itemOrdered[j];
					itemOrdered[j] = tmp;
				}
			}
		}
		System.out.println("***********************CART***********************");
		System.out.println("Ordered items by price:");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(count + "." + " DVD - " + itemOrdered[i].toString());
			count++;
			sum += itemOrdered[i].getCost();
		}
		System.out.println("Total cost: " + sum);
		System.out.println("***************************************************");
	}
	
	public void sortByTitle() {
		int count = 1;
		float sum = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			for(int j = i + 1; j < qtyOrdered; j++) {
				if(itemOrdered[i].getTitle().compareTo(itemOrdered[j].getTitle()) > 0) {
					DigitalVideoDisc tmp = itemOrdered[i];
					itemOrdered[i] = itemOrdered[j];
					itemOrdered[j] = tmp;
				}
			}
		}
		System.out.println("***********************CART***********************");
		System.out.println("Ordered items by title:");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(count + "." + " DVD - " + itemOrdered[i].toString());
			count++;
			sum += itemOrdered[i].getCost();
		}
		System.out.println("Total cost: " + sum);
		System.out.println("***************************************************");
	}
	
	public void searchID() {
		int count = 1;
		int id_search;
		int cmp = 1;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		id_search = sc.nextInt();
		if(id_search > 100000 || id_search < 0) {
			System.out.println("***********************CART***********************");
			System.out.println("No DVD is found.");
			System.out.println("***************************************************");
		} 
		else {
			while(id_search < 100000) {
				id_search *= 10;
				cmp *= 10;
			}
			id_search = id_search / cmp;
			System.out.println("***********************CART***********************");
			System.out.println("Search items have ID : " + id_search);
			for(int i = 0; i < qtyOrdered; i++) {
				if(itemOrdered[i].getId() / cmp == id_search) {
					System.out.println(count + "." + "ID: " + itemOrdered[i].getId() + " DVD - " + itemOrdered[i].toString());
					count++;
					temp = 1;
				}
			}
			if(temp == 0) {
				System.out.println("No DVD is found.");
			}
			System.out.println("***************************************************");
		}
		
	}
	
	public void searchForDvds() {
		int count = 1;
		String title_search;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title: ");
		title_search = sc.nextLine();
		System.out.println("***********************CART***********************");
		System.out.println("Search items have title : " + title_search);
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemOrdered[i].isMatch(title_search)) {
					System.out.println(count + "." + itemOrdered[i].toString());
				count++;
				temp = 1;
			}
		}
		if(temp == 0) {
			System.out.println("No DVD is found.");
		}
		System.out.println("***************************************************");
	}
}
