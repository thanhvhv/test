
public class DVDUtils {
	public static void compareByCost(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(dvd1.getCost() < dvd2.getCost()) {
			System.out.println(dvd1.getTitle() + " is cheaper than " + dvd2.getTitle());
		} 
		else if(dvd1.getCost() > dvd2.getCost()) {
			System.out.println(dvd1.getTitle() + " is more expensive than " + dvd2.getTitle());
		}
		else {
			System.out.println(dvd1.getTitle() + dvd2.getTitle() + " have same prive.");
		}
	}
	
	public static void compareByTitle(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		int compareTitle = dvd1.getTitle().compareTo(dvd2.getTitle());
		if(compareTitle == 0) {
			System.out.println("2 disc in same title.");
		} 
		else if(compareTitle < 0) {
			System.out.println(dvd1.getTitle() + " before " + dvd2.getTitle() + " in dictionary order.");
		}
		else {
			System.out.println(dvd1.getTitle() + " after " + dvd2.getTitle() + " in dictionary order.");
		}
	}
	
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] dvd) {
		for(int i = 0; i < dvd.length; i++) {
			for(int j = i + 1; j < dvd.length; j++) {
				if(dvd[i].getCost() > dvd[j].getCost()) {
					DigitalVideoDisc tmp = dvd[i];
					dvd[i] = dvd[j];
					dvd[j] = tmp;
				}
			}
		}
		return dvd;
	}
	
	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] dvd) {
		for(int i = 0; i < dvd.length; i++) {
			for(int j = i + 1; j < dvd.length; j++) {
				if(dvd[i].getTitle().compareTo(dvd[j].getTitle()) > 0) {
					DigitalVideoDisc tmp = dvd[i];
					dvd[i] = dvd[j];
					dvd[j] = tmp;
				}
			}
		}
		return dvd;
	}
	
	
}
