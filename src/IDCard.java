
public class IDCard extends Card {

	int idNum;
	
	public IDCard(String n, int id) {
		super(n);
		idNum = id;
	}
	
	@Override
	public String format() {
		String cardHolder = super.format();
		String output = (cardHolder + " ID Num: " + idNum);
		return output;
	}
	
	public boolean isExpired() {
		return false; 
		}

	@Override
	public String toString() {
		return "IDCard [idNum=" + idNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + idNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		IDCard other = (IDCard) obj;
		if (idNum != other.idNum)
			return false;
		return true;
	}
	
	
}
