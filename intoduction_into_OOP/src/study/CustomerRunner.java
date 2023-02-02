package study;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("jokakatu 1", "Aaneksoki", "44100");
		Customer customer = new Customer("Ole", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("jokakatu 2", "Helsinki", "40100");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
