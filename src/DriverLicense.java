import java.util.Calendar;
import java.util.GregorianCalendar;
public class DriverLicense extends Card{
	
	GregorianCalendar calendar = new GregorianCalendar();

	public int expYear;
	
	
	
	public DriverLicense(int expYear) {
		super();
		this.expYear = expYear;
	}



	public boolean isExpired() {
		if (expYear < calendar.get(Calendar.YEAR)) {
			return true;
		}
		else
			return false;
	}



	@Override
	public String toString() {
		return "DriverLicense [expYear=" + expYear + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((calendar == null) ? 0 : calendar.hashCode());
		result = prime * result + expYear;
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
		DriverLicense other = (DriverLicense) obj;
		if (calendar == null) {
			if (other.calendar != null)
				return false;
		} else if (!calendar.equals(other.calendar))
			return false;
		if (expYear != other.expYear)
			return false;
		return true;
	}
	
	
}
