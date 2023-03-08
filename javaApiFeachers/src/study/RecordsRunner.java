package study;

public class RecordsRunner {

	record Person(String name, String email, String phoneNumber) {
	}

	record PersonWithConstructorAndMethods(String name, String email, String phoneNumber) {
		// constructor
		/*
		 * PersonWithConstructorAndMethods(String name, String email, String
		 * phoneNumber) { if (name == "Admin") throw new
		 * IllegalArgumentException("name is admin");
		 * 
		 * this.name = name; this.email = email; this.phoneNumber = phoneNumber; }
		 */

		// Compact constructor
		PersonWithConstructorAndMethods {
			if (name == "Admin")
				throw new IllegalArgumentException("name is admin");
		}

		public String name() {
			System.out.println("Logic");
			return this.name;
		}
	}

	public static void main(String[] args) {
		Person person = new Person("Ole", "Ole@gmail.com", "123-456-789");
		System.out.println(person.name);
		System.out.println(person);

		Person person1 = new Person("Ole", "Ole@gmail.com", "123-456-789");
		Person person2 = new Person("Ole2", "Ole@gmail.com", "123-456-789");
		System.out.println(person.equals(person1));
		System.out.println(person.equals(person2));

	}

}
