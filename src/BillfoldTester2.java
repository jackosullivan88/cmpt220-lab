
public class BillfoldTester2 {
	public static void main (String[] args)
	{
		CallingCard card1 = new CallingCard("(845)555-5555");
		DriverLicense card2 = new DriverLicense(2012);
		
		Card[] cards = new Card[] {card1, card2};
		
		Billfold bf = new Billfold();
		
		System.out.println(bf.getExpiredCardCount(cards));
	}
}
