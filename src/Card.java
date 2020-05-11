public class Card 
{
	private String name;
	
	public Card() {
		name = "";
	}
	
	public Card(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isExpired() {
		return false;
	}
	
	public String format() {
		return "Card holder: " + name;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}