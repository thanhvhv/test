
public class DVDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("AA", "aa", "aa", 1, 5.6f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("BB", "bb", "bb", 2, 5.3f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("CC", "cc", "cc", 3, 5f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("DD", "dd", "dd", 4, 7.1f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("EE", "ee", "ee", 5, 3.3f);
		
		DVDUtils.compareByCost(dvd1, dvd2);
		DVDUtils.compareByTitle(dvd3, dvd5);
		
		DigitalVideoDisc[] sorted = DVDUtils.sortByCost(new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4, dvd5});
		System.out.println("Sort by cost:");
		for(int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i].toString());
		}
		sorted = DVDUtils.sortByTitle(new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4, dvd5});
		System.out.println("Sort by title:");
		for(int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i].toString());
		}
	}

}
