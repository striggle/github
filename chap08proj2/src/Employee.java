
public class Employee extends Person {

	public String ssn;

	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return firstName + lastName + "/n" + "SSN: " + ssn;
	}

	
}
