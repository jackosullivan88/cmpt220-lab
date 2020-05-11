
public class CallingCard extends Card{
	
	String phoneNum;
	
	

	public CallingCard(String phoneNum) {
		super();
		this.phoneNum = phoneNum;
	}



	public boolean isExpired() {
			return false;
	}



	@Override
	public String toString() {
		return "CallingCard [phoneNum=" + phoneNum + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((phoneNum == null) ? 0 : phoneNum.hashCode());
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
		CallingCard other = (CallingCard) obj;
		if (phoneNum == null) {
			if (other.phoneNum != null)
				return false;
		} else if (!phoneNum.equals(other.phoneNum))
			return false;
		return true;
	}
	
	
}
