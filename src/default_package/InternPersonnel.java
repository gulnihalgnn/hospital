package default_package;


public class InternPersonnel extends BasePersonnel {
	private int salary;

	@Override
	public void setSalary(int salary) {
		if (salary > 3000) {
			this.salary = 3000;
		} else
			this.salary = salary;
	}

	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public double primCalculator(double primAmount) {
		return primAmount * 17;
	}

}