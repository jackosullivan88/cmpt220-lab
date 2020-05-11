
public class BillfoldTester extends Billfold{
	
	public static void main (String[] args) {
	
	Card card1 = new Card("Mastercard");
	Card card2 = new Card("Visa");
	
	Billfold bf = new Billfold();
	
	bf.addCard(card1);
	bf.addCard(card2);
	
	System.out.println(bf.formatCards());
	//This demonstrates polymorphism as the Card class is used by both Billfold and BillfoldTester.
	}
}
