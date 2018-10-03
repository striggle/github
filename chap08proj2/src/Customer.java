

public class Customer extends Person {

	public String customerNumber;

	public Customer(String customerNumber) {
		super(customerNumber, customerNumber);
		this.customerNumber = customerNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + "]";
	}

}