		
public class Aims {
	public static void main(String[] args) {
		Order anOrder = new Order();
		//		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation","Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
			
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation","A", 87, 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		//
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		//test
		System.out.println(dvd1.getCost());
		dvd1 = anOrder.removeDigitalVideoDisc(dvd1);
		if(dvd1 != null)
			System.out.println(dvd1.getCost());
		else
			System.out.println("da xoa!");
		}
}