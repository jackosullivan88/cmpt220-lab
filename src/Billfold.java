
public class Billfold extends Card{
	Card card1, card2;
	
	public int getExpiredCardCount(Card[] cards) {
		int count = 0;
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].isExpired()){
				count++;
			}
		}
		
		return count;
	}
	
	public void addCard(Card c) {
		if (card1 == null) {
			card1 = c;
		}
		else if (card2 == null) {
			card2 = c;
		}
	}
	
	public String formatCards() {
		String output = "[";
		if (card1 != null) {
			output += card1.format();
		}
		output += "|";
		if (card2 != null) {
			output += card2.format() ;
		}
		output += "]";
		return output;
	}
}
