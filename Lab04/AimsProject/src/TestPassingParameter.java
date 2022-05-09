
public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swapFail(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
	}
	
	public static void swapFail(Object a, Object b) {
		Object tmp = a;
		a = b;
		b = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String oldTitle = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(oldTitle);
	}
}
