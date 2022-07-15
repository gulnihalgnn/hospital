package default_package;


class DoctorPersonnel extends BasePersonnel {
	private int salary;

	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public void setSalary(int salary) {
		if (salary < 7000) {
			System.out.println(" Yanlış girdin");///
			this.salary = 7000;
		} else
			this.salary = salary;
	}

	public double primCalculator(double primAmount) {
		return primAmount * 55;
	}

}
