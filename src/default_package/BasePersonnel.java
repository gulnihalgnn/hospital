package default_package;


public class BasePersonnel {
	private int id;
	private String name;
	private String surname;
	private int salary;
	private String position;
	private double primAmount;
	private String startDate;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrimAmount(double primAmount) {
		this.primAmount = primAmount;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getSalary() {
		return salary;
	}

	public String getPosition() {
		return position;
	}

	public double getPrimAmount() {
		return primAmount;
	}

	public int getId() {
		return id;
	}

	public void getAllCard() {
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
		System.out.println("Surname is " + surname);
		System.out.println("Salary is " + getSalary());
		System.out.println("Position is " + position);
		System.out.println("Prim is " + primAmount);
		System.out.println("Personnel starting year is " + startDate);
		System.out.println("-----------------------");
	}

	public double primCalculator(double primAmount) {
		return 0;
	};

}
