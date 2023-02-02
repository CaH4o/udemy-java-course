package study;

public class Employee extends Person {
	private String title;
	private String employer;
	private char employerGrade;
	private int salary;

	public Employee(String name, String email, String phone, String title, String employer, char employerGrade,
			int salary) {
		super(name, email, phone);
		this.title = title;
		this.employer = employer;
		this.employerGrade = employerGrade;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("%s\nEmployee:\n Title: %s;\n Employer: %s (%s);\n Salary: %d.", super.toString(),
				this.title, this.employer, this.employerGrade, this.salary);
	}
}
