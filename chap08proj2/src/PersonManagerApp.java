
public class PersonManagerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Person Manager App");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String person = Console.getString("Create customer or employee? (c/e): ", "c", "e");
			if (person.equalsIgnoreCase("c")) {
				String firstName = Console.getString("First Name: ");
				String lastName = Console.getString("Last Name: ");
				String customerNumber = Console.getString("Customer Number: ");
				
				
			}

		}
		

	}

}
