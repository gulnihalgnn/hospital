package default_package;


public class NursePersonnel extends BasePersonnel {
	private int salary;

	@Override
	public void setSalary(int salary) {
		if (salary < 3000) {
			this.salary = 3000;
		} else if (salary > 7000) {
			this.salary = 7000;
		} else
			this.salary = salary;
	}

	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public double primCalculator(double primAmount) {
		return primAmount * 30;
	}

}